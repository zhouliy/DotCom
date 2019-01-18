import mashibindemo.BirthDate;

public class TestBirthDate {
    public static void main(String[] args) {
        TestBirthDate birthDate = new TestBirthDate();
        int date = 9;
        BirthDate birthDate1 = new BirthDate(1,5,1991);
        BirthDate birthDate2 = new BirthDate(9,4,1991);
        birthDate.change(date);
        birthDate.change1(birthDate1);
        birthDate.change2(birthDate2);
        System.out.println("date = " + date);
        birthDate1.display();
        birthDate2.display();
    }

    public void change(int i){
        i = 1234;
    }

    public void  change1(BirthDate birthDate){
        birthDate = new BirthDate(3,5,1993);
    }

    public void change2(BirthDate birthDate){
        birthDate.setDay(22);
    }
}
