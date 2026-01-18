import genericInterfaces.ConcreteBox;
import genericInterfaces.MagicBox;
import myDataType.Box;

import java.util.HashMap;
import java.util.Map;

//TODO: Öffne `introduction.md`. Dort wird das Thema Schritt nach Schritt durchgegangen
public class Main {
    public static void main(String[] args) {

        //TIP Man kann Generics nur dann benutzen, wenn sie in die Klasse oder Methode definiert sind
        //TODO: Kommentiere die untere Zeile aus, um die Fehlermeldung zu sehen.
        //T a = new T();

        Box<String> stringBox = new Box<>(
                "Beispiel, wie man eine generische Klasse deklariert und initialisiert"
        );

        stringBox = new Box<>(
                "Bei der Initialisierung kann man Typ in den Diamond-Operator <> weglassen"
        );


        //TIP Generics kann man verschachteln. Hier schachteln wir unsere Box
        Box<Box<Box<Integer>>> matrjoschka = new Box<>(new Box<>(new Box<>(1)));


        //TIP Generics sind weit verbreitet und werden oft in `Collections` benutzt
        Map<Box<Integer>, String> map = new HashMap<>();
        map.put(new Box<>(1), "Mehr über Collection in Kapitel 9");


        //TIP Dieses Objekt wurde mit String initialisiert.
        // Die ganze Klasse `Box` benutzt ein einzelnes Generic.
        // Wie ist es dann möglich, dass die Methode `Integer` statt `String` genommen hat?
        stringBox.mirrorTheValue(123);


        concat("Beispiel für den Aufruf", "einer generischen Methode");

        // Hier wird Methode aufgerufen, deren Generic auf Number eingeschränkt ist
        mul(4, 4);          // int
        mul(3.14, 42.0);    // double
        mul(28f, 62f);      // float
        //TODO: mul("256", "1024"); // Da String kein Unterklasse von Number ist, führt diese Zeile zum Fehler


        // Hier können wir den Unterschied zwischen Deklarieren von konkreten und generischen Klassen sehen
        MagicBox<Integer> box = new MagicBox<>();
        box.setValue(123);

        ConcreteBox lazyBox = new ConcreteBox();
        lazyBox.setValue(123);
    }

    //TIP Obwohl es kein Generic in dieser Klasse definiert ist,
    // kann man ein Generic "lokal" für eine Methode definieren.
    public static <T extends String> void concat(T first, T second) {

        // Außerhalb dieser Methode wird <T> nicht definiert
        System.out.println(first.toString() + " " + second.toString());
    }

    //TIP Zur Erinnerung: `static` macht aus eine Methode eine Klassenmethode.
    // Diese Methoden brauchen kein Objekt, um aufgerufen zu werden.
    public static <T extends Number> double mul(T first, T second) {
        return first.doubleValue() * second.doubleValue();
    }
}