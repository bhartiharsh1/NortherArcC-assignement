package Module2.day1.FunctInterface;



import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Demo1 {
    public static void main(String[] args) {

        
        Function<String, Integer> d = (String s) -> s.length();
        System.out.println(d.apply("Hello"));

        BiFunction<Integer, Integer, Integer> mf = (Integer t, Integer u) -> t + u;
        System.out.println(mf.apply(1, 2));


        Predicate<String> isLong = (String s) -> s.length() > 5;
        System.out.println(isLong.test("HelloWorld"));


        BinaryOperator<Integer> multiply = (Integer x, Integer y) -> x * y;
        System.out.println(multiply.apply(3, 4));


        Consumer<String> printer = (String s) -> System.out.println(s);
        printer.accept("Hello from Consumer!");


        Supplier<Double> randomValue = () -> Math.random();
        System.out.println(randomValue.get());
    }
}

