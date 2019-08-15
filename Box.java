public class Box extends Rectangle
{
	private double height;
	public Box (double length, double width, double height)
	{
		super(length,width);
		this.height = height;
	}
	public double sideTopArea()
	{
		return width*height;
	}
	public double sideBottomArea()
	{
		return length*height;
	}
	public double getHeight()
	{
		return height;
	}
	public void setHeight(double height)
	{
		this.height = height;
	}
	public double findVolume()
	{
		return getArea()*height;
	}
	public double getSurfaceArea()
	{
		return (getArea()* 2 + sideTopArea()* 2 + sideBottomArea()* 2);
	}
	public double findWeight()
	{
		return getWeight()*findVolume();
	}
}