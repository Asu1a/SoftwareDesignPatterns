import ObserverPattern.Game;
import ObserverPattern.Observer;
import StrategyPattern.WeaponBehavior;

abstract public class Characters implements Observer {

    WeaponBehavior weaponBehavior;

    void performFight() {
        weaponBehavior.weaponAttack();
    }
    void display(){};

    public void setWeaponBehavior(WeaponBehavior weaponBehavior) {
        this.weaponBehavior = weaponBehavior;
    }

    private final String username;
    private final Game game;

    public Characters(Game game, String username){
        this.game=game;
        this.username = username;
    }

    public void update() {
        System.out.println(username + " - New update: " + game.getMessage());
    }

}
