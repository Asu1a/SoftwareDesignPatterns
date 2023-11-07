import AdapterPattern.M_Wind;
import AdapterPattern.Weapon_Adapter;
import DecoratorPattern.E_Fire;
import DecoratorPattern.E_Speed;
import FactoryMethodPattern.Mobs;
import FactoryMethodPattern.MobsFactory;
import ObserverPattern.Game;
import SingletonPattern.ServerStatus;
import StrategyPattern.AxeBehavior;
import StrategyPattern.SwordBehavior;

public class Main {
    public static void main(String[] args) {
        Game game = new Game();

        //STRATEGY PATTERN
        System.out.println("--------------STRATEGY--------------");
        Characters demon = new Demon(game, "Shoko_O");
        demon.setWeaponBehavior(new SwordBehavior());
        demon.performFight();

        Characters orc = new Orc(game, "UakaBoss");
        orc.setWeaponBehavior(new AxeBehavior());
        orc.performFight();

        System.out.println("\n--------------OBSERVER--------------");
        //OBSERVER
        game.getNotificationManager().addSubscriber(demon);
        game.getNotificationManager().addSubscriber(orc);
        game.newUpdate("2 new bosses");


        System.out.println("\n--------------ADAPTER--------------");
        //ADAPTER
        demon.setWeaponBehavior(new Weapon_Adapter(new M_Wind()));
        demon.performFight();


        System.out.println("\n--------------DECORATOR--------------");
        //ADAPTER
        demon.setWeaponBehavior(new E_Fire(new E_Speed(new SwordBehavior())));
        demon.performFight();


        System.out.println("\n--------------SINGLETON--------------");
        //SINGLETON
        ServerStatus serverStatus = ServerStatus.getInstance();
        serverStatus.showStatus();


        System.out.println("\n--------------FACTORY--------------");
        //FACTORY
        MobsFactory mobsFactory = new MobsFactory();
        Mobs snake = mobsFactory.createMob("snake");
        Mobs spider = mobsFactory.createMob("spider");
        snake.attack();
        spider.attack();
    }
}