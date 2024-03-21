// 1. Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке. 
// Каждая книга должна содержать параметр типа T для ее названия.
// 2. Создайте обобщенный класс LibraryCard<K, V>, который представляет библиотечную карточку для определенной книги.
// Каждая карточка должна содержать параметры типов K для номера карточки и V для информации о книге.
// 3. Создайте класс Library, который будет представлять библиотеку.
// У этого класса должны быть методы для добавления книг и выдачи библиотечных карточек.
// Добавьте метод для вывода информации о всех выданных книгах с их библиотечными карточками.

package Task1_DZ;

public class Main {
    public static void main(String[] args) {

        Library library = new Library<>();

        Book<String> book1 = new Book<String>("Незнайка на Луне");
        Book<String> book2 = new Book<String>("Скотный двор");
        Book<Integer> book3 = new Book<Integer>(1984);
        Book<Double> book4 = new Book<Double>(37.5);        

        library.addBookToCard(book1);
        library.addBookToCard(book2);
        library.addBookToCard(book3);
        library.addBookToCard(book4);

        System.out.println(library);
        
        library.removeBookFromCard(book1);

        System.out.println(library);        
    }    
}
