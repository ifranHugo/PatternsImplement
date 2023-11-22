package singleton;

import java.util.HashMap;
import java.util.Map;

public class ReferencesFactory {

    private static ReferencesFactory factory = new ReferencesFactory();

    private final Map<String, Integer> references;
    private int reference;

    private ReferencesFactory() {
        this.references = new HashMap<>();
        this.reference = 0;
    }
    public ReferencesFactory getFactory(){
        return factory;
    }

    public int getReference(String key) {
        return references.computeIfAbsent(key, k -> reference++);
    }

    public void removeReference(String key) {
        this.references.remove(key);
    }

}