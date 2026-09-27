public class ConfigurationManager {
    private static ConfigurationManager uniqueInstance;
    private int volume;
    private String resolution;
    private String displayMode;
    private ConfigurationManager () { 
        System.out.println("ConfigurationManager Created.");}

    public static ConfigurationManager getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new ConfigurationManager();
        }
        
        return uniqueInstance;

    }

    public int getVolume() {
        return volume;
    }

    public String getResolution(){
        return resolution;
    }

    public String getDisplayMode(){
        return displayMode;
    }

    public void setVolume( int newVolume) {
        volume = newVolume;
    }

    public void setResolution( String newResolution) {
        resolution = newResolution;
    }
    public void setDisplayMode( String newDisplayMode) {
        displayMode = newDisplayMode;
    }
}