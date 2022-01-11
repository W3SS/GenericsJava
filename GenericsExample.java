public class GenericsExample {
    public static void main(String[] args) {
        Printer<Integer> printer = new Printer<>(23);
        printer.print();

        Printer<Double> doublePrinter = new Printer<>(35.3);
        doublePrinter.print();

        Printer<String> stringPrinter = new Printer<>("Play that funky music, white boy !");
        stringPrinter.print();

    }
}