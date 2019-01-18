package csdnjavademos;

public class Transfer {
    public static void main(String[] args) {
        System.out.println(sayHello("kkkk"));
        System.out.println(max(12,32));
    }

    public static String sayHello(String name) {
        return name;
    }

    public static int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }
}
