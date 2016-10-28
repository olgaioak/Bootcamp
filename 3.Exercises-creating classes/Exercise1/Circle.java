class Circle {
	private int x , y, r;
	private static final double pi=3.14;
	private static int number_of_circles;
	/* Sets the x coordinate  */
	public void setX(int x) {this.x=x;}
	/* Returns the x coordinate  */
	public int getX(){return x;}
	/* Sets the y coordinate  */
	public void setY(int y) {this.y=y;}
	/* Returns the y coordinate  */
	public int getY(){return x;}
	/* Sets the r coordinate  */
	public void setR(int r) {this.r=r;}
	/* Returns the r coordinate  */
	public int getR(){return x;}


	Circle(){
		this.x = 0;
		this.y = 1;
		this.r = 1;
		number_of_circles++;
	}
	Circle(int x,int z){
		this.x = x;
		this.y=z;
		this.r = 1;
		number_of_circles++;
	}
	Circle(int x, int y, int r){
		this.x = x;
		this.y = y;
		this.r = r;
		number_of_circles++;
	}

	public void print(){
		System.out.println("I'm a circle at point (" +this.x+ ","+ this.y + ") with radius "+this.r);
		System.out.println ("Where " + this.x + " , "+this.y + " and "+ this.r +" are the values of the current circle");
	}
	public double calculateArea(){
		return pi*this.r*this.r;
	}
	public double calculatePerimeter(){
		return pi*2*this.r;
	}
	public Circle copy(){
		Circle new_c = new Circle();
		new_c.x = this.x;
		new_c.y = this.y;
		new_c.r = this.r;
		return new_c;
	}
	public boolean cocentric(Circle c){
		if (this.x==c.getX() & this.y==c.getY())
			return true;
		else
			return false;
	}
	public static int getCount() {
		return number_of_circles;
	}

} // end of class