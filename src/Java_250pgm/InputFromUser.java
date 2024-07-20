package Java_250pgm;

import java.util.Scanner;

public class InputFromUser {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);            //scanner class user for input from user

        System.out.println("Enter User Name : ");
        String name=s.nextLine();             //nextline usesd for string input from user

        System.out.println("Enter Age : ");
        int age=s.nextInt();                    //nextline usesd for string input from user


        System.out.println("The user name is : " +name);
        System.out.println("The user age is : " +age);


        s.close();
    }
}
