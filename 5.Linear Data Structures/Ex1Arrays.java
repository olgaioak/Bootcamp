
public class Ex1Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1, 3, 1, 2, 5, 6, 6, 8, 9, 12, 1, 13, 3, 1};
		int min = array[0];
		StringBuilder builder = new StringBuilder();
		/** StringBuilder example */
		for(int i=0; i<=array.length-1; i++) {
			if (array[i]<min){
				min = array[i];
				builder = new StringBuilder();
				builder.append(i);
				builder.append(", ");
			} else if (array[i]==min) {
				builder.append(i);
				builder.append(", ");
				
			}
			
		}
		builder.setLength(builder.length() - 2);
		System.out.print("Min is " + min + " in positions:" + builder);
		

	}

}
