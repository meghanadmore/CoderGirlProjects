import static java.lang.System.out;
import java.util.Scanner;
public class SandwitchShop
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        int goalForVeggies = 50;
        int goalForBurgers = 250;
        int goalForSubs = 180;
        int goalForSoup = 70;
        System.out.println("The sales goal for each item is as follow");
        System.out.println(" The sales gaol for veggie sandwitch is 50");
        System.out.println("How Many Veggie Sandwitches Were Sold Today?");
        int v = keyboard.nextInt();

        if (v > 50)
            System.out.println("Meets goal");
        else if(v==50)
            System.out.println("meets goal");
        else
        System.out.println("Fell short");

        System.out.println("The sales goal for burgers is  250 ");
        System.out.println("How many burgers were sold today?");
        int b=keyboard.nextInt();

        if(b >250)
            System.out.println("Meets goal");
        else if(b==250)
            System.out.println("meets goal");
        else
        System.out.println("Fell short");

        System.out.println("The sales goal for is subs is 180 ");
        System.out.println("how many subs were sold today?");
        int s1=keyboard.nextInt();

        if(s1 > 180)
            System.out.println("Meets goal");
        else if(s1==180)
            System.out.println("Meets goal");
        else
            System.out.println("Fell short");

        System.out.println("The Goal For Soup is  70 ");
        System.out.println("How many Soups were sold today");
        int s2=keyboard.nextInt();

        if(s2 > 70)
            System.out.println("Meets goal");
        else if(s2==70)
            System.out.println("Meets goal");
        else
            System.out.println("Fell short");
        if ((v>=50 && b>=250 && s1>=180 && s2>70))
        {
            System.out.println("Made goal for everything");
        }










    }
}
