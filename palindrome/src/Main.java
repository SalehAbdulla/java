public class Main{
    public static void main(String[] args){
        if (isPalindrome(121)){
            System.out.println("ture");
        } else {
            System.out.println("false");
        }
    }

    public static boolean isPalindrome(int number) {
        int reverse = 0;
        int temp = number;

        while (temp != 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp = temp / 10;
        }
        return (reverse == number);
    }
}