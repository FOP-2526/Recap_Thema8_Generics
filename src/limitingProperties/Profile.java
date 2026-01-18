package limitingProperties;

/**
 * Diese Klasse demonstriert "Multiple Bounds".
 * @param <T> Der Typ-Parameter muss zwingend BEIDE Interfaces implementieren.
 * Es gilt: T muss ein Gamer UND ein Student sein.
 */
public class Profile<T extends Gamer & Student> {
    public void printInfo(T user){
        System.out.println(
                "Person mit " + user.getMatrikelnummer() +
                "mag das Spiel " + user.getFavouriteGame()
        );
    }
}
