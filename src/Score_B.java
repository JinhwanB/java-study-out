import java.util.Scanner;

public class Score_B {

	public static void main(String[] args) {
		System.out.println("당신의 점수를 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		
		int score = scanner.nextInt();
		
		String str = (score >= 80) ? "당신은 우수 입니다!" :
					 (score >= 60) ? "당신은 보통 입니다!" :
					 (score >= 40) ? "당신은 미달 입니다!" : "당신은 낙제 입니다!";
		
		System.out.println(str);
		
		scanner.close();
	}

}
