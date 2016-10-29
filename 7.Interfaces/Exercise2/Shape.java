
public class Shape implements Agreeable {
	int width;
	int height;
	
	Shape(){
		
	}
	
	Shape(int width, int height){
		this.width=width;
		this.height=height;
		
	}

	public void isSmallerThan(Agreeable other) {
		Shape another = (Shape) other; // de mporw na ftiaxw antik Agreeable opote  kanw casting se shape gia na sigkrinw 
		if (this.calcArea()<another.calcArea()){
			System.out.println("Is Smaller");
		}

	}
	public int calcArea(){
		return (int) width * height;
		
	}
	

}
