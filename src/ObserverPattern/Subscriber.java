package ObserverPattern;

public class Subscriber implements Observer {

    private final Game game;

    public Subscriber(Game game){
        this.game=game;
    }
    public void update() {
        System.out.println("New update: "+ game.getMessage());
    }
}
