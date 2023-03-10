import java.io.FileWriter;
import java.io.IOException;

public class OthersOOP {

	public static void main(String[] args) throws IOException {
		//class : System, Math, FileWriter
		// instance : f1,  f2
		
		System.out.println(Math.PI); // PI = 변수
		System.out.println(Math.floor(1.8));
		System.out.println(Math.ceil(1.8));
		
		FileWriter f1 = new FileWriter("data.txt"); // data.txt 에 저장하겠다 -> 복사본
		// f1 변수에 담기는 복제본 ( data.txt에 저장하겠다라는 상태를 가지고 있는)
		// import 처리 + 예외 처리 해야함.
		f1.write("Hello");
		f1.write(" Java");
		f1.close();
		
		FileWriter f2 = new FileWriter("data2.txt"); // data.txt 에 저장하겠다 -> 복사본
		// f1 변수에 담기는 복제본 ( data.txt에 저장하겠다라는 상태를 가지고 있는)
		// import 처리 + 예외 처리 해야함.
		f2.write("Hello");
		f2.write(" Java2");
		f2.close();
		
		f1.write("!!!!");
		f1.close(); 

	}

}
