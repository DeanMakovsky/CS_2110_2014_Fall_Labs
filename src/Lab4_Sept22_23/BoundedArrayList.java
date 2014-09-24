package Lab4_Sept22_23;

import java.util.ArrayList;

public class BoundedArrayList<T> extends ArrayList<T> {
	private int cap;
	public BoundedArrayList(int cap) {
		this.cap = cap;
	}
	@Override
	public boolean add(T item) {
		if (super.size() >= cap) { // we can use either super or this
			return false;
		}
		super.add(item);
		return true;
	}
	// addAll, et al. should also be implemented
}
