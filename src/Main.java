public class Main {
    public static void main(String[] args) {

        ConfigurationManager manager1 = ConfigurationManager.getInstance();
        ConfigurationManager manager2 = ConfigurationManager.getInstance();

        System.out.println(manager1 == manager2);

        manager1.setVolume(75);
        System.out.println(manager2.getVolume());
        
    }
}