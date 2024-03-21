package Task1_DZ;

public class Book<T> {

    private T name;

    public Book(T name) {
        this.name = name;        
    }

    public T getName() {
        return name;
    }

    public void setName(T name) {
        this.name = name;
    }

    @Override
    public String toString() {        
        return "Книга: \"" + name + "\"";
    }
    
}
