package FactoryMethodPattern;

public class MobsFactory {


    public Mobs createMob(String mobType){
        if(mobType.equalsIgnoreCase("snake")){
            return new Snake();
        } else if (mobType.equalsIgnoreCase("spider")) {
            return new Spider();
        }
        return null;
    }

}
