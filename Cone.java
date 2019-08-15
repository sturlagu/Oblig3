public class Cone extends Circle
{
	private double height;
	public Cone (double radius, double height)
	{
		super(radius);
		this.height = height;
	}
	public double getHeight()
	{
		return height;
	}
	public double findHypo()
	{
		return Math.sqrt(Math.pow(radius,2) + Math.pow(height,2));
	}
	public double findVolume()
	{
		return ((Math.PI*Math.pow(radius,2)*height)/3);
	}
	public double findSurfaceArea()
	{
		return (Math.PI*radius*findHypo()+Math.PI*Math.pow(radius,2));
	}
	public double findWeight()
	{
		return getWeight()*findVolume();
	}
}