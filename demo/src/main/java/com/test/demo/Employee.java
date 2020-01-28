import java.util.Date;
@Entity
@Table(name = "users")
@EntityListeners(AuditingEntityListener.class)
public class Employee {


    @Column(name = "EmployeeName", nullable = false)
    private String EmployeeName;

    @Column(name = "Address1", nullable = false)
    private String Address1;

    @Column(name = "Address2", nullable = false)
    private String Address2;

    @Column(name = "City", nullable = false)
    private String City;

    @Column(name = "State", nullable = false)
    private String State;

    @Column(name = "PostalCode", nullable = false)
    private int PostalCode;

    @Column(name = "HomePhone", nullable = false)
    private long HomePhone;

    @Column(name = "OfficeExtension", nullable = false)
    private int OfficeExtension;

    @Column(name = "HireDate", nullable = false)
    private Date HireDate;

    @Column(name = "JobClassification", nullable = false)
    private String JobClassification;

    @Column(name = "HourSalComm", nullable = false)
    private String HourSalComm;
    DateFormat format = new SimpleDateFormat("MMMM d, yyyy", Locale.ENGLISH);


    public Employee() {}
    public Employee(String EmployeeName, String Address1, String Address2,String City,String State, int PostalCode,long HomePhone,int OfficeExtension,String HireDate, String JobClassification, String HourSalComm) {
        this.EmployeeName=EmployeeName;
        this.Address1=Address1;
        this.Address2=Address2;
        this.City=City;
        this.State=State;
        this.PostalCode=PostalCode;
        this.HomePhone=HomePhone;
        this.OfficeExtension=OfficeExtension;
        HireDate = format.parse(HireData);
        this.JobClassification=JobClassification;
        this.HourSalComm=HourSalComm;
    }




    public String getName() {
        return EmployeeName;
    }

    public void setName( String emp_name ) {
        this.EmployeeName = emp_name;
    }
    public String getAdd1() {
        return Address1;
    }

    public void setAdd1( String add1 ) {
        this.Address1 = add1;
    }
    public String getAdd2() {
        return Address2;
    }

    public void setAdd2( String add2 ) {
        this.Address2 = add2;
    }

    public String getCity() {
        return City;
    }

    public void setCity( String City1 ) {
        this.City = City1;
    }
    public String getState() {
        return State;
    }

    public void setState( String State1 ) {
        this.State = State1;
    }
    public int getPostalCode() {
        return PostalCode;
    }

    public void setPostalCode( int PostalCode1) {
        this.PostalCode = PostalCode1;
    }
    public long getHomePhone() {
        return HomePhone;
    }

    public void setHomePhone( long HomePhone1) {
        this.HomePhone = HomePhone1;
    }
    public int getOfficeExtension() {
        return OfficeExtension;
    }

    public void setOfficeExtension( int OfficeExtension1) {
        this.OfficeExtension = OfficeExtension1;
    }
    public Date getHireDate() {
        return HireDate;
    }

    public void setHireDate( String HireDate1) {
        this.HireDate= format.parse(HireDate1);

    }
    public String getJobClassification() {
        return JobClassification;
    }

    public void setJobClassification( String JobClassification1) {
        this.JobClassification = JobClassification1;
    }
    public String getHourSalComm() {
        return HourSalComm;
    }

    public void setHourSalComm( String HourSalComm1) {
        this.HourSalComm = HourSalComm1;
    }
}