public class AudioSystem  {
    public AudioSystem(){

    }
    public void playSound(){
        ConfigurationManager sound = ConfigurationManager.getInstance();
        int volume = sound.getVolume();

        System.out.println("Playing the sound at " + volume +"  volume.");
    }

    public void changeVolume(){
        ConfigurationManager sound = ConfigurationManager.getInstance();
        int newVolume = sound.getVolume() + 10;

        sound.setVolume(newVolume);


    }
}