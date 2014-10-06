package Lab5_Sept29_30;

public class Student extends Person {
	protected String campusAdress;
	protected double gpa;
//
//	public Student() {
//		this("", "", ""); // makes use of the other constructor we wrote
//	}

	public Student(String name, String home, String school) {
		// the Student constructor is first called,

		// then the Student constructor calls the Person constructor, with this
		// next line:
//		super(name, home);
		this.campusAdress = school;
		gpa = 0;
	}

	@Override
	public String toString() { // we have to override this to pass the test
		return "{}";
	}

	/*
	 * Activity 4: if we misspell the toString() as tostring(), then we do not
	 * get a compiler error, because our class inherits the toString() method
	 * from Person. However, the @Override annotation tells java to make sure
	 * that we are replacing the inherited method, so it WILL make a compiler
	 * error.
	 */
	
	/*
	 * Activity 5 :
	 * Public means any class can access the variable (generally bad practice)
	 * Protected means anything in the same package (or also subclass) can access the variable
	 * Private means that only that specific class can access the variable.
	 */
	public static void main(String[] args) {
		Person p = new Student("","","");
	}
}
