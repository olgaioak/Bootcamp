package exercise2;

public class TestShape {

	public static void main(String[] args) {
		boolean a;
		Shape rer1=new Rectangle(2,3);
		Rectangle rec2= new Rectangle(3,5);
		a=rer1.equals(rec2);
		System.out.println(a);
		a=rec2.isSquare();
		System.out.println(a);
		rer1.draw();
		rec2.draw();
		System.out.println(rer1.toString());
		System.out.println(rec2.toString());
		Circle c = new Circle(2);
		c.area();
		double d= Circle.getP();
		Shape [] shape_array = new Shape [3];
		shape_array[0]= new Circle(2);
		shape_array[1]= new Rectangle(2,3);
		shape_array[2]= new Circle(2);
		
		for (int i=0; i<shape_array.length;i++){
			System.out.println(shape_array[i].toString());
		}
		
		

	}

}
