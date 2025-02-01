public class Worker {
    private String name;
    private String birthDate;
    protected String enaDate; // for subclass flexibility


    public Worker(){

    }

    public Worker(String name, String birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public int getAge(){
        int currentYear = 2025;
        int birthYear = Integer.parseInt(birthDate.substring(6));
        return currentYear - birthYear;
    }


}