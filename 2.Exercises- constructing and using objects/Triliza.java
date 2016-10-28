import java.util.Scanner;
class Triliza {
	public static void main(String [] args){

		char [][]triliza = new char[3][3];
		char s='O';
		boolean game=true;
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				triliza[i][j] = '-';
			}
        }
		while (game){
			for (int player=1;player<=2;player++){
				drawFunction(triliza);
				Scanner scanner = new Scanner(System.in);
				System.out.print ("Please enter a row number");
		        int a = scanner.nextInt();
		        System.out.print ("Please enter a column number");
		        int b = scanner.nextInt();
		        if (triliza[a-1][b-1]=='O' | triliza[a-1][b-1]=='X' ){
					System.out.println ("Occupied position. Please play again.");
					System.out.print ("Please enter a row number");
					a = scanner.nextInt();
					System.out.print ("Please enter a column number");
					b = scanner.nextInt();
				}
		        if (player==1){
					triliza[a-1][b-1]= 'O';
				    s= 'O';
				}
				else {
				    triliza[a-1][b-1]= 'X';
				    s= 'X';
				}

				game =gameFunction(a, b, s,triliza) ;

			}
		}
	} // end of main

	public static void drawFunction(char [][] array){
		for (int i=0;i<3;i++){
			System.out.println("");
			for (int j=0;j<3;j++){
				System.out.print(array[i][j] + " ");
			}
		}
		System.out.println("");

	}//end of drawfunction

	public static boolean gameFunction(int x, int y, char s,char [][]tr){
		boolean game = true;
		//check col
		for (int i=0;i<3;i++){
			if (tr[x-1][i]!= s)
				break;
			if(i==2){
				drawFunction(tr);
				System.out.println("Win for player " + s);
				game = false;
			}
		}
		//check row
		for (int i=0;i<3;i++){
			if (tr[i][y-1]!= s)
				break;
			if(i==2){
				drawFunction(tr);
				System.out.println("Win for player " + s);
				game =false;
			}
		}
		//check diag
		if (x==y){
			for (int i=0;i<3;i++){
				if (tr[i][i]!= s)
					break;
				if(i==2){
					drawFunction(tr);
					System.out.println("Win for player " + s);
					game =false;
				}
			}
		}
		return game;
	} // end of game Funtion

}