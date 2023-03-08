
public class OutputMethod {

	public static String a() { // output이 string이다.
		//...
		return "a";
	}
	public static int one() {
		return 1;  // return 값 뒤에 있는 값이 실행값
		           // 앞에 return이 있으면 끝
		
	}
	public static void main(String[] args) {
		
		System.out.println(a());
		System.out.println(one());
		

	}

}
