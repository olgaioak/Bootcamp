class Exercise5 {
	public static void main (String args[]){
		double sum = 0.0;
		for (double i=1.0; i<6.0; i++){
			System.out.println (sum + (1/i));
			sum = sum + (1/i) ;
		}

	}
}