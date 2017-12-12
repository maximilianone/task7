package task2;

import java.util.HashMap;
import java.util.Map;

public enum Dictionary {
    INSTANCE;

     private Map<String, String> dictionary = new HashMap<>();
    {
        dictionary.put("don't","не");
        dictionary.put("worry","хвилюйся");
        dictionary.put("be","будь");
        dictionary.put("happy","щасливим");
        dictionary.put("My","Моє");
        dictionary.put("birthplace","місце народження");
        dictionary.put("is","це");
        dictionary.put("Kiev","Київ");
        dictionary.put("sword","меч");
        dictionary.put("stick","палиця");
    }

    public Map<String, String> getDictionary() {
        return dictionary;
    }
}
