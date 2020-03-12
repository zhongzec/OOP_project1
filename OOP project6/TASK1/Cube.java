import java.util.*;
import java.text.DecimalFormat;
public class Cube extends Figure  implements INT3
{
	public double length=0.0;
	String asked=" ";
	static int count=0;
	static Vector v4=new Vector();
	public Cube()
	{
		super();
		length=2.0;
	}
	public Cube(String n, double l, String a)
	{
		super(n);
		length=l;
		asked=a;
		
	}

	public double calculateArea() throws TooLargeAreaException
	{
		double area=6*Math.pow(length,2.0);
		if(area>1000)
		{
			
			throw new TooLargeAreaException();
		}
		return area;
	}

	public double calculateVolume() throws TooLargeVolumeException
	{
		double volume=Math.pow(length,3);
		if(volume>10000)
		{ 
			
			throw new TooLargeVolumeException();
		}
		return volume;
	}

	
	public Vector secretData()
	{
		 Impl i=new Impl();
		 Vector v3=i.secretData();
		 return v3;
	}

	public ArrayList<String> costToDraw() throws TooLargeCostException
	{
		count++;
		double cost=0.0;
		String str=" ";
		ArrayList<String> strcost=new ArrayList<String>();
		
		if(count==1&&Sphere.count==0)
		{
			v4=secretData();
		}
		else if(count==1&&Sphere.count>0)
			v4=Sphere.v4;
		
		
		for(int i=0; i<v4.size(); i++)
		{
			Object o=v4.get(i);
			Customers c=(Customers)o;
			
			if(c.getType().equals("Architect")&&c.getScore()<600&&asked.equals("area"))
			{  
				try
				{
					 System.out.println("The Customer is:"+" "+c.toString());
					 cost=20*calculateArea();
				}
				catch (TooLargeAreaException tla)
				{
				
				  System.out.println(tla.getMessage());
				
				
				}
				finally
				{
					if(cost>400000)
					{
						 
						 throw new TooLargeCostException();
					}
					str="The area drawing cost for an Architect with score <600 is"+" "+(new DecimalFormat("#.##")).format(cost);
					strcost.add(str);
				}
			}
			else if(c.getType().equals("Architect")&&c.getScore()<600&&asked.equals("volume"))
			{
				try
				{
					System.out.println("The Customer is:"+" "+c.toString());
					cost=40*calculateVolume();
				}
				catch (TooLargeVolumeException tlv)
				{
					 System.out.println(tlv.getMessage());
				}
				finally
				{
					if(cost>400000)
					{
					 
					  throw new TooLargeCostException();
					}
					str="The volume drawing cost for an Architect with score <600 is"+" "+(new DecimalFormat("#.##")).format(cost);
					strcost.add(str);
				}
				
			}
			else if(c.getType().equals("Architect")&&c.getScore()>=600&&asked.equals("area"))
		    {  
				try
				{
					System.out.println("The Customer is:"+" "+c.toString());
					cost=10*calculateArea();
				}
				catch (TooLargeAreaException tla)
				{
						System.out.println(tla.getMessage());
				}
				finally
				{
					if(cost>400000)
					{
						
						 throw new TooLargeCostException();
					}
					str="The area drawing cost for an Architect withscore >=600 is"+" "+(new DecimalFormat("#.##")).format(cost);
					 strcost.add(str);
				}
			}
			else if(c.getType().equals("Architect")&&c.getScore()>=600&&asked.equals("volume"))
		    {  
				try
				{
					System.out.println("The Customer is:"+" "+c.toString());
					cost=20*calculateVolume();
				}
				catch (TooLargeVolumeException tlv)
				{
					System.out.println(tlv.getMessage());
				}
				finally
				{
					if(cost>400000)
					{
						
						 throw new TooLargeCostException();
					}
					str="The volume drawing cost for an Architect with score >=600 is"+" "+(new DecimalFormat("#.##")).format(cost);
					 strcost.add(str);
				}
			}
			else if(c.getType().equals("Other")&&c.getScore()<600&&asked.equals("area"))
		    {  
				try
				{
					System.out.println("The Customer is:"+" "+c.toString());
					cost=30*calculateArea();
				}
				catch (TooLargeAreaException tla)
				{
					System.out.println(tla.getMessage());
				}
				finally
				{
					if(cost>400000)
					{
						 
						 throw new TooLargeCostException();
					}
					str="The area drawing cost for an Other with score <600 is"+" "+(new DecimalFormat("#.##")).format(cost);
					 strcost.add(str);
				}
			}
			else if(c.getType().equals("Other")&&c.getScore()<600&&asked.equals("volume"))
		    {	
				try
				{
					System.out.println("The Customer is:"+" "+c.toString());
					cost=60*calculateVolume();
				}
				catch (TooLargeVolumeException tlv)
				{
					System.out.println(tlv.getMessage());
				
				}
				finally
				{
					if(cost>400000)
					{
						 
						 throw new TooLargeCostException();
					}
					str="The volume drawing cost for an Other with score <600 is"+" "+(new DecimalFormat("#.##")).format(cost);
					 strcost.add(str);
				}
			}
			else if(c.getType().equals("Other")&&c.getScore()>=600&&asked.equals("area"))
		    {  
				try
				{
					System.out.println("The Customer is:"+" "+c.toString());
					cost=20*calculateArea();
				}
				catch (TooLargeAreaException tla)
				{
					System.out.println(tla.getMessage());
				}
				finally
				{
					if(cost>400000)
					{
						
						 throw new TooLargeCostException();
					}
					str="The area drawing cost for an Other with score >=600 is"+" "+(new DecimalFormat("#.##")).format(cost);
					 strcost.add(str);	
				}
			}
			else if(c.getType().equals("Other")&&c.getScore()>=600&&asked.equals("volume"))
		    {  
				try
				{
					System.out.println("The Customer is:"+" "+c.toString());
					cost=50*calculateVolume();
				}
				catch (TooLargeVolumeException tlv)
				{
					
					System.out.println(tlv.getMessage());
				}
				finally
				{
					if(cost>400000)
					{
						 
						 throw new TooLargeCostException();
					}
					str="The volume drawing cost for an Other with score>=600 is"+" "+(new DecimalFormat("#.##")).format(cost);
					 strcost.add(str);
				}
			}

        }
		
		return strcost;
	}

	public String toString()
	{
		 String out=super.toString()+" "+"The length is"+" "+length+" "+"And the parameter asked for is:"+" "+asked;
		 return out;
	}
}
