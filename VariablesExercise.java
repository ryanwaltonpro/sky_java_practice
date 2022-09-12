import java.util.Scanner;
public class VariablesExercise {
    public static void main(String[] args){
        int num1 = 5, num2 = 4;
        System.out.println(num1 + num2);
        float result = num1 / (float) num2;
        System.out.println(result);
        int num3 = 8;
        System.out.println(num3++); //prints before addition
        System.out.println(num3);
        System.out.println(++num3); //addition before print

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.println("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Hello " + firstName + " " + lastName);

        System.out.println("Enter two numbers ");
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        System.out.println("Sum: " + (firstNum + secondNum));
    }


}
