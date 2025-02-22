import java.math.BigDecimal;

public class Main {

    static String GLOBAL_VALUE = "Union bank";

    public static void main(String[] args) {
        String MESSAGE = "hello world";
        char x = 'a';
        boolean done = false;
        int age = 1288811114;
        double cost = -23.99999;
        long size = 528881111;
        int price = 1000;
        
        System.out.println(MESSAGE);
        System.out.println(GLOBAL_VALUE);
        System.out.println( "Age in main= " + age);
        System.out.println("Age in getAge method= " + getAge());
        System.out.println("The price is:" + price);
        
    }

    public static int getAge() {
        String greeting;

        greeting  = "Hello, madam";
        int age = 4;
//        System.out.println(age);
        System.out.println(GLOBAL_VALUE + "x2");

        Messenger messenger = new Messenger();
        System.out.println("Colour is: " + messenger.shape);

        System.out.println("Colour is: " + Messenger.colour);


        return age;
    }
}