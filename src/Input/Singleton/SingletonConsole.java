package Input.Singleton;

class SingletonConsole {
    private static SingletonConsole instance;

    public static synchronized SingletonConsole getInstance(){

        if (instance == null)
            instance = new SingletonConsole();

        return instance;
    }
}
