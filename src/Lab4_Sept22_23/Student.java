package Lab4_Sept22_23;

import java.util.Comparator;

public class Student implements Comparable<Student>, Comparator<Student> {
	private double gpa;
	private String name;

	public Student(double gpa, String name) {
		if (gpa > 4) {
			this.gpa = 4;
		} else if (gpa < 0) {
			this.gpa = 0;
		} else {
			this.gpa = gpa;
		}
		this.name = name;
	}

	/* Part of Comparable */
	@Override
	public int compareTo(Student other) {
		double gpaDif = other.getGpa() - this.getGpa(); // could reverse
														// ordering by changing
														// these two terms
		if (Math.abs(gpaDif) < 0.000001) {
			return this.getName().compareTo(other.getName());
		} else if (gpaDif < 0) {
			return -1;
		} else {
			return 1;
		}
	}

	public String getName() {
		return name;
	}

	public double getGpa() {
		return this.gpa;
	}

	/* Part of Comparator */
	@Override
	public int compare(Student one, Student two) {
		/*
		 * Note that we should not use "this" in this method. That is because
		 * "this" refers to the current object, not necessarily the two that we
		 * are comparing. "this" is just acting as something that can compare
		 * two other things.
		 */

		// yes this is very similar to the compareTo method. The only difference is that we've swapped out "this" with "one"
		double gpaDif = two.getGpa() - one.getGpa();
		if (Math.abs(gpaDif) < 0.000001) {
			return one.getName().compareTo(two.getName());
		} else if (gpaDif < 0) {
			return -1;
		} else {
			return 1;
		}
	}

	public static void main(String[] args) {
		Student s1 = new Student(3.9, "Jimmy");
		Student s2 = new Student(1.564, "Yacob");
		Student s3 = new Student(2.333, "Stew Pendous");
		Student s4 = new Student(2.333, "Other name");

		// Note that the actual return values do not have to be -1,0,or 1.
		// compareTo specifies that the return value should be either negative,
		// zero, or positive
		System.out.println(s1.compareTo(s2)); // should be -1
		System.out.println(s3.compareTo(s4)); // should be 1
		System.out.println(s4.compareTo(s3)); // should be -1
		System.out.println(s4.compareTo(s4)); // should be 0

	}

}
