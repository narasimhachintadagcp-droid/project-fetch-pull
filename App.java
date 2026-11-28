public class App {
        public static void main(String[] args) {
                int a = 20, b = 5;
                System.out.println("=== Calculator App v2.0 ===");
                System.out.println("Addition is: " + (a + b));
                System.out.println("Difference is: " + (a - b));
                System.out.println("Multiplication is: " + (a * b));

                if (b != 0) {
                        System.out.println("Division is: " + (a / b));
                        System.out.println("Modulus (Remainder) is: " + (a % b));
                } else {
                        System.out.println("Division by zero is not allowed.");
                }
        }
}

