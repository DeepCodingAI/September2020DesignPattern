package creational;

public class Singleton {
    public static Singleton singleton;

    private Singleton(){}

    public static Singleton getInstance(){
        {
            if (singleton == null) {
                singleton = new Singleton();
            }
        }
        return singleton;
    }

    public void showDatabaseConnection(){
        System.out.println("One license of Database is connected");
    }
}
