package genericInterfaces;

/**
 * Ein generisches Interface, das einen Vertrag für Boxen definiert.
 * @param <T> Der Typ des Inhalts, der in der Box gespeichert wird.
 */
public interface Boxable<T> {
    T getValue();
    void setValue(T value);
}
