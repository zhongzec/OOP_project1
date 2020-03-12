import java.util.*;
public class  Customers
{
	
	public String type=" ";
	public int score=0;

	public void setType(String ty)
	{
		type=ty;
	}

	public void setScore(int sc)
    {
		score=sc;
	}

	public String getType()
	{
		return type;
	}

	public int getScore()
	{
		return score;
	}
	
	public Vector customerData()
	{
		Vector v=new Vector();
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Please enter the 2 pieces of information for type and score for a customer object separated by space or type done");
		String str=scan.nextLine();
		while(!str.equals("done"))
		{
			Customers c1=new Customers();
		    StringTokenizer strtok=new StringTokenizer(str);
		    String type=strtok.nextToken();
			c1.setType(type);
			String score=strtok.nextToken();
			int sc=Integer.parseInt(score);
			c1.setScore(sc);
			v.add(c1);
			System.out.println("Please enter the information for type and score for a customer object separated by space or type done");
			str=scan.nextLine();
		}
		
		return v;
	}

	public String toString()
	{
		return "type="+" "+type+" "+"score="+" "+score;
	}
}
