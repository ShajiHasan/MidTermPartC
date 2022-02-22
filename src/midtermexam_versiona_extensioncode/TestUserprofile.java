package midtermexam_versiona_extensioncode;

import java.util.Scanner;
/**
 *This class test the user profile creation
 *
 * @author Shaji Hasan
 */
public class TestUserprofile {
    
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 
        
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        
        System.out.print("Choose your fav genre:\nComedy\nDrama\nAction\nMystery\n");
        String genre = input.nextLine();
        
        UserProfile user = new UserProfile(name, genre);
        
        System.out.print("Your user profile has been created.");
        
    }

}
