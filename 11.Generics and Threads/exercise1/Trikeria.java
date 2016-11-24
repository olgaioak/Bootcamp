package exercise1;

public class Trikeria {

	public static void main(String[] args) {
		stenchful();
	}
	
	public static Granch stenchful(){
		Cellulase c = new Cellulase();
		Semiserf s = new Semiserf();
		Mina m = new Mina();
		Contrite con = new Contrite();
		Granch g = new Granch();
		Hedonism<Cellulase, Semiserf, Mina, Contrite, Granch> h = new Hedonism<> (m,con,s,g,c);
		Granch forreturn =h.myoglobin(m);
		forreturn.print();
		return forreturn;
		
	}

}
 