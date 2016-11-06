package exercise2;

public class Rectangle extends Shape{
	private int a, b;
	
	Rectangle(){
		super(2);
		this.a=2;
		this.b=3;
	}
	
	Rectangle(int a, int b){
		super(2);
		this.a=a;
		this.b=b;
	}
	
	
	/**  Getters and Setters*/
	public int getA(){return this.a;}
	public void setA(int a){this.a=a;}
	public int getB(){return this.b;}
	public void setB(int b){this.b=b;}
	
	public String toString(){
		return "\nSide a:" + this.a + "\nSide b:" + this.b + super.toString();	
	}
	public boolean areEqual(Rectangle r){
		if (this.a==r.a & this.b==r.b)
			return true;
		else 
			return false;
	}
	public boolean isSquare(){
		if (this.a==this.b)
			return true;
		else
			return false;	
	}
	public void draw(){
		for (int i=0;i<this.a; i++){
				for (int j=0;j<this.b; j++){
					System.out.print("*");	
				}
			System.out.println(""); //new line 
		}
	
	}
	public Rectangle copy(){
		Rectangle rect = new Rectangle();
		rect.a = this.a;
		rect.b = this.b;
		return rect;
	}
	
	public double area(){
		return this.a * this.b;
		
	}
	public double perimeter(){
		return 2* this.a * this.b;
		
	}

}

