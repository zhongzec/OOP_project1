//George Koutsogiannakis
package Client.Services.Enums.Help;
public class  UtilityCosts
{
	double electricity=0.0;
	double gas=0.0;
	double water=0.0;
    static double utilcostsforallobjects=0.0;
	public UtilityCosts()
	{

	}
	public UtilityCosts(double e, double g, double w)
	{
		electricity=e;
		gas=g;
		water=w;
	}

	public double getElectricity()
	{
		return electricity;
	}
	public void setElectricity(double el)
	{
		electricity=el;
	}
	public double getGas()
	{
		return gas;
	}
	public void setGas(double ga)
	{
		gas=ga;
	}
	public double getWater()
	{
		return water;
	}
	public void setWater(double wa)
	{
		water=wa;
	}
	public String toString()
	{
		String out="The electricity is:"+" "+electricity+" "+"The gas is:"+" "+gas+" "+"The water is:"+" "+water;
		return out;
	}
     public double getUtilities()
	{
		 return utilcostsforallobjects;
	}
	public double totalUtil()
	{
		double total=electricity+gas+water;
		utilcostsforallobjects=utilcostsforallobjects+total;
		System.out.println("util cost for this object="+total);
		System.out.println("total utilities of all objects="+utilcostsforallobjects);
		return total;
	}
}
