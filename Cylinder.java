public class Cylinder extends Circle
{
	private double length;
	public Cylinder(double radius, double length)
	{
		super(radius);
		this.length = length;
	}
	public double getLength()
	{
		return length;
	}
	public double findVolume()
	{
		return getArea()*length;
	}
	public double findWeight()
	{
		return getWeight()*findVolume();
	}
	public double findSurfaceArea()
	{
		return ((2*Math.PI*Math.pow(radius,2))+(2*Math.PI*radius*length));
	}
}