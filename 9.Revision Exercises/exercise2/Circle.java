package exercise2;

public class Circle extends Shape {
	public static final double p=3.14;
	private int r;
	
	Circle(int r){
		super(0);
		this.r=r;
	}
	public static double getP(){return p;}

	public double area(){
		return p*this.r*this.r;
	}
	
	public double perimeter(){
		return p*2*this.r;
	}
	
	public void draw(){
		//TODO
	}

}
