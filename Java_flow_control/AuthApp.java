
public class AuthApp {

	public static void main(String[] args) {
		
		// run configuration...에서 arguments 입력해놓음
		System.out.println(args[0]);

	    String id ="egoing";
	    String inputId = args[0];
	    
	    String pass = "1111";
	    String inputPass = args[1];
	    
	    System.out.println("Hi");
	    
	    
	    // if(inputId == id) {
//	    if(inputId.equals(id)) { // 문자열 비교는 equals() 
//	    	if(inputPass.equals(pass)) {
//	    		System.out.println("Master!");
//	    	}else {
//	    		System.out.println("Wrong password!");
//	    	}
//	    }else {
//	    	System.out.println("Who are you?");
//	    }
	    
	    if(inputId.equals(id) && inputPass.equals(pass) ) {
	    		System.out.println("Master!");
	    }else {
	    	System.out.println("Who are you?");
	    }
	}
}
