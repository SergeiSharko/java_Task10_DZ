package Task1_DZ;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class LibraryCard<K extends Number, T extends Book<T>> {     

    private Map<Integer, Book<T>> mapLibraryCards;
    
    public LibraryCard() {
        mapLibraryCards = new HashMap<>();      
    }
    
    public Map<Integer, Book<T>> getMap() {
        return mapLibraryCards;
    }

    public void addLibraryCardToBook (T book) {
        Random r = new Random();
        int idCard = r.nextInt(1,1115);
        if (mapLibraryCards.containsKey(idCard)) {
            idCard = r.nextInt(1,1115);
            mapLibraryCards.put(idCard, book); 
        }       
        mapLibraryCards.put(idCard, book);        
    }

    public void removeLibraryCard (T book) {
        int key = 0;
        for(Map.Entry<Integer, Book<T>> item : mapLibraryCards.entrySet()) {
            if(item.getValue().equals(book)) {
                key = item.getKey();              
            }
        }
        mapLibraryCards.remove(key);
    }

    @Override
    public String toString() {        
        return mapLibraryCards.toString();
    }    
    
}
