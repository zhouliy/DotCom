package langwodemo;

public class Employee {
//    name address SSN number salary
    public String name ;
    public String address;
    public int SSN;
    public double salary;

//    computePay()  mailCheck()
    public double computePay(){
        return salary/52.0;
    }

    public void  mailCheck(){
        System.out.println("将员工"+ name  + "邮寄到" + address);
    }
}
