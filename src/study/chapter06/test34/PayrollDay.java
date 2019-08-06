package study.chapter06.test34;


/**
 * 使用策略枚举
 */
public enum PayrollDay {
    /**
     * 星期几
     */
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURADY(PayType.WEEKDAY),
    SUNDAY(PayType.WEEKDAY);

    private final PayType payType;

    PayrollDay(){
        this(PayType.WEEKDAY);
    }

    PayrollDay(PayType payType){
        this.payType = payType;
    }

    int pay(int minutesWorked, int payRate){
        return payType.pay(minutesWorked, payRate);
    }

    private enum PayType{
        /**
         * 计算工资的策略
         */
        WEEKDAY {
            @Override
            int overtimePay(int minsWorked, int payRate){
                return minsWorked <= MINS_PER_SHIFT ? 0 : (minsWorked - MINS_PER_SHIFT) * payRate / 2;
            }
        },
        WEEKEND {
            @Override
            int overtimePay(int minsWorked, int payRate) {
                return minsWorked * payRate;
            }
        };



        abstract int overtimePay(int mins, int payRate);

        private static final int MINS_PER_SHIFT = 8 * 60;

        int pay(int minsWorked, int payRate){
            int basePay = minsWorked * payRate;
            return basePay + overtimePay(minsWorked, payRate);
        }
    }

}
