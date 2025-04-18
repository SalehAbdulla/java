import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer boxedInt = Integer.valueOf(15); // Unnecessary
        Integer deprecatedBoxing = new Integer(15); // Deprecated
        int unboxedInt = boxedInt.intValue(); // Unnecessary

        //Automatic
        Integer autoBoxed = 15;
        int autoUnboxed = autoBoxed;

        System.out.println(autoBoxed.getClass().getName());
//        System.out.println(autoUnboxed.getClass().getName());

        Double resultBoxed = getLiteralDoublePrimitive();
        double resultUnboxed = getDoubleObject();

        Integer[] wrapperArray = new Integer[5];
        wrapperArray[0] = 50;
        System.out.println(Arrays.toString(wrapperArray));

        System.out.println(wrapperArray[0].getClass().getName());

        Character[] charactersArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(Arrays.toString(charactersArray));

        var ourList = getList(1, 2, 3, 4, 5, 6, 7);
        System.out.println(ourList);

    }

    private static ArrayList<Integer> getList(int... varargs){
        ArrayList<Integer> aList = new ArrayList<>();
        for (int i: varargs){
            aList.add(i);
        }
        return aList;
    }



    private static int returnAnInt(Integer i){
        return i;
    }

    private static Double getDoubleObject(){
        return Double.valueOf(100.00);
    }

    private static double getLiteralDoublePrimitive(){
        return 100.00;
    }




}