
public class AuthApp2 {

	public static void main(String[] args) {
		
		// run configuration...에서 arguments 입력해놓음
		System.out.println(args[0]);

	    String id ="egoing";
	    String inputId = args[0];
	    
	    String pass = "1111";
	    String pass2 = "2222";
	    String inputPass = args[1];
	    
	    System.out.println("Hi");
	    boolean isRightPass = (inputPass.equals(pass) ||inputPass.equals(pass2));
	    
	    if(inputId.equals(id) && isRightPass) {
	    		System.out.println("Master!");
	    }else {
	    	System.out.println("Who are you?");
	    }
	}
}
