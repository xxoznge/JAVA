class Print{

	public String delimiter;
	public void a() { // instance의 소속이므로 static이 없다
		System.out.println(this.delimiter);
		// this.delimiter ? 우리가 t1 인스턴스의 변수 값으로 지정한 -가 된다.
		System.out.println("a");
		System.out.println("a");
	}
	public void b() {
		
		System.out.println(this.delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	public static void c(String delimiter) {
		System.out.println(delimiter);
		System.out.println("c");
		System.out.println("c");
	}
	
}
public class staticMethod {
	public static void main(String[] args) {
//		Print.a("-");  class 소속 ( static이 필요)
//		Print.b("-");
		
		//instance 는 t1
		Print t1 = new Print(); // 프린트 복제 = 인스턴스
		t1.delimiter = "-"; // 내부적으로는 구분자 값이 -
		t1.a();             // 이제 구분자 안해도 자동적으로 출력 됨.
		t1.b();
		Print.c("$"); // 프린트 소속 c를 할 수 있는 이유는 static 이 붙었으니까
		
		Print t2 = new Print(); // 프린트 복제
		t2.delimiter = "-"; // 내부적으로는 구분자 값이 -
		t2.a();             // 이제 구분자 안해도 자동적으로 출력 됨.
		t2.b();
	}
}
