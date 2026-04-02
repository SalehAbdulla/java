import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class PartTimeRecord {
    private int year;
    private int month;
    private double numberOfHoursWorkedAMonth;
}
