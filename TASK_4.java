import java.util.*;

class Quiz extends TimerTask
{
    Scanner sc = new Scanner(System.in);
        
    public String[] Q = {"Q.1 India won its first Cricket World Cup in ____.\n    a) 1981  b)1991  c)1983  d)1993\n","Q.2 Which planet is known as the Red Planet?\n    a) Uranus  b) Neptune  c) Saturn  d) Mars\n","Q.3 What is the national sport of India?\n    a) Cricket   b) Field Hockey   c) Football   d) Badminton\n","Q.4 Which Indian city is known as the \"Silicon Valley of India\"?\n    a) Chennai    b) Bengaluru    c) Mumbai    d) Kolkata\n","Q.5 What is the minimum age to become the President of India?\n    a) 35 years    b) 36 years   c) 37 years    d) 38 years\n"};
    
    Timer timer;
    public Quiz(Timer timer)
    {
        this.timer = timer;
    }
    public static int i=0,score=0,correct_ans=0,wrong_ans=0;
    public void run()
    {
        if(i>0 && i!=5) System.out.print("Time over. Moving to next question!!!\n\n");
        System.out.print(Q[i]);
        System.out.print("Enter your option: ");
        String c = null;
        c = sc.next();
        
        if((i==0 && c.equals("c")) || (i==1 && c.equals("d")) || (i==2 && c.equals("b")) || (i==3 && c.equals("b")) || (i==4 && c.equals("a")) ) 
        {
            score+=10; i++; correct_ans++;
            System.out.printf("\nCorrect Answer!!!\n\nCurrent Score : %d\n\n",score);
        }
        else if(!((i==0 && c.equals("c")) || (i==1 && c.equals("d")) || (i==2 && c.equals("b")) || (i==3 && c.equals("b")) || (i==4 && c.equals("a"))))
        {
            System.out.print("\nWrong Answer!!!\n\n"); i++; wrong_ans++;
        }
        
        if(i==5) 
        {
            System.out.printf("Final Score: %d\nNo of Correct Answers: %d\nNo of Wrong Answers: %d",score,correct_ans,wrong_ans);
            timer.cancel();
        }
        
    }

    public static void main(String[] args)
    {
        for(int i=0;i<30;i++) System.out.print("*");
        System.out.print("<<QUIZ GAME>>");
        for(int i=0;i<30;i++) System.out.print("*");
        
        System.out.println("\n");
        Timer timer = new Timer();
        Quiz task = new Quiz(timer);
        
        timer.schedule(task,2000,5000);
       
    }
}
