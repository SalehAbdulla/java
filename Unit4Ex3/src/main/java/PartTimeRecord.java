import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@AllArgsConstructor
@Data
public class PartTimeRecord {
    private int year;
    private int month;
    private double numberOfHoursWorkedAMonth;
}
