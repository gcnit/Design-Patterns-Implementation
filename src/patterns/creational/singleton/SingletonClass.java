package patterns.creational.singleton;

/**
 * Created by gaurav on 26/11/17.
 */
public class SingletonClass {
    private static SingletonClass instance;
    String instanceName;

    private SingletonClass(){}

    public static SingletonClass getInstance() {
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
    }

    public String getInstanceName() {
        return instanceName;
    }

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }
}
