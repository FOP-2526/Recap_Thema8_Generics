# Recap 8: Generics in Java

Generics ermöglichen es, **Klassen**, **Interfaces** und **Methoden** so zu definieren, dass der Datentyp *erst bei der Verwendung* festgelegt wird. 

Dies sorgt für:
1) eine höhere Typsicherheit
2) verhindert unnötige Casts
3) macht Code flexibler

---

## Wichtige Regeln:
- Generics können nur innerhalb des Bereichs genutzt werden, in dem sie definiert sind (Klasse, Methode, Attribute etc.).
- Ein Generic-Typ muss **vor** seiner ersten Verwendung definiert werden (meist in spitzen Klammern `<T>`).
- Falls ein Generic nicht eingeschränkt wird (`<T>`), wird er standardmäßig als `Object` behandelt. Um Probleme zu vermeiden, sollten Generics mit **Bounds** eingeschränkt werden, wenn spezifische Funktionalitäten benötigt werden.

---
Wir schauen heute folgendes an:

### Klassen
- Wie man eine [generische Klasse](myDataType/Box.java) erstellt. (`myDataType/Box.java`)
- Wie man eine generische Klasse mit [mehreren generischen Parametern](myDataType/Pair.java) erstellt. (`myDataType/Pair.java`)
- Wie man Generics auf bestimmte Typen [einschränken](myDataType/Vector3D.java) kann. (`myDataType/Vector3D.java`)


### Methoden
> **Wichtig**: Methoden können eigene generische Parameter besitzen, unabhängig von der Klasse!
- Wie man eine [generische Methode](Main.java#59) erstellt. (`Main.java, Zeile 59`)
- [Type shadowing](Main.java#37): wenn lokale Generics die globale überdecken. (`Main.java, Zeile 37`)


### Interfaces
- Wie man Generic [auf mehrere Typen einschränken](limitingProperties/Profile.java) kann. (`limitingProperties/Profile.java`)
- Wie man ein [generisches Interface](genericInterfaces/ConcreteBox.java) in einer _konkreten_ Klasse implementiert. (`genericInterfaces/ConcreteBox.java`)
- Wie man ein [generisches Interface](genericInterfaces/MagicBox.java) in einer _generischen_ Klasse implementiert. (`genericInterfaces/MagicBox.java`)

---

### Was wir mit Generics _NICHT_ machen können
- Arrays erstellen `T[] a = new T[12];` 
- Variablen erstellen, wenn Generic nicht in Scope definiert ist
``` java
class Test{
    public T value;
    
    // oder
    public int add(Z first, Y second){
        return first + second;
    }
}
```
- Objekte von Generics erstellen `T t = new T();`
- Klassenattribute mit Generics anlegen `private static T element;`
- In Klassenmethoden Generics der Klasse benutzen.
- In spitze Klammer **primitive Datentypen** schrieben `Box<int>` oder `List<char>`
- Auf Generics `instanceof` anwenden: `if(T instanceof Integer){...}`