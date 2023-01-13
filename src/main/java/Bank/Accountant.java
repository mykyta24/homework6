package Bank;

public class Accountant extends Employee{
    public Accountant(String employeeName, int employeeId, String employeeDateOfBirth,String employeeCity) {
        super(employeeName, employeeId, Consts.ACCOUNTANT_DEFAULT_SALARY, Consts.ACCOUNTANT_TYPE, employeeDateOfBirth,employeeCity);
    }

    public void createReport(){
        System.out.println("Report Created");
    }

}
