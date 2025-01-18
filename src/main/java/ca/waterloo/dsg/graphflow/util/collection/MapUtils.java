package ca.waterloo.dsg.graphflow.util.collection;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Utilities for generic map data structures.
 */
public class MapUtils {

    /**
     * @param elements The list of elements to turn into an element to position map.
     * @param <K> The type of the elements.
     * @return The element to position map.
     */
    public static <K> Map<K, Integer> getValueToIdxMap(List<K> elements) {
        Map<K, Integer> map = new HashMap<>();
        int i = 0;
        for (var element : elements) {
            map.put(element, i++);
        }
        return map;
    }

    /**
     * @param map The map to copy.
     * @param <K> The type of the keys.
     * @param <V> The type of the values.
     * @return a copy of the map.
     */
    public static <K, V> Map<K, V> copy(Map<K, V> map) {
        Map<K, V> mapCopy = new HashMap<>();
        for (Map.Entry<K, V> entry : map.entrySet()) {
            mapCopy.put(entry.getKey(), entry.getValue());
        }
        return mapCopy;
    }
}
