import java.util.*;
class Ex3 {
	public static void main (String args[]){

		 shift();

	}

	public static void shift() {
		int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
		for (int i=0; i<10; i++){
			 System.out.println(array[i]);
		 }
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Enter number of shifts:");
		int a = scanner.nextInt();
		for (int j=0; j<a; j++){
			int[] help = new int[10];
			help[0]= array[array.length-1];

		    for (int i=0; i<9; i++){
				help[i+1]= array[i];
			}
			System.out.println (Arrays.toString(help)); //tipwnei ton pinaka sti seira
			System.arraycopy (help,0,array,0,10); //antigrafei ton help ston array(void arraycopy(Object src, int srcPos, Object dest, int destPos, int length))
            }

	}

}