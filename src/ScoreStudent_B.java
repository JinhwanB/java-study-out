import java.util.Scanner;

public class ScoreStudent_B {

	public static void main(String[] args) {
		System.out.println("당신의 성적을 입력하세요.");
		
		Scanner scanner = new Scanner(System.in);
		
		int studentScore = scanner.nextInt();
		
		char str = (studentScore >= 90) ? '수' :
				   (studentScore >= 80) ? '우' :
				   (studentScore >= 70) ? '미' :
				   (studentScore >= 60) ? '양' : '가';
		
		System.out.println("당신의 성적은 " + str + " 입니다!");
		
		scanner.close();

	}

}
