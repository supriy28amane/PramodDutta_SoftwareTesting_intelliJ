package JAVA_BASICPROGRAMS;

public class MaxSalary {
    public static void main(String[] args) {
        float salary[]={2,5.6f,34,67,6.7f};

        float max=salary[0];
        float min=salary[0];
        for(int i=0;i<salary.length;i++)
        {
            if(salary[i]>max)
            {
                max=salary[i];

            }

           /* if(salary[i]<min)
            {
                min=salary[i];

            }*/
        }
        System.out.println(max);
        //System.out.println(min);
    }
}
