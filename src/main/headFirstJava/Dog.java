package headFirstJava;

public class Dog {
    String name;

    void bark(){
        System.out.println(name + "wang wang wang!");
    }
    void eat(){}
    void chaseCat(){}

    public static void main(String[] args) {
        Dog dog1 = new Dog();
        dog1.bark();
        dog1.name = "yangjie";

        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        dogs[2] = dogs[1];

        dogs[0].name = "Fido";
        dogs[1].name = "sss";

        int x = 0;
        while (x < dogs.length){
            dogs[x].bark();
            dogs[x].eat();
            dogs[x].chaseCat();
            x = x+1;
        }
    }
}
