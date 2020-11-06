import java.util.Scanner;

class account
{
	private String name;
	private long account_number;
	private int account_type;
	double balance;

	void get_data()
	{
	 Scanner ss=new Scanner(System.in);
	 System.out.println("enter your name");
	 name=ss.next();
	 System.out.println("enter the account_number");
	 account_number=ss.nextLong();
         System.out.println("choose the account type ");
	 System.out.println("1.savings account");
 	 System.out.println("2.current account");
	 account_type=ss.nextInt();
	}

	int return_account_type()
	{
	 return account_type;
	}
}

class savings extends account
{
	Scanner ss=new Scanner(System.in);
	double amount;

	void get_sav_balance()
	{
	 System.out.println("enter the amount to be placed in your savings account");
	 amount=ss.nextDouble();
	 balance+=amount;
	}

	void display_sav_blnce()
	{
	 System.out.println("balance="+balance);
	}

	void compute_sav_interest()
	{
	 System.out.println("interest of 5% shall be added to your balance");
	 balance=balance+(.05*balance);
	}

	void withdrawl_sav()
	{
	 System.out.println("enter the amount to be withdrawn");
	 amount=ss.nextDouble();
	 balance=balance-amount;
	}

}

class current extends account
{
	Scanner ss=new Scanner(System.in);
	double amount;
	final double min_balance=5000;

	void get_cur_balance()
	{
	 System.out.println("enter the amount to be placed in your current account");
	 amount=ss.nextDouble();
	 balance+=amount;
 	}

	void display_cur_blnce()
	{
	 System.out.println("balance="+balance);
	}

	void compute_cur_service_charges()
	{
	  if(balance<min_balance)
		{
		 System.out.println("service tax of rs.500 shall be levied");
		 balance=balance-500;
		}
	  else
		{
		 System.out.println("minimum balance is maintained");
		}
	}

	void withdrawl_cur()
	{
	  System.out.println("enter the amount to be withdrawn");
	  amount=ss.nextDouble();
	  balance=balance-amount;
	}

}

class bankmain
{
public static void main(String args[])
{

	System.out.println("enter the bank details");
	account acc=new account();
	acc.get_data();
	int type=acc.return_account_type();
	if (type==1)
        {
         System.out.println("SAVINGS ACCOUNT");
         savings sav=new savings();
	 sav.get_sav_balance();
	 sav.display_sav_blnce();
	 sav.compute_sav_interest();
	 sav.display_sav_blnce();
	 sav.withdrawl_sav();
	 sav.display_sav_blnce();
        }
        if(type==2)
        {
         System.out.println("CURRENT ACCOUNT");
 	 current cur=new current();
	 cur.get_cur_balance();
	 cur.display_cur_blnce();
	 cur.compute_cur_service_charges();
	 cur.display_cur_blnce();
	 cur.withdrawl_cur();
	 cur.display_cur_blnce();
	}
}
     
}
