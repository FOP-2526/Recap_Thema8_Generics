package genericInterfaces;

/**
 * Eine generische Implementierung von Boxable.
 * Diese Klasse reicht den Typ-Parameter T einfach an das Interface weiter.
 * So bleibt die MagicBox für jeden beliebigen Typ offen!
 */
public class MagicBox<T> implements Boxable<T> {
    private T magicValue;

    @Override
    public T getValue() {
        return magicValue;
    }

    @Override
    public void setValue(T value) {
        magicValue = value;
    }
}
