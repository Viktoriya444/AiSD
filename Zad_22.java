public class Zad_22 {
    public static void main(String[] args) {
        String ex1 = "A B +";
        System.out.println("A B L + = " + PostfixCalculator.evaluate(ex1, 5, 3)); ////10


        String ex2 = "A B *";
        System.out.println("A B * = " + PostfixCalculator.evaluate(ex2, 5, 3)); //// 13


        String ex3 = "A B -";
        System.out.println("A B - = " + PostfixCalculator.evaluate(ex3, 5, 3)); //// 4


        String ex4 = "A B * A -";
        System.out.println("A B * A - = " + PostfixCalculator.evaluate(ex4, 5, 3)); //// 12
    }
}
