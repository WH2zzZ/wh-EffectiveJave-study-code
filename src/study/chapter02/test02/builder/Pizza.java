package study.chapter02.test02.builder;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza {



    public enum Topping { HAM, MUSHROOM, ONION, PEPPER, SAUSAGE;}
    private final Set<Topping> toppings;

//    //无泛型
//    protected Pizza(Builder builder) {
//        this.toppings = builder.toppings.clone();
//    }
//    public abstract static class Builder {
//
//        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
//        public Builder addTopping(Topping topping) {
//            toppings.add(Objects.requireNonNull(topping));
//            return self();
//        }
//        protected abstract Builder self();
//
//        abstract public Pizza build();
//
//    }
    //泛型
    protected Pizza(Builder<?> builder) {
        this.toppings = builder.toppings.clone();
    }
    abstract static class Builder<T extends Builder<T>> {
        EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        protected abstract T self();

        abstract public Pizza build();
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "toppings=" + toppings +
                '}';
    }

//    public String print() {
//        return "Pizza{" +
//                "toppings=" + toppings +
//                '}';
//    }
}
