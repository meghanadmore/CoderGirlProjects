import com.jetbrains.Post;
import com.jetbrains.User;
import java.util.Scanner;
import static java.lang.System.out;
import java.util.ArrayList;

public class Menu {
    //has a:
    //User logged in user
    //User pug=new User();
    static User loggedInUser = new User("meghana", "meghana", "More", "src/codergirl,2018", "meghanadmore14@gmail.com");
    static ArrayList<User> users = new ArrayList<User>();



    //can do:
    //constructor
    //displayMenu
    //reactToUser


    public static void createUser() {
        System.out.println("Enter the User name?");
        Scanner keyboard = new Scanner(System.in);
        String username = keyboard.nextLine();
        System.out.println("Enter the fname?");
        String fName = keyboard.nextLine();
        System.out.println("Enter the  lname?");
        String lName = keyboard.nextLine();
        System.out.println("Enter the webUrl?");
        String webURLAvatar = keyboard.nextLine();
        System.out.println("Enter the emailid?");
        String emailid = keyboard.nextLine();
        User author = new User(username, fName, lName, webURLAvatar, emailid);
        users.add(author);
        System.out.println("User Created Successfully " + username);
        //System.out.println("You are currently a user " + loggedInUser.getUsername() + " What would you like to do?");
        // return 0;
    }

    public static void becomeExisting() {

        boolean userFound = false;
        System.out.println("Enter the User name?");
        Scanner keyboard = new Scanner(System.in);
        String username = keyboard.nextLine();
        for (int i = 0; i < users.size(); i++) {
            if (username.equals(users.get(i).getUsername())) {
                userFound = true;
                loggedInUser = users.get(i);
                break;
            }
        }

        if (userFound == true) {
            System.out.println("Success!! You are 1" +
                    "currently a user " + loggedInUser.getUsername() + " What would you like to do?");


        } else {
            System.out.println("Fail!! User not Found " + username);


        }


    }

    public static void createPostAsUser() {

        System.out.println("You are currently a user " + loggedInUser.getUsername());

        Post post = new Post(loggedInUser, loggedInUser.getPosts().size(), "Post1", "Post1");
        loggedInUser.addPost(post);

        System.out.println("Post added");

    }

    public static void printAllPosts() {

        System.out.println("You are currently a user " + loggedInUser.getUsername());

        // Post post = new Post(loggedInUser, loggedInUser.getPosts().size(), "Post1", "Post1");


        System.out.println(" All Posts");
        if (loggedInUser.getPosts().size() > 0) {
            for (int i = 0; i < loggedInUser.getPosts().size(); i++) {
                System.out.println(loggedInUser.getPosts().get(i).getContent());
            }
        } else {
            System.out.println(" There are 0 posts by User " + loggedInUser.getUsername());
        }


    }

    public static void printAllUsers() {

        System.out.println(" All Users:");

        for (int i = 0; i < users.size(); i++) {
            System.out.println(i + 1 + "." + users.get(i).getUsername());
        }

    }

    public static int displayMenu() {
        System.out.println("The main menu has following options:");
        System.out.println("1. create a new User\n2.Become an existing User.\n" +
                "3.Create a post as a current User\n4.Print all posts\n5.Print all Users ");
        System.out.println("You are currently a user " + loggedInUser.getUsername() + " What would you like to do?");
        Scanner keyboard = new Scanner(System.in);
        int inputNumber = keyboard.nextInt();
        return inputNumber;
    }

    public static void main(String[] args) {
        users.add(loggedInUser);
        int inputNumber = 0;
        do {
            inputNumber = displayMenu();
            if (inputNumber == 1) {
                createUser();
            }
            if (inputNumber == 2) {
                becomeExisting();
            }

            if (inputNumber == 3) {
                createPostAsUser();
            }

            if (inputNumber == 4) {
                printAllPosts();
            }
            if (inputNumber == 5) {
                printAllUsers();
            }

        } while (inputNumber != 0);

    }


}


