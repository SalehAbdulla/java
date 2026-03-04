public enum Gender {

    MALE("male", 'm'),
    FEMALE("female", 'f');

    private final String genderStr;
    private final char genderChar;

    Gender(String genderStr, char genderChar) {
        this.genderStr = genderStr;
        this.genderChar = genderChar;
    }

    public String getGenderStr() {
        return genderStr;
    }

    public char getGenderChar() {
        return genderChar;
    }
}