import java.util.ArrayList;
import java.util.List;

public class LineList {

	List<String> strings = new ArrayList<String>();

	public LineList() {

	}

	public int size() {
		return strings.size();
	}

	public String get(int k) {
		return strings.get(k);
	}

	public void add(String line) {
		strings.add(line);
	}

	public String remove(int k) {
		String res = strings.get(k);
		strings.remove(k);

		return res;
	}

	public void move(int index, int newIndex) {
		String res = strings.get(index):
		strings.remove(res);
		strings.add(newIndex, res);
	}

	public void shuffle() {
		
	}

}