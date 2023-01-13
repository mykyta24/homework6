package Bank;

public class Manager extends Employee{

    public Manager(String employeeName, int employeeId, String employeeDateOfBirth,String employeeCity) {
        super(employeeName, employeeId, Consts.MANAGER_DEFAULT_SALARY, Consts.MANAGER_TYPE, employeeDateOfBirth,employeeCity);
    }
    public void hireEmployee(String employeeName){
        System.out.println(String.format("The employee %s",employeeName));
    }
    public void fireEmployee(String customerName){
        System.out.println(String.format("Answered to customer %s",customerName));
    }
}
