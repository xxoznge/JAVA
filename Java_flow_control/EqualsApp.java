
public class EqualsApp {

	public static void main(String[] args) {
		String o1 = "java";
		String o2 = new String("java");
		// java에서는 이 두 가지를 다르게 취급한다. 
		
		String o3= "java";
		String o4 = new String("java");
		
		if(o2.equals(o4)) {
			System.out.println("WOW!");
		} else {
			System.out.println("OH!");
		}
		
		if(o1==o3) {
			System.out.println("WOW!");
		} else {
			System.out.println("OH!");
		}
		// 원시 데이터가 아니면 equals()로 해주어야한다. 

		
	}

}
