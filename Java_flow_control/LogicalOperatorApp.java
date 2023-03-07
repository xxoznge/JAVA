
public class LogicalOperatorApp {

	public static void main(String[] args) {
		
		System.out.println(1 == 1);
		
		// 논리연산자
		//AND = 둘 다 true면 true
		System.out.println(true && true); //true 
		System.out.println(true && false); // false
		System.out.println(false && true); // false
		System.out.println(false && false); // false

		// OR = 하나라도 true면 true
		System.out.println(true || true); //true
		System.out.println(true || false); // true
		System.out.println(false || true); // true
		System.out.println(false || false); // false
		
		// NOT = !면 반대로
		System.out.println(!true); // false
		System.out.println(!false); // true

	}

}
