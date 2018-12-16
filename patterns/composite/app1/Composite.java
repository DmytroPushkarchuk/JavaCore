package composite.app1;

import java.util.LinkedList;
import java.util.List;

public class Composite implements Component, Comparable<Composite> {

	private List<Component> composite = new LinkedList<>();

	public void add(Component... component) {
		for (Component iter : component) {
			composite.add(iter);
		}
	}

	public void remove(Component... component) {
		for (Component iter : component) {
			composite.remove(iter);
		}
	}

	@Override
	public void show() {
		for (Component component : composite) {
			component.show();
		}

	}

	@Override
	public int compareTo(Composite o) {

		return 0;

	}

}
