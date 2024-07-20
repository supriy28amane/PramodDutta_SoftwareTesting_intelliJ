package JAVA_BASICPROGRAMS;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter side 1: ");
        int a=sc.nextInt();
        System.out.println("Enter side 2: ");
        int b=sc.nextInt();
        System.out.println("Enter side 3: ");
        int c=sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println(a +"is a greater side");
        } else if (b>a && b>c)
        {
            System.out.println(b + "is a greater side");
        }
        else if(c>a && c>b)
        {
            System.out.println(c + "is a greater side" );
        }
        else
        {
            System.out.println("All sides are equal");
        }


    }
}
