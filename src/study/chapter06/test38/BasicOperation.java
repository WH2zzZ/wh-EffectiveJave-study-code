package study.chapter06.test38;

/**
 * 基本操作符，实现自Operation接口
 */
public enum BasicOperation implements Operation{
    //加减乘除枚举
    PLUS("+") {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MIUS("-") {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES ("*") {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DEVIDE ("/") {
        @Override
        public double apply(double x, double y) {
            return x / y;
        }
    };
    private final String symbol;

    BasicOperation(String symbol) {
        this.symbol = symbol;
    }
}