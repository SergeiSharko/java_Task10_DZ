package Task1_DZ;

public class Library<K extends Number, T extends Book<T>> {

    LibraryCard<K,T> listOfBook;

    public Library() {
        listOfBook = new LibraryCard<K,T>();
        System.out.println("Библиотека отрылась!");
    }

    public void addBookToCard(T book) {
        listOfBook.addLibraryCardToBook(book);
    }

    public void removeBookFromCard(T book) {
        listOfBook.removeLibraryCard(book);
    }

    @Override
    public String toString() {
        return listOfBook + "";
    }
}
