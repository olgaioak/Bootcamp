class Dice {

	public void roll (){
		int dice1 = 0, dice2 = 0, i = 0;
		while ((dice1 != 1) | (dice2 != 1)) {

			//Min + (int)(Math.random() * ((Max - Min) + 1))
			dice1 = 1 + (int)(Math.random() * 6);
			dice2 = 1 + (int)(Math.random() * 6);
			System.out.println (dice1 + "--" + dice2);
	        i++;
		}
		System.out.println ("The result is " + i);

	}

	public static void main (String args[]){
		Dice di = new Dice();
		di.roll();


	}
}