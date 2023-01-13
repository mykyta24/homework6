package Bank;

public class Clerc extends Employee {
    public Clerc(String employeeName, int employeeId, String employeeDateOfBirth,String employeeCity) {
        super(employeeName, employeeId, Consts.CLERC_DEFAULT_SALARY, Consts.CLERC_TYPE, employeeDateOfBirth,employeeCity);
    }
    public void makeCall(String customerName){
        System.out.println(String.format("Connected to customer %s",customerName));
    }
    public void getCall(String customerName){
        System.out.println(String.format("Answered to customer %s",customerName));
    }

}
