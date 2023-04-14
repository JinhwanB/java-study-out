import java.util.Scanner;

public class ExceptionTest_B {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수 1개를 입력하세요");
		
		int b = scanner.nextInt();
		
		int a = 100;
		
		int c = 0;
		
		try {
			c = a / b;
		} catch (Exception e) {
			System.out.println("모든 수는 0으로 나눌 수 없습니다.");
			e.printStackTrace();
		} finally {
			System.out.println("저는 에러와 관계없이 실행이 됩니다!");
		}
		
		System.out.println("몫 : " + c);
		
		scanner.close();

	}

}
