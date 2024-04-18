package interfaceClass;
interface Drawable
{
void draw();

}
class Rectangle implements Drawable
{
	public void draw()
	{
System.out.println("drawing rectangle");
}
}
class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("drawing circle");
	}
	}

public class Main {

	public static void main(String[] args) {
		Rectangle d=new Rectangle();
		Circle c=new Circle();
		d.draw();
		c.draw();
		
		
		

	}

}
