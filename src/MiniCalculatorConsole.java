import java.util.InputMismatchException;
import java.util.Scanner;


public class MiniCalculatorConsole {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        boolean running =true;
        System.out.println("Mini calculator (console).");
        while (running) {
            printMenu();
            System.out.print("choose an option: ");
            String choice =sc.next().trim();

            try{
                switch(choice){
                    case "1":
                        double a1 = readDouble(sc, "Enter first number: ");
                        double b1 = readDouble(sc, "Enter second number: ");
                        System.out.println("Result: " + (a1 + b1));
                        break;
                    case "2": // subtract
                        double a2 = readDouble(sc, "Enter first number: ");
                        double b2 = readDouble(sc, "Enter second number: ");
                        System.out.println("Result: " + (a2 - b2));
                        break;
                    case "3": // multiply
                        double a3 = readDouble(sc, "Enter first number: ");
                        double b3 = readDouble(sc, "Enter second number: ");
                        System.out.println("Result: " + (a3 * b3));
                        break;
                    case "4": // divide
                        double a4 = readDouble(sc, "Enter numerator: ");
                        double b4 = readDouble(sc, "Enter denominator: ");
                        if (b4 == 0) {
                            System.out.println("Error: division by zero!");
                        } else {
                            System.out.println("Result: " + (a4 / b4));
                        }
                        break;
                    case "5": // modulus
                        double a5 = readDouble(sc, "Enter first number: ");
                        double b5 = readDouble(sc, "Enter second number: ");
                        System.out.println("Result: " + (a5 % b5));
                        break;
                    case "6": // power
                        double base = readDouble(sc, "Enter base: ");
                        double exp = readDouble(sc, "Enter exponent: ");
                        System.out.println("Result: " + Math.pow(base, exp));
                        break;
                    case "7": // sqrt
                        double v = readDouble(sc, "Enter number (>=0): ");
                        if (v < 0) {
                            System.out.println("Error: negative input for sqrt.");
                        } else {
                            System.out.println("Result: " + Math.sqrt(v));
                        }
                        break;
                    case "8":
                        System.out.println("Goodbye!");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid option. Try again.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid number. Try again.");
                sc.nextLine(); // clear bad token
            }

            System.out.println();

        }
        sc.close();
            }
        private static void printMenu(){
         System.out.println("----Menu----");
         System.out.println("1)Add");
            System.out.println("2) Subtract");
            System.out.println("3) Multiply");
            System.out.println("4) Divide");
            System.out.println("5) Modulus (remainder)");
            System.out.println("6) power (base^exp)");
            System.out.println("7) Square root");
            System.out.println("8) Exit");
        }

    private static double readDouble(Scanner sc, String prompt) {
        System.out.print(prompt);
        while (!sc.hasNextDouble()) {
            System.out.print("Please enter a valid number: ");
            sc.next();
        }
        return sc.nextDouble();
    }
}

