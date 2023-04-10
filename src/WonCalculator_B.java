import java.util.Scanner;

public class WonCalculator_B {
	
	final double CHANGE_RATE = 1309.5;

	public static void main(String[] args) {
		System.out.println("당신의 나이는 얼마입니까?");
		Scanner scanner = new Scanner(System.in);
		// scanner 객체가 선언됨
		
		int student_age = scanner.nextInt();
		
		String str = (student_age >= 20) ? "당신은 성인이시군요!" : "당신은 미성년자입니다.";
		
		System.out.println(str);
		
		System.out.println("당신의 나이는 " + student_age + "살 입니다.");
		
		scanner.close(); // 스캐너 객체 닫기
	}

}
