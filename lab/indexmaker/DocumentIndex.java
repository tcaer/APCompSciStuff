import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry> {

	public DocumentIndex() {
		super();
	}

	public DocumentIndex(int capacity) {
		super(capacity);
	}

	public void addWord(String word, int num) {
		boolean found = false;

		IndexEntry ie = new IndexEntry(word);
		ie.add(num);

		for (IndexEntry i : this) {
			if (word.toUpperCase().equals(i.getWord())) {
				i.add(num);
				found = true;
			}
		}
		if (found == false && size() > 0) {
			if (get(size() - 1).getWord().compareTo(word.toUpperCase()) < 0) {
				add(ie);
				return;
			}
			for (IndexEntry i : this) {
				if (i.getWord().compareTo(word.toUpperCase()) > 0) {
					add(indexOf(i), ie);
					return;
				}
			}
		} else if (found == false) {
			add(ie);
		}
	}

	public void addAllWords(String str, int num) {
		String[] strArray = str.split("[., \"!?]");

		for (String s : strArray) {
			if (!s.equals("")) {
				addWord(s, num);
			}
		}
	}

	private int foundOrInserted(String word) {
		IndexEntry temp = new IndexEntry(word);

		for (IndexEntry e : this) {
			if (e == get(indexOf(e))) {
				return 0;
			}
		}

		for (IndexEntry e : this) {
			if (word.compareTo(e.getWord()) > 0) {
				add(indexOf(e) - 1, temp);
				return indexOf(e) - 1;
			}
		}

		return -1;
	}

}