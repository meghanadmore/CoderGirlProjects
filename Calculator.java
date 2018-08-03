import static java.lang.System.out;
public class Calculator {
    public static int add(int a,int b)
    {
        return a+b;
    }
    public static int subtract(int a,int b)
    {
        return a-b;
    }
    public static int multiply(int a,int b)
    {
        return a*b;
    }
    public static int divide(int a,int b)
    {
        return a/b;
    }
    public static void main(String[]args)
    {
        int x=add(5,7);
        System.out.println("5 plus 7 equals"  + x);
        System.out.println("3 plus 5 eqauls"+add(3,5));
        System.out.println("1 plus 2 equals"+add(1,2));
        System.out.println("9 minus 4 equals"+ subtract(9,4));
        System.out.println("9 minus 3 "+subtract(9,3));
        System.out.println("3 times 3 equals"+multiply(3,3));
        System.out.println("2 times 4 equals"+multiply(2,3));
        System.out.println("5 divided by 3 equals"+  divide(5,3));
    }
}
