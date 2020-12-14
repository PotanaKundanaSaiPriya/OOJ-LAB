import java.util.*;
class WrongAge extends Exception
{
	public String toString()
	{
		return "Please enter the right age:"+"Son's age > Father's age";
               
	}
}

class Father
{
	int i;
}
class Son extends Father
{
        int i;    //hides the i in Father class
	Son(int age1,int age2)
	{
		super.i=age1;   //i in Father class
                i=age2;
	}
 	void show()
  	{
    		System.out.println("Father's age:"+super.i);
    		System.out.println("Son's age:"+ i);
	}
}
class AGE_main1
{
	public static void main(String args[]) throws WrongAge
	{
                int age1,age2;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter Father's age:\n");
                age1=sc.nextInt();
                System.out.println("Enter Son's age:\n");
                age2=sc.nextInt();
                if(age2>age1)
		{
			throw new WrongAge();
		}
		else
		{
			Son s=new Son(age1,age2);
                        s.show();
		}
	}
}
