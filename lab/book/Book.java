/*
* Tino Caer
* 08/09/17
* V1.0
*/

public class Book {

	private int numPages;
	private int currentPage;

	public Book(int numPages) {
		this.numPages = numPages;
		currentPage = 1;
	}

	public void setNumPages(int numPages) {
		this.numPages = numPages;
	}

	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}

	public int getNumPages() {
		return numPages;
	}

	public int getCurrentPage() {
		return currentPage;
	}

	public void nextPage() {
		if (currentPage < numPages) {
			currentPage++;
		}
	}

}