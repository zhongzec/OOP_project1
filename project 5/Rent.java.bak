//George Koutsogiannakis
package Client.Services.Enums.Help;
public class Rent 
{
	String location=" ";
	int yearOfLeasing=0;
	int buildingNumber=0;
	static double rentcostforallobjects=0.0;
	public Rent()
	{
	}
	public Rent(String l,int y, int num)
	{
		location=l;
		yearOfLeasing=y;
		buildingNumber=num;
	}
	public String getLocation()
	{
		return location;
	}
	public void setLocation(String lo)
	{
		location=lo;
	}
	public int getYearOfLeasing()
	{
		return yearOfLeasing;
	}
	public void setYearOFLeasing(int yl)
	{
		yearOfLeasing=yl;
	}
	public int getBuildingNumber()
	{
		return buildingNumber;
	}
	public void setBuildingNumnber(int bn)
	{
		buildingNumber=bn;
	}
	 
	public double getRent()
	{
		return rentcostforallobjects;
	}

	public String toString()
	{
		String out="The location is:"+" "+location+" "+"The years of leasing is:"+" "+yearOfLeasing+" "+"The Building # is:"+" "+buildingNumber;
		return out;
	}
	public double rent()
	{
		double buildingRent=Double.parseDouble(location)*yearOfLeasing*150/buildingNumber;
		System.out.println("Building rent="+buildingRent);
		
		rentcostforallobjects=rentcostforallobjects+buildingRent;
		System.out.println("Total rent for all objects is ="+rentcostforallobjects);
		return buildingRent;
	}

}
