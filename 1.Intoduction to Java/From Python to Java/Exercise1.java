class Exercise1 {
	public static void main (String args[]){
		int j=1;
		int [] pinakas = new int[9];
		while (j<=9){
			for (int i=0; i<9; i++){
				if (i<j){
					pinakas[8-i] = j;
				}
			}
			j++;
			for (int i=0; i<9; i++){
				System.out.print (pinakas[i] + " ");
			}
			System.out.println ();
		}


	}
}