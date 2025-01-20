public class Main{
    public static void main(String[] args) {
        System.out.println(canPack(1,0,5));
    }

    // Big bag must hold Five items only.
    // write code here

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }

        if (bigCount * 5 >= goal){
            int remainder = goal % 5;
            if (smallCount >= remainder){
                return true;
            }
        } else {
            if (smallCount >= goal - bigCount * 5) {
                return true;
            }
        }

        return false;
    }

}
