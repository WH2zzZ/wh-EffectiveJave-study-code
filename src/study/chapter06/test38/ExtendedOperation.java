package study.chapter06.test38;

/**
 * 扩展操作符
 */
public enum ExtendedOperation implements Operation {
    //扩展只需要重新实现Operation接口就可以了
    EXP ("^") {
        @Override
        public double apply(double x, double y) {
            return Math.pow(x, y);
        }
    },
    REMAINDER ("%") {
        @Override
        public double apply(double x, double y) {
            return x % y;
        }
    };
    private final String symbol;

    ExtendedOperation(String symbol) {
        this.symbol = symbol;
    }
}