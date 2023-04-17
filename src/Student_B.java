public class Student_B {
	//멤버변수 or 속성 or 필드(클래스 내에 선언된 변수)
	String name;
	int age;
	int grade;
	String hakbun;
	
	public Student_B() {
		
	}

	public Student_B(String name, int age, int grade, String hakbun) {
		this.name = name;
		this.age = age;
		this.grade = grade;
		this.hakbun = hakbun;
	}

	public Student_B(String name, int age) {
		this.name = name;
		this.age = age;
	}

	//메소드(클래스내에 선언된 함수)
	public void printName() {
		System.out.println(this.name);
	}
}