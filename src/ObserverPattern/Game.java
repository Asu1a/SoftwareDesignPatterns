package ObserverPattern;

public class Game{

    private String message;
    private final NotificationManager notificationManager;

    public Game(){
        notificationManager = new NotificationManager();
    }

    public NotificationManager getNotificationManager() {
        return notificationManager;
    }

    public String getMessage() {
        return message;
    }

    public void newUpdate(String message) {
        this.message = message;
        getNotificationManager().notifyObservers();
    }

}
