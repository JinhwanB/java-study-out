
public class SwitchTest_B {

	public static void main(String[] args) {
		char ch = 'A';
		
		switch (ch) {
		case 'A':
			System.out.println("입력하신 문자는 A입니다!");
			break;
			
		case 'B':
			System.out.println("입력하신 문자는 B입니다!");
			break;
			
		case 'C':
			System.out.println("입력하신 문자는 C입니다!");
			break;

		default:
			System.out.println("입력하신 문자는 " + ch + "입니다!");
			break;
		}

	}

}