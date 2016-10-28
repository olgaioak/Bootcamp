import java.util.Scanner;
class HomeWork {
	public static Insurance[] insurance = new Insurance[10];
	public static Customer[] cust = new Customer[10];
	public static void main(String [] args){

		Customer cust1 = new Customer("Olga",1993,"female");
		Customer cust2 = new Customer("Vasilis",1990,"male");
		Customer cust3 = new Customer("Dimitris",1990,"male");
		Insurance insurance1 = new Life(1,7,100);
		Insurance insurance2 = new Health(1,7,630);
		Insurance insurance3 = new Life(2,5,0);
		Insurance insurance4 = new Health(3,1,140);

		insurance[0] = insurance1;
		insurance[1] = insurance2;
		insurance[2] = insurance3;
		insurance[3] = insurance4;

		cust[0] = cust1;
		cust[1] = cust2;
		cust[2] = cust3;

		System.out.println ("*****Menu*****\n1. Print all insurances\n2. Search insurances by customer code\n3. Search insurances by insurance code");
		int a;
		Scanner scanner = new Scanner(System.in);
		do {
			System.out.print ("Please enter 1 or 2 or 3. If you want to stop enter 0.");
			a = scanner.nextInt();
			System.out.println(a);

			if (a==1){
				Insurance.printInsurances();
				}

			else if (a==2){
				int c;
				do {
					System.out.print ("Please enter Customer Code.");
				    c = scanner.nextInt();

				}while (c<0 | c>10);


				insurance[0].printInsuranceByCustCode(c);

			} //if2

			else if (a==3){
				int g = 0; //den iparxei to insurance code
				int d ;
				do {
					System.out.print ("Please enter Insurance Code.");
				    d = scanner.nextInt();
					for (int i=1;i<=10;i++){
						if (i==d)
							g=1;
					}
				}while (g==0);

				insurance[0].printInsurance(d);

			} //if3
		}while(a!=0);

}
}
