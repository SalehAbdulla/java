import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.Calendar;

@EqualsAndHashCode(callSuper = true)
@Data
public class PartTimeTutor extends Employee {
    private double hourlyRate;
    private ArrayList<PartTimeRecord> numberOfHoursList = new ArrayList<>();

    public PartTimeTutor(long staffId, String name, String address, int phoneNumber,
                         boolean isPhDHolder, boolean isMasterHolder, double hourlyRate) {
        super(staffId, name, address, phoneNumber, isPhDHolder, isMasterHolder);
        this.hourlyRate = hourlyRate;
    }

    public double calcMonthlySalary() {
        Calendar cal = Calendar.getInstance();
        int currentYear = cal.get(Calendar.YEAR);
        int currentMonth = cal.get(Calendar.MONTH) + 1;

        for (PartTimeRecord record : numberOfHoursList) {
            if (record.getYear() == currentYear && record.getMonth() == currentMonth) {
                return hourlyRate * record.getNumberOfHoursWorkedAMonth();
            }
        }

        return 0;
    }

}
