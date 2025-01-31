package exceptionhandling;
// Genrate Native Exception
class UnderAgeException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return super.getMessage();
	}
	
}

class OverAgeException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		return super.getMessage();
	}
	
}

class RTORegistration {
	void CheckEligibility (int age) throws OverAgeException,UnderAgeException  {
		if (age > 60) {
			OverAgeException e = new OverAgeException();
			throw e;
		}else if(age < 18){
			UnderAgeException e2 = new UnderAgeException();
			throw e2;
		}else {
			System.out.println("Welcome to RTO Registration");
		}
	}
	
}

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		RTORegistration registration = new RTORegistration();
		try {
			registration.CheckEligibility(61);
		} catch (OverAgeException | UnderAgeException e) {
			e.printStackTrace();
		}

	}

}
