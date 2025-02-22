public class OperatorsDemo {

    public static void main(String[] args) {
        int sum = 18 + 57;
        System.out.println("The sum is: " + sum);

        int diff = 92 - 20;
        System.out.println("The difference is: " + diff);

        int prod = 12 * 7;
        System.out.println("The product is: " + prod);

        int quo = 14 / 5;       //Integer division
        System.out.println("The quotient is: " + quo);

        int rem = 14 % 5;       //Remainder division (Modulo)
        System.out.println("The remainder is: " + rem);

        double cost = 14 / 5;
        System.out.println("The quotient is: " + cost);

        double cost2 = 2.5 * 3;
        System.out.println("The product is: " + cost2);

        int value = 7;
        System.out.println("Pre-Increment: " + ++value);
        System.out.println("Pre-Decrement: " + --value);
        System.out.println("Pre-Decrement: " + --value);

        int num = 25;
        num += 2; // num = num + 2
        System.out.println(" num += 2: " + num );

        num -= 5;
        System.out.println(" num -= 5: " + num );

        num *= 2;
        System.out.println(" num *= 2: " + num );

        num /= 10;
        System.out.println(" num /= 10: " + num );
    }
}
