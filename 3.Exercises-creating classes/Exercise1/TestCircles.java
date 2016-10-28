class TestCircles {
	public static void main (String args[]){
		Circle c = new Circle();
		c.setX(2);
		c.setY(1);
		c.setR(4);
		c.print();
		Circle c1 = new Circle(2,3);
		c1.print();
		Circle c2 = new Circle(1,2,3);
		c2.print();
		Circle c3 = new Circle(2,3,4);
		Circle c4 = c3.copy();
		c3.print();
		c4.print();
		c3.setX(2);
		c3.setY(3);
		c3.setR(6);
		c3.print();
		if (c3.cocentric(c4))
			System.out.println("cocentric");
		else
			System.out.println("not-cocentric");

		System.out.println("Number of existing circles : " + Circle.getCount());


	}
}