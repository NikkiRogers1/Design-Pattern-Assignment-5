public class ConfigurationManager {
    private static ConfigurationManager uniqueInstance = new ConfigurationManager();
    private int volume;
    private String resolution;
    private String displayMode;
    private ConfigurationManager () {}

    public static ConfigurationManager getInstance() {
        
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