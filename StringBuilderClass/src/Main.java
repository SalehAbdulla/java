public class Main {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Welcome to ");

        stringBuilder.append("Java Programming");
        System.out.println(stringBuilder);

        stringBuilder.insert(8, "My Love ");
        System.out.println(stringBuilder);

        stringBuilder.replace(11, 15, "Amazing");
        System.out.println(stringBuilder);

        stringBuilder.delete(0, 8);
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);



    }
}