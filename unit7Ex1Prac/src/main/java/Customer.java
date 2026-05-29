public class Customer {
    // this indicates will not be serialized
    private transient OracleDBConnection dbConn;
    private String myName;
    private Car myCar;

}
