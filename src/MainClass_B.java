
public class MainClass_B {

	public static void main(String[] args) {
		Student_B a = new Student_B();//Student 클래스로 a라는 객체를 선언
		Student_B b = new Student_B();
		Student_B c = new Student_B();
		
		a.name = "홍길동";
		a.age = 17;
		a.grade = 3;
		a.phoneNumber = "01012345678";
		
		a.printName();
		
		b.name = "이순신";
		
		c.name = "김유신";
		
		System.out.println(c.name);
	}

}
