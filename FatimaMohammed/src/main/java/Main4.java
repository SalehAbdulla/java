public class Main4 {
    public static void main(String[] args) {
        int[] a = new int[10];// [0,1,4,9,16,0,0,0,0,0]

        for(int i = 0; i < a.length; i++) {
            a[i] = i * i;
            System.out.println(a[i]);
        }

    }
}
