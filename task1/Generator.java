package task1;

import java.util.*;

public class Generator {
    private Random random;
    public Generator(){
        random = new Random();
    }

    List<Integer> createList(int count, int bottom, int top) {
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            newList.add(bottom + random.nextInt(top - bottom));
        }
        return newList;
    }

    Set<Integer> createSet(int count, int bottom, int top) {
        Set<Integer> newSet = new HashSet<>();
        for (int i = 0; i < count; i++) {
            newSet.add(bottom + random.nextInt(top - bottom));
        }
        return newSet;
    }
}
