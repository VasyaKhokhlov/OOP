package HW6_task1;

import java.util.HashMap;
import java.util.Map;

class FibonacciRepository implements IFibonacciRepository {
    private Map<Integer, Long> cache = new HashMap<>();

    public void add(int index, long value) {
        cache.put(index, value);
    }

    public long get(int index) {
        return cache.getOrDefault(index, -1L);
    }
}
