import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.println("Enter a number: ");
        int num1 = scanner.nextInt();
        System.out.println("Enter a number: ");
        int num2 = scanner.nextInt();
        System.out.println((num1 > num2 ? "num 1" : "num 2") + " is bigger");

        System.out.println("Enter a number: ");
        int num3 = scanner.nextInt();
        System.out.printf("%d is %s",num3, (num3 % 2 == 0 ? "even" : "odd"));

        System.out.println("Enter red or green");
        String color = scanner.nextLine();
        if(color.toLowerCase() == "red"){
            System.out.println("stop");
        } else{
            System.out.println("go");
        }
        */
        int num = -1;
        while(num < 1 || num > 12){
            System.out.println("Enter a number between 1 and 12");
            num = scanner.nextInt();
            if(num < 1 || num > 12) System.out.println("invalid");
        }
        switch(num){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Autumn");
                break;
        }
    }
}
