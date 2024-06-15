package lab_file;


class Shape
{
	
	int r,l,b,h;
	
	Shape(){
		System.out.println(" SHAPE.");
	}
	
	void draw()
	{
		System.out.println("DRAW A SHAPE.");
	}
	
	void erase()
	{
		System.out.println("Shape is erase.");
	}
}

class Circle extends Shape
{
	void draw(int r)            // overloading
	{
		System.out.println("AREA OF CIRCLE = "+Math.PI*r*r);
	}
	
	void erase()
	{
		System.out.println("erase a shape.");  // overriding
	}
}

class Triangle extends Shape
{
	void draw(int b,int h)
	{
		System.out.println("AREA OF TRIANGLE = "+0.5*b*h); // overloading
	}
	
	void erase()
	{
		System.out.println("erase a shape.");  // overriding
	}
}

class Square extends Shape
{
	void draw(int l,int b)
	{
		System.out.println("AREA OF SQUARE = "+l*b); // overloading
	}
	
	void erase()
	{
		System.out.println("erase a shape.");  // overriding
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Circle c1 = new  Circle();
        c1.draw(2);
         c1.erase();
         
        Triangle t1 = new  Triangle();
         t1.draw(4,3);
         t1.erase();
         
        Square s1 = new  Square();
         s1.draw(4,3);
         s1.erase();
         
         Shape sh1 = new  Shape();
         sh1.draw();
        sh1.erase();
	}
	//method of polymorphism	
		
		/*Shape[] shapes = new Shape[3];
        shapes[0] = new Circle();
        shapes[1] = new Triangle();
        shapes[2] = new Square();

        for (Shape shape : shapes) 
        {
            shape.draw();
            shape.erase();
            System.out.println();*/
	        }
	    
	
      // second method polymorphism  
	

