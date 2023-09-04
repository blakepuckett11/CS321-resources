import java.util.Iterator;
import java.util.LinkedList;

public class Cache<K, V extends KeyInterface<K>> {
    int maxSize;
    // Figure out what goes in the list before continuing
    LinkedList<K> cacheList = new LinkedList<>();

    public Cache(int size) {
        maxSize = size;
    }
    
    public K remove(K key) {
        Iterator<K> iter = cacheList.iterator();
        // iterate through cacheList
        while (iter.hasNext()) {
            K valueKey = iter.next();
            // remove key if found
            if (valueKey.equals(key)) {
                iter.remove();
                // FIX
                return valueKey;
            }
                }
        return null;
    }
    public void add(V value) {
        if (cacheList.size() == maxSize) {
            cacheList.removeLast();
            
        }
        // FIX
        cacheList.add(value);
    }
    public V get(V value) {
        Iterator<K> iter = cacheList.iterator();
        while (iter.hasNext()) {
            K returnVal = iter.next();
            if (returnVal.equals(value)) {
                // FIX
                return returnVal;
            }
                }
        
        return null;
    }
    public void clear() {
        cacheList.clear();
    }
    public String toString() {
        
        String retStr = "Cache with " + cacheList.size() + " entries has been created";
        retStr += "Total number of references: ";
        retStr += "Total number of cache hits: ";
        retStr += "Cache hit percent: ";
        System.out.println("Total number of references: ");
        System.out.println("Total number of cache hits: ");
        
        return retStr;
    }
}