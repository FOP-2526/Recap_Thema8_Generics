package myDataType;

/**
 * Beispiel für Einschränkung von Generics
 *
 * @param <X> In dieser Schreibweise dürfen alle Typen (X, Y, Z) unterschiedlich sein.
 * @param <Y> Aber werden entweder Number oder Untertypen von Number sein (Integer, Float etc).
 * @param <Z> Ist dennoch nicht verboten, mit gleichen Parameter alles zu initialisieren.
 */
public class Vector3D<X extends Number, Y extends Number, Z extends Number> {
    private X x_achse;
    private Y y_achse;
    private Z z_achse;

    public Vector3D(X x, Y y, Z z) {
        this.x_achse = x;
        this.y_achse = y;
        this.z_achse = z;
    }

    public X getX() {
        return x_achse;
    }
    public Y getY() {
        return y_achse;
    }
    public Z getZ() {
        return z_achse;
    }

    public <V extends Integer> void multiplyWithScalar(V scalar){
        //TODO: auskommentiere und beobachte das Problem
        /*
        // so einfach kann man nicht zwischen unterschiedlichen Typen rumspielen !
        x_achse *= scalar;
        y_achse *= scalar;
        z_achse *= scalar;
        */

        // Recherchiere - warum, obwohl Achsen und `scalar` beide von `Number` sind,
        // miteinander incompatible sind
    }
}
