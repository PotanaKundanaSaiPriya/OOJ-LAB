import CIE.*;
import SEE.*;
import java.util.*;
class Main
{
 public static void main(String args[])
{
 Scanner sc = new Scanner(System.in);
 int n;
 double total=0;
System.out.println("Enter the number of students");
n=sc.nextInt();
CIE.internals c1[]=new CIE.internals[n];
SEE.externals s1[] = new SEE.externals[n];
for(int i=0;i<n;i++)
{
 c1[i]=new CIE.internals();
 s1[i]=new SEE.externals();
 c1[i].accept();
 c1[i].get();
 s1[i].get1();
}

 for(int i=0;i<n;i++)
 {
  System.out.println("Student"+(i+1));
  System.out.println("Name:"+c1[i].name+"\tUSN:"+c1[i].usn+"\tSEM:"+c1[i].sem);
  System.out.println("Total Marks");
   for(int j=0;j<5;j++)
    {
     total=c1[i].ciemarks[j]+(s1[i].seemarks[j]/2);
     System.out.println("Subject"+(j+1)+"="+total);
    }
 }
}
}
