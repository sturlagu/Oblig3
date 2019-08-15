public class Rectangle extends GeometricObject
{
	protected double length;
	protected double width;
	public Rectangle(double length, double width)
	{
		this.length = length;
		this.width = width;
	}
	public double getLength()
	{
		return length;
	}
	public void setLength(double length)
	{
		this.length = length;
	}
	public double getWidth()
	{
		return width;
	}
	public void setWidth(double width)
	{
		this.width = width;
	}
	public double getArea()
	{
		return length * width;
	}
	public double getCircumference()
	{
		return (length+width)*2;
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