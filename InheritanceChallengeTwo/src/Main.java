public class Main {
    public static void main(String[] args) {

        Worker worker = new Worker("worker", "01/01/1990");
        System.out.println(worker.getAge());
        System.out.println(worker);

        Employee employee = new Employee("employee", "01/01/1980", "01/01/2025");
        System.out.println(employee);

        SalariedEmployee salariedEmployee = new SalariedEmployee("salariedEmployee", "01/01/1970", "01/01/2020", 35000);
        System.out.println(salariedEmployee);

        HourlyEmployee hourlyEmployee = new HourlyEmployee("hourlyEmployee", "01/01/1960", "01/01/2020", 200);
        System.out.println(hourlyEmployee);
        System.out.println(hourlyEmployee.collectPay());
        System.out.println(hourlyEmployee.getDoublePay());
    }
}