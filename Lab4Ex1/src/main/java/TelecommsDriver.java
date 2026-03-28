import model.NetworkEngineer;
import model.NetworkEngineerCertificate;
import model.ProgrammingLanguage;
import model.SoftwareEngineer;

import java.util.ArrayList;
import java.util.Arrays;

public class TelecommsDriver {
    public static void main(String[] args) {
        SoftwareEngineer employee1 = new SoftwareEngineer("SALEH", "ABDULLA", "BAHRAIN", 27,
                "SOFTWARE ENGINEER",
                new ArrayList<>(Arrays.asList(
                        ProgrammingLanguage.GO,
                        ProgrammingLanguage.JAVA,
                        ProgrammingLanguage.PYTHON,
                        ProgrammingLanguage.JAVASCRIPT)), 1_000_000);

        employee1.printWhatIDo();
        employee1.getVacationDays();

        NetworkEngineer employee2 = new NetworkEngineer("ALI", "ABDULLA", "BAHRAIN", 20, "NETWORK ENGINEER",
                new ArrayList<>(Arrays.asList(
                        NetworkEngineerCertificate.CCNA,
                        NetworkEngineerCertificate.CCNP,
                        NetworkEngineerCertificate.SECURITY_PLUS
                )));

        employee2.printWhatIDo();
        employee2.getVacationDays();

    }
}
