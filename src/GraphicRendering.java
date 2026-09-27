public class GraphicRendering {
    public GraphicRendering(){

    }    
    public void showGrahic() {
        ConfigurationManager settings = ConfigurationManager.getInstance();
        String Resolution = settings.getResolution();

        System.out.println("Rendering graphics at " + Resolution + " Resolution.");
    }
}
