package milestone_1;
public class Constructor {

	String name;
	String course;
	int age;

	public Constructor(String name, String course, int age) {
		super();
		this.name = name;
		this.course = course;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public String getCourse() {
		return course;
	}

	public int getAge() {
		return age;
	}

	public static void main(String[] args) {

		Constructor a = new Constructor("Ravi", "CSE", 23);
		Constructor b = new Constructor("Andrew", "EEE", 24);
		Constructor c = new Constructor("ANNIE", "CSE", 25);
		System.out.println(a.getName());
		System.out.println(a.getCourse());
		System.out.println(a.getAge());
		System.out.println(b.getName());
		System.out.println(b.getCourse());
		System.out.println(b.getAge());
		System.out.println(c.getName());
		System.out.println(c.getCourse());
		System.out.println(c.getAge());

	}
}