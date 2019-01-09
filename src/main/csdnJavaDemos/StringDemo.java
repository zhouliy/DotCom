package csdnJavaDemos;

public class StringDemo {
    public static void main(String[] args) {
        String myString = "hello,world abcdefg";
        System.out.println(myString.length());
        System.out.println(myString.toUpperCase());
        System.out.println(myString.toLowerCase());
        System.out.println(myString.replace("h","K"));
        System.out.println(myString.indexOf("o"));
        System.out.println(myString.substring(1,9));
    }
}
