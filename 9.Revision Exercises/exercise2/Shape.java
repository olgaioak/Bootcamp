package exercise2;

public abstract class Shape {
	protected int sides_number;
	
	public abstract double area();
	public abstract double perimeter();
	public abstract void draw();
	
	Shape(int sides_number){
		this.sides_number=sides_number;
	}
		
	/**  Getters and Setters*/
	public int getSides_number(){return this.sides_number;}
	public void setSides_number(int sides_number){this.sides_number=sides_number;}
	
	public String toString(){
		return "\nNumber of sides:" + this.sides_number;
	}
	

}
