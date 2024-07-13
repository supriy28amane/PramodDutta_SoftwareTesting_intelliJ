package SamplePackage;

public class formating {
    public static void main(String[] args) {
        int age=11;
        System.out.println("your age is : "+age);
        System.out.printf("Your age is : %d",age);     //if using printf ...for int , long ,short double =%d , float =%f......like c pgming lang
          int a=10,b=20;
        System.out.println(a+b);

        String name="supriya";
        String name1="Mane";
        System.out.println(name+name1);

        //check int and staring concatination
        System.out.println(a+name1);
        System.out.println(name1+a+b);
        System.out.println(a+name1+b);
        System.out.println(a+b+name1);
    }
}
