import java.util.Scanner;

abstract class shape
{
	int a,b;
	abstract void printArea();
}

class Rectangle extends shape
{
	void printArea()
	{
	 System.out.println("Area of Rectangle="+(a*b));
	}
}

class Triangle extends shape
{
	void printArea()
	{
	 System.out.println("Area of Triangle="+(0.5*a*b));
	}
}

class Circle extends shape
{
	void printArea()
	{
	 System.out.println("Area of Circle="+(3.142*a*a));
	}
}

class Shapemain
{
 public static void main(String args[])
 {
   Scanner in=new Scanner(System.in);
  Rectangle r=new Rectangle();
  Triangle t=new Triangle();
  Circle c=new Circle();

  System.out.println("Enter length and breadth:");
  r.a=in.nextInt();
  r.b=in.nextInt();
  r.printArea();

  System.out.println("Enter height and base:");
  t.a=in.nextInt();
  t.b=in.nextInt();
  t.printArea();

  System.out.println("Enter radius:");
  c.a=in.nextInt();
  c.printArea();
 }
}