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
        Character testCharacter = new Character();


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

            else if(loginUsername.equalsIgnoreCase("help") || loginPassword.equalsIgnoreCase("help")) {
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
        if(response.equalsIgnoreCase("N")) {
            System.out.println("Okay, lets move on.");
        }
        else if(response.equalsIgnoreCase("Y")) {
            System.out.println("Okay, let's begin.\n");

            // Change hair
            System.out.println("Select hair type.\n");
            String chooseHair = myObj.nextLine();
            testCharacter.setHair(chooseHair);

            // Change eyebrows
            System.out.println("Select eyebrow type.\n");
            String chooseEyebrows = myObj.nextLine();
            testCharacter.setEyebrows(chooseEyebrows);

            // Change eyes
            System.out.println("Select eye type.\n");
            String chooseEyes = myObj.nextLine();
            testCharacter.setEyes(chooseEyes);

            // Change nose
            System.out.println("Select nose type.\n");
            String chooseNose = myObj.nextLine();
            testCharacter.setNose(chooseNose);

            // Change mouth
            System.out.println("Select mouth type.\n");
            String chooseMouth = myObj.nextLine();
            testCharacter.setMouth(chooseMouth);

            System.out.println("Your changes have been saved, here they are: ");
            System.out.println("Hair: " + testCharacter.getHair());
            System.out.println("Eyebrows: " + testCharacter.getEyebrows());
            System.out.println("Eyes: " + testCharacter.getEyes());
            System.out.println("Nose: " + testCharacter.getNose());
            System.out.println("Mouth: " + testCharacter.getMouth() + "\n");

        }
        else {
            System.out.println("Please enter Y OR N to continue");
        }


        // Populate friends list
        System.out.println("We have given you some friends so you don't have to be so lonely, you're welcome.");
        System.out.println("We will now show you how to message your friends.\n");
        testCharacter.addFriend("Robert");
        testCharacter.addFriend("Spence");

        // Message Friends
        System.out.println("How about we send a quick hello to your close personal friend robert? You don't really have a choice but it's nice to have the illusion");

        do {
            System.out.println("Now say 'hello robert': \n");
            String message = myObj.nextLine();

            if (message.equalsIgnoreCase("hello robert")) {
                System.out.println("Message: " + message + " has been successfully delivered to robert.\n");
                break;
            } else {
                System.out.println("NO! Say 'hello robert', not case sensitive of course.");
            }
        } while(true);

        // Show friends list
        System.out.println("Now here is the pre-populated, definitely not fake friends list.");
        testCharacter.getFriendList();
        System.out.println(("A whole two friends.... Someone's popular."));

        // Logout
        System.out.println("Now that you are familiar with the game, would you like to logout? Y/N");
        String logoutAnswer = myObj.nextLine();
        if(logoutAnswer.equalsIgnoreCase("Y")) {
            System.out.println("We are sad to see you go but glad to watch you walk away... See ya!");
        }
        else if(logoutAnswer.equalsIgnoreCase("N")) {
            System.out.println("Glad to hear you enjoy our game so much that you don't want to leave. maybe you'll never leave.....");
        }
        else{
            System.out.println("It's not hard.... 'Y' or 'N'!");
        }


    }
}
