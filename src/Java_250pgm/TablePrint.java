package Java_250pgm;

import java.util.Scanner;

public class TablePrint {
    public static void main(String[] args) {
        //user defined directly number
        /*
        int a=2;

        for(int i=1;i<=10;i++)
        {
           // System.out.println(a*i);
            System.out.println(a +"*" +i + "=" +(a*i));


        }

         */

        //below code ....system can gievn input from user and then print table of that number
        Scanner s=new Scanner(System.in);

        System.out.println("Enter Number to print table : ");
        int num=s.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(num + "*" + i + "=" +(num*i));
        }

    }
}
