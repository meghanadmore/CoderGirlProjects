import java.util.Scanner;
import static java.lang.System.out;
public class MultiplicationTables {
    public static void main(String[]args){
        Scanner keyboard=new Scanner(System.in);
        System.out.println("Welcome to multiplication Tables");
        System.out.print("How long would you like to see them?");
        int size=keyboard.nextInt();

        for(int a=0;a<=size;a++){
            for( int b=0;b<=size;b++){
                System.out.println(a +" * "+b+" = "+a*b);
            }
            System.out.print("");
        }

    }
}
