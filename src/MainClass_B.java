
public class MainClass_B {

	public static void main(String[] args) {
		Student_B a = new Student_B();//Student 클래스로 a라는 객체를 선언
		a.name = "김유신";
		Student_B b = new Student_B("홍길동", 17, 3, "a1022");
		Student_B c = new Student_B("이순신", 43, 2, "b2022");
		Student_B d = new Student_B();
		Student_B f = new Student_B("강감찬", 27);
//		
//		a.name = "홍길동";
//		a.age = 17;
//		a.grade = 3;
//		a.phoneNumber = "01012345678";
//		
//		a.printName();
//		
//		b.name = "이순신";
//		
//		c.name = "김유신";
//		
//		System.out.println(c.name);
		Circle_B cir1 = new Circle_B(100, "donut"); //메모리에 cir1이라는 인스턴스가 생성
		
//		cir1.radius = 10;
//		cir1.name = "pizza";
		
		//System.out.println(cir1.name);
		
//		double cirArea = cir1.printArea("ham");
		
		System.out.println(cir1.radius);
		System.out.println(cir1.name);
	}

}
