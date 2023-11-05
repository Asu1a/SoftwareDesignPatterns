import ObserverPattern.Game;

public class Elf extends Characters{

    public Elf(Game game, String username) {
        super(game, username);
    }

    @Override
    void display() {
        System.out.println("I am an elf");
    }
    public void update(){
        System.out.println("Troll updated");
    }
}
