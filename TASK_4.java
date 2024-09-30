import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        String[] Q = {"Q.1 India won its first Cricket World Cup in ____.\n    a) 1981  b)1991  c)1983  d)1993\n","Q.2 Which planet is known as the Red Planet?\n    a) Uranus  b) Neptune  c) Saturn  d) Mars\n","Q.3 What is the national sport of India?\n    a) Cricket   b) Field Hockey   c) Football   d) Badminton\n","Q.4 Which Indian city is known as the \"Silicon Valley of India\"?\n    a) Chennai    b) Bengaluru    c) Mumbai    d) Kolkata\n","Q.5 What is the minimum age to become the Prime Minister of India?\n    a) 35 years    b) 36 years   c) 37 years    d) 38 years\n"};
        
        Scanner sc = new Scanner(System.in);
        Timer timer = new Timer(); int[] i={0}; int[] score = {0};

        TimerTask task = new TimerTask() 
        {
            @Override
            public void run() 
            {
                if(i[0]<Q.length)
                {
                    System.out.println(Q[i[0]]);
                    System.out.print("\n\nEnter your option : ");
                    char ch = sc.next().charAt(0);
                    if((i[0]==0 && ch=='c') ||(i[0]==1 && ch=='d') ||(i[0]==2 && ch=='b') ||(i[0]==3 && ch=='b') ||(i[0]==4 && ch=='a'))
                    {
                        score[0]+=10;
                        System.out.printf("\n\nCorrect Answer!!!\n\nCurrent Score : %d\n\n",score[0]);
                    }
                    else
                    {
                        System.out.printf("\n\nWrong Answer!!!\n\nCurrent Score : %d\n\n",score[0]);
                    }
                    i[0]++;
                }
                else
                {
                    timer.cancel();
                    System.out.print("Game Over!!!");
                }
            }
        };
        timer.scheduleAtFixedRate(task,1000,10000);
        
    }
}
