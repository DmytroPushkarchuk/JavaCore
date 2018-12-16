package composite.app2;

import java.util.LinkedList;
import java.util.List;


public class Composite implements Component {

	private List<Component> composite = new LinkedList<>();

	public void add(Component... component) {
		for (Component iterCompon : component) {
			composite.add(iterCompon);
		}

	}

	public void remove(Component... component) {
		for (Component iterComposite : component) {
			composite.remove(iterComposite);
		}
	}

	@Override
	public void print() {
		for (Component iterComposite : composite) {
			iterComposite.print();
		}
	}

}
