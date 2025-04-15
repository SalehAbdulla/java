import java.util.Arrays;

public class GetField {
    public static void main(String[] args) {
        getField(1, "Blah,20.1,30.6,More blah");
    }
    //System.out.println(getField(1, "Blah,20.1,30.6,More blah")); Blah
    //System.out.println(getField(2, "Blah,20.1,30.6,More blah")); 20.1

    private static String getField(int columnNumber, String allFields) {
        String[] separatedByComma = allFields.split(",");
        String fieldRequired = separatedByComma[columnNumber - 1];
        return fieldRequired;
    }

}
