package exercise5;

public class TestTimeComparison {

	public static void main(String[] args) {
		
		TimeCom t1 = new TimeCom(15,30,31);
		TimeCom t2 = new TimeCom(15,30,98);
		TimeComparator tc = new TimeComparator();
		int a= tc.compare(t1,t2);
		System.out.println(a);
		if (a>0)
			System.out.println("First time is greater than the second");
		else if(a<0)
			System.out.println("Second time is greater than the second");
		else 
			System.out.println("Check seconds");
	}

}
