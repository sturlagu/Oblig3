public class Circle extends GeometricObject
{
  	protected double radius;
  	public Circle(double radius)
  	{
		this.radius = radius;
	}
	public double getRadius()
	{
		return radius;
	}
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	public double getArea()
	{
		return radius * radius * Math.PI;
	}
	public double getCircumference()
	{
		return Math.PI*(radius+radius);
	}
	public double findVolume()
	{
		return 0;
	}
	public double findArea()
	{
		return getArea();
	}
	public double findWeight()
	{
		return 0;
	}
	public double findCircumference()
	{
		return getCircumference();
	}
}
