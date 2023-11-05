import ObserverPattern.Game;

public class Demon extends Characters{

    public Demon(Game game, String username) {
        super(game, username);
    }

    @Override
    void display() {
        System.out.println("I am Knight");
    }
}
