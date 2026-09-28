import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        Scanner scanner = new Scanner(System.in);
        int choice = 0;

        ConfigurationManager manager1 = ConfigurationManager.getInstance();
        ConfigurationManager manager2 = ConfigurationManager.getInstance();
        
        manager1.setVolume(75);
        manager1.setResolution("4K");
        
        AudioSystem audio = new AudioSystem();
        GraphicRendering settings = new GraphicRendering();

        while (choice != 4){
    
         System.out.println("1. View Current Status");
         System.out.println("2. Modify Configuration");
         System.out.println("3. Trigger Subsystem");
         System.out.println("4. Exit");

          choice = scanner.nextInt();

             switch(choice) {

            case 1 : System.out.println("Current Volume: " + manager2.getVolume());
                    System.out.println("Current Resolution: " + manager2.getResolution());
                    break;

            case 2:
    System.out.println("1. Change Volume");
    System.out.println("2. Change Resolution");

    int modifyChoice = scanner.nextInt();

    switch (modifyChoice) {
        case 1:
            audio.changeVolume();
            System.out.println("Volume changed to " + manager2.getVolume());
            break;

        case 2:
            System.out.println("Enter new resolution:");
            String newResolution = scanner.next();
            manager1.setResolution(newResolution);
            System.out.println("Resolution changed to " + manager2.getResolution());
            break;

        default:
            System.out.println("Invalid configuration choice.");
    }
    break;
    
    case 3: 
    audio.playSound();
    settings.showGrahic();
    break;

    case 4: 
    System.out.println("Exiting engine..... ");
    break;

    default: System.out.println("Invalid choice.");
            }
        }
    }



    }
