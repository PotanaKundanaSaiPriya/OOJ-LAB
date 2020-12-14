class BMSCE implements Runnable
{ Thread t;
   BMSCE()
   {
     t=new Thread(this, "NThread");
System.out.println("CT:"+t);
t.start();
   }
   
  public void run()
   {
  try
  {
  for(int n=5;n>0;n--)
  {
System.out.println("CSE");
Thread.sleep(2000);
  }
  }
  catch(InterruptedException ie)
  {
  System.out.println("CSE Interrupted");
  }
  System.out.println("CSE quitting");
   }
}

class thread
{
public static void main(String ss[])
{
BMSCE b1=new BMSCE();
try
{
for(int n=5;n>0;n--)
{
System.out.println("BMS COLLEGE OF ENGINEERING");
Thread.sleep(10000);
}
}
catch(InterruptedException ie)
{
System.out.println("BMS COLLEGE OF ENFINEERING interrupted");
}
System.out.println("BMS COLLEGE OF ENFINEERING quitting");
}
}
