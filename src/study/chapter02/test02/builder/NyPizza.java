package study.chapter02.test02.builder;

import java.util.Objects;

public class NyPizza extends Pizza {

    public enum Size {SMALL, MEDIUM, LARGE}
    private final Size size;

//    public static class Builder extends Pizza.Builder {
    public static class Builder extends Pizza.Builder<Builder> {

        private final Size size;

        public Builder(Size size){
            this.size = Objects.requireNonNull(size);
        }

        @Override
        protected Builder self() {
            return this;
        }

        @Override
        public NyPizza build() {
            return new NyPizza(this);
        }
    }


    protected NyPizza(Builder builder) {
        super(builder);
        size = builder.size;
    }

    @Override
    public String toString() {
        return "NyPizza{" + super.toString() +
                ", size=" + size +
                '}';
    }

    public String print() {
        return "NyPizza{" + super.toString() +
                ", size=" + size +
                '}';
    }
}
