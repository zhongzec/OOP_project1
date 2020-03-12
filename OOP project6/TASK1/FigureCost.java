import java.util.*;
public class FigureCost
{
	public static void main(String[] args) 
	{
		
		ArrayList<Figure> list=new ArrayList<Figure>();
		
		Scanner scan1=new Scanner(System.in);
		System.out.println("Please enter the shape the length(or radius) and the asked value separated by space or type done");
		String line=scan1.nextLine();
		while(!line.equals("done"))
		{
			StringTokenizer strtok1=new StringTokenizer(line);
			String sha=strtok1.nextToken();
			String length=strtok1.nextToken();
			double len=Double.parseDouble(length);
			String ask=strtok1.nextToken();
			if(sha.equals("cube"))
			{
				Cube cube=new Cube(sha, len, ask);
				list.add(cube);
			}
			else if(sha.equals("sphere"))
			{
				Sphere sphere=new Sphere(sha,len,ask);
				list.add(sphere);
			}
			System.out.println("Please enter the shape the length(or radius) and the asked (area or volume) separated by space or type done");
			line=scan1.nextLine();
		}
		System.out.println(list.size());
		
		ArrayList<String> costslist=new ArrayList<String>();	
		for(int i=0; i<list.size(); i++)
		{
		  
		   try
		   {
		         
				 Figure fig=list.get(i);
				
				 costslist=fig.costToDraw();
				 System.out.println("Calculating the cost for shape object:"+" "+list.get(i).toString());
		   }
		   catch (TooLargeCostException tlc)
		   {
				System.out.println(tlc.getMessage());
		   
		   }
		   
		  
		   
                 
				for(int j=0; j<costslist.size(); j++)
					System.out.println(costslist.get(j));

		   
		
		
		
		}

	}
}
