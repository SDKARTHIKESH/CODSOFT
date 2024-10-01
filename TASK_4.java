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
                while(i[0]<Q.length)
                {
                    System.out.println(Q[i[0]]);
                    System.out.print("Enter your option : ");
                    char ch = sc.next().charAt(0);
                    if((i[0]==0 && ch=='c') ||(i[0]==1 && ch=='d') ||(i[0]==2 && ch=='b') ||(i[0]==3 && ch=='b') ||(i[0]==4 && ch=='a'))
                    {
                        score[0]+=10;
                        System.out.printf("\nCorrect Answer!!!\n\nCurrent Score : %d\n\n",score[0]);
                        i[0]++;
                        continue;
                    }
                    else
                    {
                        System.out.printf("\nWrong Answer!!!\n\nCurrent Score : %d\n\n",score[0]);
                        i[0]++;
                        continue;
                    }
                }
                if(i[0]>=Q.length)
                {
                    timer.cancel();
                    System.out.print("Game Over!!!");
                }
            }
        };
        timer.scheduleAtFixedRate(task,1000,10000);
        
    }
}

/*
import java.util.*;

class Main {
    public static void main(String[] args) {
        String[] Q = {
            "Q.1 India won its first Cricket World Cup in ____.\n    a) 1981  b)1991  c)1983  d)1993\n",
            "Q.2 Which planet is known as the Red Planet?\n    a) Uranus  b) Neptune  c) Saturn  d) Mars\n",
            "Q.3 What is the national sport of India?\n    a) Cricket   b) Field Hockey   c) Football   d) Badminton\n",
            "Q.4 Which Indian city is known as the \"Silicon Valley of India\"?\n    a) Chennai    b) Bengaluru    c) Mumbai    d) Kolkata\n",
            "Q.5 What is the minimum age to become the Prime Minister of India?\n    a) 35 years    b) 36 years   c) 37 years    d) 38 years\n"
        };

        Scanner sc = new Scanner(System.in);
        Timer timer = new Timer();
        int[] i = {0};   // Keeps track of the current question index
        int[] score = {0};   // Tracks the player's score
        int timeLimit = 5000;  // Time limit for each question (in milliseconds)

        // Function to handle asking a question and waiting for user input
        class QuestionTask extends TimerTask {
            @Override
            public void run() {
                if (i[0] < Q.length) {
                    System.out.println(Q[i[0]]);
                    System.out.print("Enter your option: ");

                    // A separate thread to capture input within a time limit
                    final char[] userInput = {0}; // Stores user input

                    Thread inputThread = new Thread(() -> {
                        if (sc.hasNext()) {
                            userInput[0] = sc.next().charAt(0);  // Capture user input
                        }
                    });

                    inputThread.start();  // Start the input thread

                    try {
                        inputThread.join(timeLimit);  // Wait for the time limit
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    if (userInput[0] != 0) {
                        // Check if the answer is correct
                        if ((i[0] == 0 && userInput[0] == 'c') || (i[0] == 1 && userInput[0] == 'd') ||
                            (i[0] == 2 && userInput[0] == 'b') || (i[0] == 3 && userInput[0] == 'b') ||
                            (i[0] == 4 && userInput[0] == 'a')) {
                            score[0] += 10;
                            System.out.printf("\nCorrect Answer!!!\n\nCurrent Score: %d\n\n", score[0]);
                        } else {
                            System.out.printf("\nWrong Answer!!!\n\nCurrent Score: %d\n\n", score[0]);
                        }
                    } else {
                        // No answer chosen within time limit
                        System.out.println("\nNo answer chosen!!! Moving to the next question.\n\n");
                    }

                    i[0]++;  // Move to the next question

                    // If more questions remain, restart the timer for the next question
                    if (i[0] < Q.length) {
                        timer.schedule(new QuestionTask(), 0); // Immediately ask the next question
                    } else {
                        // If all questions are done, stop the game
                        System.out.println("Game Over! Final Score: " + score[0]);
                        timer.cancel(); // End the timer
                    }
                } else {
                    timer.cancel();  // Cancel the timer if all questions are done
                    System.out.println("Game Over! Final Score: " + score[0]);
                }
            }
        }

        // Schedule the first question with a 1-second delay
        timer.schedule(new QuestionTask(), 1000);
    }
}*/
