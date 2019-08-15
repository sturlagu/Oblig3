public class Sphere extends Circle
{
	public Sphere (double radius)
	{
		super(radius);
	}
	public double findVolume ()
	{
		return ((4*Math.PI*Math.pow(radius,3))/3);
	}
	public double findWeight()
	{
		return getWeight()*findVolume();
	}
	public double findSurfaceArea()
	{
		return (4*(Math.PI*Math.pow(radius,2)));
	}
}