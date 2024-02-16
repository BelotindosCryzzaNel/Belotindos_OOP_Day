package labactivity2;

import java.util.Scanner;

public class LabActivity2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the message: ");
        String userMessage = scanner.nextLine();

        detectMisplacedCapital(userMessage);

        
        scanner.close();
    }

    public static void detectMisplacedCapital(String userMessage) {
        int found = 0;
        for (int i = 1; i < userMessage.length(); i++) {
            if (Character.isUpperCase(userMessage.charAt(i)) &&
                    Character.isLowerCase(userMessage.charAt(i - 1))) {
                found = 1;
                break;
            }
        }
        if (found == 1) {
            System.out.println("JEJE!");
        } else {
            System.out.println("uWu");
        }
    }
}