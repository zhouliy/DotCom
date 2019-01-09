package csdnJavaDemos;

public class arrayDemo {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println("数组的第一个元素为:" + array[0]);
        System.out.println("数组为：");
        for (int i:array
             ) {
            System.out.print(i + "\t");
        }
    }
}
