package com.jetbrains;
import java.util.Scanner;
import java.lang.String;


public class Grocerylist {
    public static void main(String[]args){
    System.out.println("please list three items on your grocery shopping list");
    Scanner keyBoard=new Scanner(System.in);
    System.out.println("what is item1:?");
    String item1= keyBoard.next();
    System.out.println("what is item2:?");
    String item2=keyBoard.next();
    System.out.println("what is item3:?");
        System.out.println("how many"+item1+ "?");
    String item3=keyBoard.next();
    System.out.println("now plz enter quantity of each item");
    int n1=keyBoard.nextInt();
    System.out.println("how many"+item2 +"?");
    int n2 =keyBoard.nextInt();
    System.out.println("how many"+item3+"?");
    int n3=keyBoard.nextInt();
    System.out.println("now, plz enter price of each item");
    System.out.println(" how much does one item" +item1 +" cost?");
    float p1=keyBoard.nextFloat();
    System.out.println("how much does one item"+item2 +" cost?");
    float p2=keyBoard.nextFloat();
    System.out.println("how much does one item"+item3+" cost?");
    float p3=keyBoard.nextFloat();
    System.out.println("now calculating your total grocery bill");
    System.out.println("your total cost is:$"+((n1*p1)+(n2*p2)+(n3*p3)));












    }
}
