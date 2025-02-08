public class Main {
    public static void main(String[] args) {
        Printer printer = new Printer(50, true);
        System.out.println(printer.getPagesPrinted());
        printer.printPages(5);
        System.out.println(printer.getPagesPrinted());
    }
}