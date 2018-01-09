public class DiplomaWithHonors extends Diploma {

	public DiplomaWithHonors(String name, String course) {
		super(name, course);
	}

	public String toString() {
		return "This certifies that " + super.name + "\nhas completed a MOOC in " + super.course + "\n*** with honors ***";
	}

}