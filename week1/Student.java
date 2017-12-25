package ss.week1;

public class Student {
	
	private int grade;
	
	public boolean passed() {
		return grade>=70;
	}
	
	public Student(int newGrade) {
		grade = newGrade;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student(71);
		
		System.out.println(s1.passed());
		

	}

}
