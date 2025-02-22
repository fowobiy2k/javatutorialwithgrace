public class RelationalOperatorsDemo {

    public static void main(String[] args) {
        // ==
        int age1 = 13;
        int age2 = 13;
        int age3 = 15;

        boolean isEqual = age1 == age2;
        System.out.println(isEqual);

        // Logical operators (&&, ||, !)
        boolean result = (age1 == age2) && (age1 > age3);
        System.out.println(result);

        result = (age1 == age2) || (age1 > age3);
        System.out.println(result);

        boolean test = (age1 < age3) && (age2 == age1);
        System.out.println(test);

    }


}
