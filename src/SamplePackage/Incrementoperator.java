package SamplePackage;

public class Incrementoperator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        //++a  >>exp=11 a=11
        //+
        //a++   >>exp=11 a=12
        //+
        //a++  >>exp=12  a=13
        System.out.println(a);   //result : 11+11+12   a=13


    }
}
