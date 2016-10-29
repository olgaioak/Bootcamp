
public class ResizableCircle extends Circle implements Resizable{
	public void resize(int percentage){
		radius=this.radius*percentage;
	}


}
