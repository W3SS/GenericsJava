import java.util.ArrayList;

public class GenericsExample {
    public static void main(String[] args) {
        shout("Beaker", 12);

        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<Double> doublePrinter = new Printer<>(35.3);
        doublePrinter.print();

        Printer<String> stringPrinter = new Printer<>("Play that funky music, white boy !");
        stringPrinter.print();

        ArrayList<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Beemo"));
        Cat myCat = cats.get(0);

        AnimalPrinter<Cat> kittyName = new AnimalPrinter<>(myCat);
        kittyName.print();

    }

    private static <T, V> void shout( T thingToShout, V otherThingToShout) {
        System.out.println(thingToShout + "!!!");
        System.out.println(otherThingToShout + "!!!");
    }
}