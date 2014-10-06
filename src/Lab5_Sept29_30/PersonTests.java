package Lab5_Sept29_30;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;

import org.junit.Test;

public class PersonTests {

	@Test
	public void testPersonOnly() {
		Person p1 = new Person("Jane", "100 Main St, Somewhere");
		Person p2 = new Person("Raul", "27 Elm St, Elsewhere");

		assertEquals("toString",
				"{Person: name=Jane, homeAddress=100 Main St, Somewhere|",
				p1.toString());
		assertEquals("toString",
				"{Person: name=Raul, homeAddress=27 Elm St, Elsewhere|",
				p2.toString());
	}

	@Test
	public void testPersonEmployee() {
		ArrayList<Person> list = new ArrayList<Person>();
		Person p = new Person("Mai", "3156 Grove Rd, Somewhere");
		list.add(p);
		p = new Employee("Don", "6562 Trask Way, Elsewhere", "Front Desk", 2110);
		list.add(p);

		assertEquals("toString",
				"{Person: name=Mai, homeAddress=3156 Grove Rd, Somewhere|",
				list.get(0).toString());
		assertEquals(
				"toString",
				"{Empl: n=Don, ha=6562 Trask Way, Elsewhere, wa=Front Desk, id=2110}",
				list.get(1).toString());
	}

	// for (int i=0; i<input.size(); i++)
	// output.add(input.get(i).getClass().getName());

	@Test
	public void testPersonEmployeeStudent() {
		ArrayList<Person> list = new ArrayList<Person>();
		Person p = new Person("Mai", "3156 Grove Rd, Somewhere");
		list.add(p);
		p = new Employee("Don", "6562 Trask Way, Elsewhere", "Front Desk", 2110);
		list.add(p);
		// TODO: uncomment the following
		p = new Student("Dana Wahoo", "21 Wahoo Ave, NOVA", "1 JPA, CVille, VA");
		list.add(p);

		p.getClass().getName();

		assertEquals("toString",
				"{Person: name=Mai, homeAddress=3156 Grove Rd, Somewhere|",
				list.get(0).toString());
		assertEquals(
				"toString",
				"{Empl: n=Don, ha=6562 Trask Way, Elsewhere, wa=Front Desk, id=2110}",
				list.get(1).toString());
		// fail("Implement student and fix the junit to test it.");
		assertEquals("toString", "{}", list.get(2).toString());

		// Activity 6
		for (Person pp : list) {
			assertTrue("is a Person", pp instanceof Person);
		}

		// Activity 7
		for (Person pp : list) {
			assertTrue("is a Person", pp instanceof Comparable<?>);
			// why is it: '?' see
			// http://stackoverflow.com/questions/6975054/generics-legal-alternative-for-elements-instanceof-list-extends-comparable
			// this usage of '?' will not be tested
		}
	}

	/* Activity 8 */
	@Test
	public void testComparator() {
		ArrayList<Person> toBeSorted = new ArrayList<Person>();
		Person p1 = new Person("Name", "Cradr");
		toBeSorted.add(p1);
		Person p2 = new Person("Name", "Adr");
		toBeSorted.add(p2);
		Person p3 = new Person("Name", "AA");
		toBeSorted.add(p3);
		Person p4 = new Person("Name", "Zedr");
		toBeSorted.add(p4);
		Person p5 = new Person("Name", "N");
		toBeSorted.add(p5);

		ArrayList<Person> correct = new ArrayList<Person>();
		correct.add(p3);
		correct.add(p2);
		correct.add(p1);
		correct.add(p5);
		correct.add(p4);

		Collections.sort(toBeSorted, new CmpByAddress());
		assertEquals(correct, toBeSorted);
	}
	/* Go ask a TA in office hours if you want to know about Activity 10 or 11 */
}
