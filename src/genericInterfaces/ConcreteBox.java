package genericInterfaces;

/**
 * Eine konkrete Implementierung von Boxable.
 * Hier legen wir fest, dass diese Box NUR Integer speichern kann.
 * Der Typ-Parameter T wird durch `Integer` bei Implementierung ersetzt.
 */
public class ConcreteBox implements Boxable<Integer> {
    private Integer value;

    @Override
    public Integer getValue() {
        return value;
    }

    @Override
    public void setValue(Integer value) {
        this.value = value;
    }
}
