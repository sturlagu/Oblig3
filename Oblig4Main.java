// This program calculates different values related to various objects
import java.util.Scanner;

public class Oblig4Main
{
	static Scanner input = new Scanner(System.in);
  	public static void main(String[] args)
  	{
		boolean choice = true;
		System.out.println("This program calculates different values related to various objects");
		while(choice)
		{
			System.out.println("Press 1 for circle\nPress 2 for cylinder\nPress 3 for rectangle");
			System.out.println("Press 4 for box\nPress 5 for cone\nPress 6 for sphere");
			int inputType = input.nextInt();
			if (inputType > 0 && inputType < 7)
			{
				if(inputType == 1)
				{
					System.out.println("You chose circle, please specify a radius");
					int radius = input.nextInt();
					Circle c = new Circle(radius);
					System.out.println("The radius is " + c.getRadius());
					System.out.println("The area is " + c.getArea());
					System.out.println("The circumference is " + c.getCircumference());
					choice = goOn();
				}
				else if(inputType == 2)
				{
					System.out.println("You chose cylinder, please specify a radius");
					int radius = input.nextInt();
					System.out.println("Now choose the length of the cylinder");
					int length = input.nextInt();
					Cylinder s = new Cylinder(radius,length);
					System.out.println("The cylinders " + s);
					System.out.println("The cylinder length is " + s.getLength());
					System.out.println("The cylinder volume is " + s.findVolume());
					System.out.println("The surface area volume is " + s.findSurfaceArea());
					System.out.println("The cylinder weight is " + s.findWeight());
					choice = goOn();
				}
				else if(inputType == 3)
				{
					System.out.println("You chose rectangle, please specify a length");
					int length = input.nextInt();
					System.out.println("Now choose the width of the rectangle");
					int width = input.nextInt();
					Rectangle r = new Rectangle(length,width);
					System.out.println("The rectangles " + r);
					System.out.println("The area is " + r.getArea());
					System.out.println("The circumference is " + r.getCircumference());
					choice = goOn();
				}
				else if(inputType == 4)
				{
					System.out.println("You chose box, please specify a length");
					int length = input.nextInt();
					System.out.println("Now choose the width of the rectangle");
					int width = input.nextInt();
					System.out.println("Now choose the height of the rectangle");
					int height = input.nextInt();
					Box b = new Box(length,width,height);
					System.out.println("The rectangles " + b);
					System.out.println("The volume is " + b.findVolume());
					System.out.println("The surface area is " + b.getSurfaceArea());
					System.out.println("The weight is " + b.findWeight());
					choice = goOn();
				}
				else if(inputType == 5)
				{
					System.out.println("You chose cone, please specify a height");
					int height = input.nextInt();
					System.out.println("Now choose the radius of the cone");
					int radius = input.nextInt();
					Cone co = new Cone(radius,height);
					System.out.println("The cones " + co );
					System.out.println("The volume is " + co.findVolume());
					System.out.println("The surface area is " + co.findSurfaceArea());
					System.out.println("The weight is " + co.findWeight());
					choice = goOn();
				}
				else if(inputType == 6)
				{
					System.out.println("You chose sphere, please specify a radius");
					int radius = input.nextInt();
					Sphere sp = new Sphere(radius);
					System.out.println("The cones " + sp );
					System.out.println("The volume is " + sp.findVolume());
					System.out.println("The surface area is " + sp.findSurfaceArea());
					System.out.println("The weight is " + sp.findWeight());
					choice = goOn();
				}
			}
			else
			{
				System.out.println("Unknown number, please try again!");
				System.out.println("");
			}
		}// while loop end
	}// main end
	public static boolean goOn()
	{
		int choice;
		System.out.println("");
		System.out.println("Would you like to continue? Yes(1), No(2)");
		choice = input.nextInt();
		while(true)
		{
			if(choice > 0 && choice  < 3)
			{
				if (choice == 1)
				{
					return true;
				}
				else
				{
					return false;
				}
			}
			else
			{
				System.out.println("Try again");
				choice = input.nextInt();
			}
		}
	}
}
