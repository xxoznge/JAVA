
public class ArrayApp {

	public static void main(String[] args) {
		
		// egoing, jinhuck, youbin
		String [] users = new String[3];
		users[0] = "egoing";
		users[1] = "jinhuck";
		users[2] = "youbin";
		
		System.out.println(users[1]);
		System.out.println(users.length); // 몇 칸짜리 배열인가 ?
		
		int[] scores = {10,100, 100};
		System.out.println(scores[0]);
		System.out.println(scores.length);

	}

}
