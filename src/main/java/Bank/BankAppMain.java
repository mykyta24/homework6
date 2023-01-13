package Bank;

public class BankAppMain {
    public static void main(String[] args) {
        Manager manager = new Manager("John Smith",1,"10.01.1977","Toronto");
        Accountant accountant1 = new Accountant("Mary Jones",2,"07.06.2000","Madrid");
        Accountant accountant2 = new Accountant("Sara Golden",3,"30.08.1984","Paris");
        Accountant accountant3 = new Accountant("Max Loris",4,"26.09.2001","Dnipro");
        Accountant accountant4 = new Accountant("Luiz Suarez",5,"02.01.1998","Toronto");
        Accountant accountant5 = new Accountant("Robert Lewandowski",6,"24.02.1990","Dnipro");
        Clerc clerc1 = new Clerc("Ivan Petrov",7,"11.03.1999","Madrid");
        Clerc clerc2 = new Clerc("Alex Morgan",8,"14.12.2000","Toronto");
        Clerc clerc3 = new Clerc("Dan Faigon",9,"19.02.1986","Paris");


        System.out.println(manager.toString());
        System.out.println(accountant1.toString());
        System.out.println(accountant2.toString());
        System.out.println(accountant3.toString());
        System.out.println(accountant4.toString());
        System.out.println(accountant5.toString());
        System.out.println(clerc1.toString());
        System.out.println(clerc2.toString());
        System.out.println(clerc3.toString());


        clerc2.teamMeeting("John Smith"," ,Mary Jones"," ,Sara Golden"," ,Max Loris"," ,Luiz Suarez"," ,Robert Lewandowski"," ,Alex Morgan"," ,Dan Faigon");


    }
}
