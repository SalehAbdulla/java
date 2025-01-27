public class Main {
    public static void main(String[] args) {

        printHello();
        Calculator Calculator = new Calculator();
        Calculator.printSum(5,10);

    }
    public static void printHello(){
        System.out.println("Hello");
    }


}

class Calculator{
    public void printSum(int a, int b){
        System.out.println("sum = " + (a + b));
    }
}
