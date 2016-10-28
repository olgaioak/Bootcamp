import java.util.*;
class Ex4 {
	public static void main (String args[]){
		shift();
	}

	public static void shift() {
		int[] array = new int[]{1,2,3,4,5,6,7,8,9,10};
		Double [] d = new Double[10];
		for(int i=0;i<10; i++){
			Integer x = new Integer(array[i]); // d[i] = (double)array[i];
			d[i]=x.doubleValue();
		}
		for (int i=0; i<10; i++){
			 System.out.println(array[i]);
		 }
		Scanner scanner = new Scanner(System.in);
		System.out.print ("Enter number of shifts:");
		int a = scanner.nextInt();
		for (int j=0; j<a; j++){
			Double[] help = new Double[10];
			help[0]= d[d.length-1];

			for (int i=0; i<9; i++){
				help[i+1]= d[i];
			}
			System.out.println (Arrays.toString(help));
			System.arraycopy (help,0,d,0,10);
		}

	}


}