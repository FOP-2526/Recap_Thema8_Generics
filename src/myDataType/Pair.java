package myDataType;

import java.util.ArrayList;
import java.util.List;

/**
 * Eine generische Klasse mit zwei unabhängigen Typ-Parametern.
 *
 * @param <T> Der Typ des ersten Elements.
 * @param <Z> Der Typ des zweiten Elements.
 *
 * T und Z können derselbe Typ sein (z.B. String, String), müssen es aber nicht!
 *
 * Da sie nicht eingeschränkt sind, werden sie intern als 'Object' behandelt.
 */
public class Pair<T, Z> {
    private T  first;
    private Z second;

    public Pair(T first, Z second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }
    public Z getSecond() {
        return second;
    }

    //TODO: Wie man diese generische Klasse benutzen könnte
    private class Sandbox{
        // Unterschiedliche Typen
        Pair<String, Integer> person = new Pair<>("Max", 25);

        // Gleiche Typen
        Pair<Double, Double> coordinates = new Pair<>(52.52, 13.40);

        // Sonstiges
        Pair<String, List<String>> admins = new Pair<>("SuperUser", new ArrayList<>());
    }
}

