import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        for(int i=0;i<28;i++) System.out.print("*");
        System.out.print("<<Grade Calculator>>");
        for(int i=0;i<28;i++) System.out.print("*");
        
        System.out.print("\n\nGrade Calculation Chart:\n90% - 100% : 'S'\n80% - 89%  : 'A'\n70% - 79%  : 'B'\n60% - 69%  : 'C'\n50% - 59%  : 'D'\n40% - 49%  : 'E'\n  <40%     : 'Fail'\n\n");
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of subjects: ");
        int num = sc.nextInt(), sum=0; double avg=0;
        System.out.println();
        for(int i=1;i<=num;i++)
        {
            System.out.printf("Enter marks obtained in Subject %d (out of 100) : ",i);
            sum+=sc.nextInt();
        }
        avg=sum/(double)num;
        System.out.printf("\n\nResult :\n\nTotal Marks Obtained (out of %d) : %d\nAverage Percentage Obtained (out of 100) : %.2f%%\nGrade Secured : ",num*100,sum,avg);
        
        if(avg>=90 && avg<100 || avg==100) System.out.print("S");
        else if(avg>=80 && avg<90) System.out.print("A");
        else if(avg>=70 && avg<80) System.out.print("B");
        else if(avg>=60 && avg<70) System.out.print("C");
        else if(avg>=50 && avg<60) System.out.print("D");
        else if(avg>=40 && avg<50) System.out.print("E");
        else if(avg<40) System.out.print("Fail");
        System.out.println();
        sc.close();
    }
}
