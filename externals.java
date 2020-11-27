//EXTERNALS CLASS
package SEE;
import java.util.*;
public class externals extends CIE.student
{
 Scanner sc = new Scanner(System.in);
 public double seemarks[] = new double[5];
 public void get1()
 {
  for(int i=0;i<5;i++)
  {
   System.out.println("Enter the see mark out of 100 in subject"+(i+1));
   seemarks[i]=sc.nextDouble();
  }
 }
} 