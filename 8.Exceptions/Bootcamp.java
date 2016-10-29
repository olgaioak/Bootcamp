
public class Bootcamp {
	public static void welcome(double d)throws DigitException, AnotherDigitException { 
		
		if (d>25)
			throw new DigitException();
		else
			throw new AnotherDigitException();
		
	}
	
	public static int bye() {
		try{
			welcome(299.7);
			return 0;
		}catch(DigitException a) {
			return 605;
		}catch(AnotherDigitException a){
			return 230;
		}
		
	}

}
