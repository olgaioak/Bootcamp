package exercise2;

public class TestRectangle {

	public static void main(String[] args) {
		boolean a;
		Rectangle r1 = new Rectangle();
		r1.draw();
		Rectangle r2 = new Rectangle(3,4);
		r2.draw();
		a=r2.areEqual(r1);
		System.out.println(a);
		Rectangle r3 = new Rectangle(2,2);
		r3.draw();
		Rectangle r4 =r3.copy();
		r4.draw();
		a=r3.isSquare();
		System.out.println(a);
		

	}

}
