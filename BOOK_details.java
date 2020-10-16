import java.util.Scanner;

class Book
{
	private String name,author;
	private double price;
	private int num_pages;

        Book()
	{
		name="The Shining";
		author="Stephen King";
		price=399.00;
		num_pages=500;	
	}

	void getDetails()
	{
		Scanner in=new Scanner(System.in);
		System.out.println("\nEnter the book name: ");
		name=in.nextLine();
		System.out.println("Enter the author name: ");
		author=in.nextLine();
		System.out.println("Enter the the no.of pages: ");
		num_pages=in.nextInt();
		System.out.println("Enter the price: ");
		price=in.nextDouble();
	}

	public String toString()
	{
		String temp="Book name: "+name+"\nAuthor name: "+author+"\nNo.of pages: "+num_pages+"\nPrice: "+price+"\n";
		return(temp);	
	}

}
class BOOK_details
{
  public static void main(String args[])
  {
	int i,n;
	Scanner in=new Scanner(System.in);
	System.out.print("Enter the number of books: ");
	n=in.nextInt();
	Book[] obj=new Book[n];
	for(i=0;i<n;i++)
	{
		obj[i]=new Book();	
	}
	System.out.println("\t\t***Enter Book Details***");
        for(i=0;i<n;i++)
	{
		System.out.println("\nBook "+(i+1)+";");
		obj[i].getDetails();
	}
	System.out.println("\t\t***Book Details***");
        for(i=0;i<n;i++)
	{
		System.out.println(obj[i]);
	}
  }
}