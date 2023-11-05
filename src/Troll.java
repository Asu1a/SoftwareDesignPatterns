import ObserverPattern.Game;

public class Troll extends Characters{

    public Troll(Game game, String username) {
        super(game, username);
    }

    @Override
    void display() {
        System.out.println("I am Troll");
    }
    @Override
    public void update(){
        System.out.println("Troll updated");
    }
}
