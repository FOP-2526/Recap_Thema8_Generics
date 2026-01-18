package myDataType;

/**
 * Diese Klasse speichert einen Wert von beliebigem Typ.
 *
 * @param <T> das ist generischen Parameter:
 *    - Beim Erzeugen des Objektes kann ein beliebiger Referenztyp in <> angegeben werden.
 *    - Dieser Typ ist in der gesamten Klasse (für Attribute und Methoden) sichtbar.
 *    - Man weiß noch nicht, welchen Typ das wird. Darum keine spezifische Methode darauf anwenden
 *      (Sondern nur Methoden der Klasse `Object`).
 */
public class Box<T> {
    private T value;

    public Box(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
    public void putInBox(T value) {
        this.value = value;
    }

    /** Das ist ein Beispiel für `Type shadowing`.
     * T wird hier lokal für die Methode definiert
     * => beide T (von Methode und von Klasse) können unterschiedliche Typen repräsentieren.
    */
     public <T> T mirrorTheValue(T value){
        return value;
    }
}
