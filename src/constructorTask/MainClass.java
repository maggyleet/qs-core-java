package constructorTask;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1 = new Student(1, "A", 65.7);
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.marks);
		System.out.println(Student.cname);

		Student s2 = new Student(2, "B", 73.2);
		System.out.println(s2.id);
		System.out.println(s2.name);
		System.out.println(s2.marks);
		System.out.println(Student.cname);
	}

}
