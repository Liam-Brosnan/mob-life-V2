import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Scanner class for user input
        Scanner myObj = new Scanner(System.in);

        // Create username and password
        System.out.println("Please select a username and password, remember these as we will take you to a log in page soon.\n");
        System.out.println("Input username: ");
        String username = myObj.nextLine();

        System.out.println("\n");

        System.out.println("Input password: ");
        String password = myObj.nextLine();



        // Register and create character
        Register registered_user = new Register(username, password);
        Character test_character = new Character();


        // Test Log-in
        System.out.println("Okay, lets test a log in, I hope you remembered your details. If you can't remember type 'help' and we will give you your details.");
        System.out.println("Now enter your username and password:  ");

        do{
            System.out.println("Username: \n");
            String loginUsername = myObj.nextLine();

            System.out.println("Password: \n");
            String loginPassword = myObj.nextLine();

            if(loginUsername.equals(registered_user.getUsername()) && loginPassword.equals(registered_user.getPassword())) {
                System.out.println("Login successful");
                break;
            }

            else if(loginUsername.toLowerCase().equals("help") || loginPassword.toLowerCase().equals("help")) {
                System.out.println("Username: " + registered_user.getUsername());
                System.out.println("Password: " + registered_user.getPassword());
            }

            else if(!loginUsername.equals(registered_user.getUsername()) || !loginPassword.equals(registered_user.getPassword())) {
                System.out.println("Username or password incorrect");
            }


        } while(true);



        // Ask for character customization
        System.out.println("Would you like to edit your character? Y/N");

        String response = myObj.nextLine();
        if(response.toUpperCase().equals("N")) {
            System.out.println("Okay, lets move on.");
        }
        else if(response.toUpperCase().equals("Y")) {
            System.out.println("Okay, let's begin.\n");

            // Change hair
            System.out.println("Select hair type.\n");
            String chooseHair = myObj.nextLine();
            test_character.setHair(chooseHair);

            // Change eyebrows
            System.out.println("Select eyebrow type.\n");
            String chooseEyebrows = myObj.nextLine();
            test_character.setEyebrows(chooseEyebrows);

            // Change eyes
            System.out.println("Select eye type.\n");
            String chooseEyes = myObj.nextLine();
            test_character.setEyes(chooseEyes);

            // Change nose
            System.out.println("Select nose type.\n");
            String chooseNose = myObj.nextLine();
            test_character.setNose(chooseNose);

            // Change mouth
            System.out.println("Select mouth type.\n");
            String chooseMouth = myObj.nextLine();
            test_character.setMouth(chooseMouth);

            System.out.println("Your changes have been saved, here they are: ");
            System.out.println("Hair: " + test_character.getHair());
            System.out.println("Eyebrows: " + test_character.getEyebrows());
            System.out.println("Eyes: " + test_character.getEyes());
            System.out.println("Nose: " + test_character.getNose());
            System.out.println("Mouth: " + test_character.getMouth() + "\n");

        }
        else {
            System.out.println("Please enter Y OR N to continue");
        }
    }
}
