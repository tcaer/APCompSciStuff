public class Diploma {

	public String name;
	public String course;

	public Diploma(String name, String course) {
		this.name = name;
		this.course = course;
	}

	public String toString() {
		return "This certifies that " + name + "\nhas completed a MOOC in " + course;
	}

}

class Test {

	public static void main(String[] args) {
		Diploma diploma1 = new Diploma("Adam Smith", "English");
		System.out.println();
		System.out.println(diploma1);
		System.out.println();

		Diploma diploma2 = new DiplomaWithHonors("Geraldine Corey", "Robotics");
		System.out.println();
		System.out.println(diploma2);
		System.out.println();
	}

}