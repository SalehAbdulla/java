public class Main {
    public static void main(String[] args) {
        SalariedEmployee employee1 = new SalariedEmployee("Saleh", "1998-12-03", 12345, "2012-12-03");
        employee1.retire();

        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("SalehAbdulla", "1998-12-02", 1234, "2023-12-23", 12);
        hourlyEmployee1.getDoublePay();
        System.out.println(hourlyEmployee1);
    }
}

