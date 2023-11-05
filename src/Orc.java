import ObserverPattern.Game;

public class Orc extends Characters{

    public Orc(Game game, String username) {
        super(game, username);
    }

    @Override
    void display() {
        System.out.println("I am an orc");
    }


}
