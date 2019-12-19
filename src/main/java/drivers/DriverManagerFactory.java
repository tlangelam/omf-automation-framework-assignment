package drivers;

public class DriverManagerFactory{

    private static DriverManager driverManager;

    public static DriverManager getDriverManager(DriverType type){


        switch (type){
            case FIREFOX:
                driverManager = new FireFoxBrowserDriver();
                break;

            default:
                driverManager = new ChromeBrowserDriver();
        }

        return driverManager;
    }
}