package JAVA_BASICPROGRAMS;

public class SecondMax {
    public static void main(String[] args) {

        int[] sal = {7, 10, 4, 13, 25, 18, 9, 8, 17};

        int highest = sal[0];
        int second_highest = sal[0];

        for (int i = 0; i < sal.length; i++) {

            if(sal[i]>highest){
                highest = sal[i];
            }
            else if(sal[i] > second_highest){
                second_highest = sal[i];
            }

        }
        System.out.println("MAX Salary : " +highest);
        System.out.println("Second Salary : " +second_highest);


    }
}
