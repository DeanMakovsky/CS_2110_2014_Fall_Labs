package Lab5_Sept29_30;

import java.util.Comparator;

/*Activity 8 */
public class CmpByAddress implements Comparator<Person> {
	@Override
	public int compare(Person a, Person b) {
		// for some reason I seem to have two methods to 'get' the address field
		return a.getMailingAddress().compareTo(b.getMailingAddress());
	}
}
