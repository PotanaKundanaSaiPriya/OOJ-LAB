//INTERNALS CLASS
package CIE;
import java.util.*;

public class internals extends CIE.student
{
 public double ciemarks[] = new double[5];
 public void get()
 {
  for(int i=0;i<5;i++)
   {
    System.out.println("Enter the cie mark out of 50 in subject"+(i+1));
    Scanner sc = new Scanner(System.in);
    ciemarks[i]=sc.nextDouble();
   }
}
}
 





