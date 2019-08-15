public abstract class GeometricObject
{
  	private double weight = 7.8;
  	public double getWeight()
  	{
		return weight;
	}
	public String toString()
	{
		return "weight = 7.8 kg/dm^3";
	}
	public abstract double findArea();
	public abstract double findVolume();
	public abstract double findCircumference();
	public abstract double findWeight();
}

