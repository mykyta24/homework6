package Bank;

public abstract class Employee {
    private String name;
    private int id;
    private double salary;
    private String position;
    private String dateOfBirth;
    private String city;



    public Employee(String employeeName, int employeeId,double employeeSalary,String employeePosition , String employeeDateOfBirth,String employeeCity){
        this.name = employeeName;
        this.id = employeeId;
        this.salary = employeeSalary;
        this.position = employeePosition;
        this.dateOfBirth = employeeDateOfBirth;
        this.city = employeeCity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }


    public void receiveSalary(){
        System.out.println("The salary was sent to the employee bank accounts");
    }

    public String toString(){
        String txt = String.format("Employee name %s, position %s,salary : %f, city %s", name,position,salary,city);
        return txt;
    }
    public void teamMeeting(String employeeName,String employeeName2,String employeeName3,String employeeName4,String employeeName5,String employeeName6,String employeeName8, String employeeName9){
        System.out.println(String.format("Create room for team meeting with %s",employeeName + employeeName2 + employeeName3 + employeeName4 + employeeName5 + employeeName6 +employeeName8 + employeeName9 ));
    }
}
