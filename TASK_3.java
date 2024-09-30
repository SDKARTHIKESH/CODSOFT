import java.util.*;
class User
{
    public double Acct_Bal;
}

class ATM extends User
{
    public ATM(double x)
    {
        this.Acct_Bal=x;
    }
    public void Withdraw(double x)
    {
        if(x<=this.Acct_Bal && x>0) 
        {
            this.Acct_Bal-=x;
            System.out.printf("\nAmount %.2f is withdrawn successfully!!!\n\n",x);
        }
        else if(x<=0) System.out.println("\nInvalid withdrawal amount. Please try again!!!\n");
        else System.out.println("\nInsufficient balance for this transaction!!!\n");
    }
    
    public void Deposit(double x)
    {
        if(x>0)
        {
            this.Acct_Bal+=x;
            System.out.printf("\nAmount %.2f is deposited successfully!!!\n\n",x);
        }
        else System.out.println("\nInvalid deposit amount. Please try again!!!\n");
    }
    
    public void Check_Balance()
    {
        System.out.printf("\nYour current balance: %.2f\n\n",this.Acct_Bal);
    }
}

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in); int ch=0; double x=-1;
        for(int i=0;i<29;i++) System.out.print("*");
        System.out.print("<<ATM INTERFACE>>");
        for(int i=0;i<30;i++) System.out.print("*");
        System.out.println("\n");
        while(x<=0){
        System.out.print("Enter initial amount to deposit in Bank Account : ");
        x = sc.nextDouble();
        if(x<=0) System.out.print("\nInvalid deposit amount. Please try again!!!\n\n");
        }
        System.out.println();
        ATM a = new ATM(x);
        do
        {
            System.out.print("Menu:\n1. Withdraw Money\n2. Deposit Money\n3. Check Bank Balance\n4. Exit\n\n");
            System.out.print("Choose an option : ");
            ch = sc.nextInt();
            switch(ch)
            {
                case 1:
                    System.out.print("\nEnter the amount to withdraw : ");
                    a.Withdraw(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("\nEnter the amount to deposit : ");
                    a.Deposit(sc.nextDouble());
                    break;
                case 3:
                    a.Check_Balance();
                    break;
                default:
                if(ch!=4) System.out.print("\nInvalid option. Please try again.\n\n");
                break;
            }
        }while(ch!=4);
        
        System.out.print("\nThank you for using the ATM. Goodbye!!!\n");
        sc.close();
    }
}
