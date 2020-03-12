//George Koutsogiannakis
package Client.Services.Enums.Help;
public class  Material
{
	String materialName=" ";
	double unitPrice=0.0;
	int quantity=0;
    static double material=0.0;
	public Material()
	{
	
	}

	public Material(String mn, double up, int q)
	{
		materialName=mn;
		unitPrice=up;
		quantity=q;
	}

	public String getMaterialName()
	{
		return materialName;
	}
	public void setMaterialName(String mana)
	{
		materialName=mana;
	}
	public double getUnitPrice()
	{
		return unitPrice;
	}
	public void setUnitPrice(double uni)
	{
		unitPrice=uni;
	}
	public int getQuantity()
	{
		return quantity;
	}
	public void setQuantity(int qua)
	{
		quantity=qua;
	}
	public double getMaterial()
	{
		return material;
	}
	public String toString()
	{
		String out="The material name is:"+"  "+materialName+" "+"The untit price is:"+" "+unitPrice+" "+"The quantity is:"+" "+quantity;
		return out;
	}
	public double materialPrice()
	{
		double price=0.0;
		if(quantity>=100)
			price=(unitPrice*quantity)-0.2*(unitPrice*quantity);
		else
			price=(unitPrice*quantity)-0.1*(unitPrice*quantity);
		materialcostforallobjects=materialcostforallobjects+price;
		System.out.println("Material price="+price);
		System.out.println("Accumulted material cost for all objects is="+materialcostforllobjects);
		return price;
	}

}
