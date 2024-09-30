import java.util.*;

class game
{
    Scanner sc = new Scanner(System.in);
    int n,guess; 
    game(int p)
    {
        this.n=p;
    }
    int round_exec(int r)
    {
        double x = Math.random() * n;
        int num = (int)x;
        int flag=0, score=30;
        System.out.printf("ROUND %d:[Guess a number between 0-%d]\n\n",r,n-1);
        for(int i=0;i<3;i++)
        {
            System.out.printf("Enter your guess: ");
            guess = sc.nextInt();
            if(guess==num)
            {
                System.out.printf("\nCorrect Guess!!!\nScore: %d points.",score);
                flag=1;
                break;
            }
            else if(guess>num) 
            {
                System.out.println("Guess is higher than the number.");
                score-=10;
            }
            else 
            {
                System.out.println("Guess is lower than the number.");
                score-=10;
            }
        }
        if(flag==0)
        {
            System.out.printf("\nBetter Luck Next Time!!!\nCorrect Answer: %d\nScore: %d points.",num,score);
        }
        return score;
    }
}

public class Main
{
    public static void main(String[] args)
    {
        for(int i=0;i<30;i++)
        {
            System.out.print("*");
        }
        System.out.print("<<NUMBER GAME>>");
        for(int i=0;i<31;i++)
        {
            System.out.print("*");
        }
        System.out.print("\n\nRULES:\n1) There are 3 rounds[EASY/MEDIUM/HARD] in this game.\n2) Each round consists of 3 attempts for the player to guess the number correctly.\n3) Score given is based on the number of attempts used to guess correctly.\n4) You can play the next round only if your current score is more than 0 points.\n\n");
    
        int final_score=0; int[] arr = {11,26,51};
        for(int j=0;j<3;j++)
        {
            game g = new game(arr[j]);
            final_score+=g.round_exec(j+1);
            if(final_score>0 && j!=2) 
            {
                System.out.printf("\n\nCurrent Score: %d\n",final_score);
                System.out.println("Congratulations! You are promoted to next round!!!\n");
                continue;
            }
            else 
            {
                System.out.printf("\n\nFinal Score: %d\n\n",final_score);
                System.out.println("GAME OVER!!!"); 
                break;
            }
        }
    }
}
