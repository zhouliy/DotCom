package csdnJavaDemos;

public class forCircle {
    public static void main(String[] args) {
        /*输出1-10
        for (int a = 1; a < 11; a++)
            System.out.print(a + "\t");*/
        //求1-100所有整数的和
        int sum = 0;
        for (int i = 0 ; i < 101; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}
