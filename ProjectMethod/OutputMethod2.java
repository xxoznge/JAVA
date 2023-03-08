import java.io.FileWriter;
import java.io.IOException;

public class OutputMethod2 {

	public static void main(String[] args) throws IOException {
		
				System.out.println(twoTimes("a","-"));
				FileWriter fw = new FileWriter("out.text"); // 파일 쓸 때 쓰는
				fw.write(twoTimes("a","*"));
				fw.close();
				
	}
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		return out;
		
	}
}
