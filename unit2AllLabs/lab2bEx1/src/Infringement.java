public class Infringement {
    private String type;
    private String time;
    private String place;
    private double fineAmount;
    private String name;
    private int noticeNumber;

    public Infringement(String type, String time, String place, double fineAmount, String name){
        this.type = type;
        this.time = time;
        this.place = place;
        this.fineAmount = fineAmount;
        this.name = name;
        this.noticeNumber = 1;
    }

    public void printInfringement(){
        System.out.println("-".repeat(30));
        System.out.println("TYPE: \t\t\t" + this.type);
        System.out.println("TIME: \t\t\t" + this.time);
        System.out.println("PLACE: \t\t\t" + this.place);
        System.out.println("FINE_AMOUNT: \t" + this.fineAmount);
        System.out.println("NAME: \t\t\t" + this.name);
        System.out.println("NOTICE_NUMBER: \t" + this.noticeNumber);
    }


}
