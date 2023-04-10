
public class IfTest_B {

	public static void main(String[] args) {
		int score = 70;
		int grade = 2;
		
		if (score >= 60) {
			if (grade != 4) {
				System.out.println("성적우수!");
				if (grade == 2) {
					System.out.println("2학년 등수");
				}
			}
		}

	}

}
