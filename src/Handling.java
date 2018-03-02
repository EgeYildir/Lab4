import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
public class Handling {
    public static void main(String[] args) throws IOException {
        ArrayList<String> players = new ArrayList<String>();

        players.add("Pele");
        players.add("Maradona");
        int choice = 0;

        do {

            System.out.println("\nArrayList Operations Demo: Building Soccer Team");

            System.out.println("0 : Display players list");
            System.out.println("1 : Add player");
            System.out.println("2 : Remove player");
            System.out.println("3 : Change player");
            System.out.println("4 : Exit");

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            try {
                choice = Integer.parseInt(br.readLine());
            }catch (Exception e){
                System.out.println("Error");
            }

            String name;
            int position;

                switch (choice) {
                    case 0:
                        System.out.println("\nPlayers currently in ArrayList are ");
                        Iterator<String> it = players.iterator();
                        while (it.hasNext()) {
                            System.out.println(it.next() + " ");
                        }
                        break;
                    case 1:
                        try {
                            System.out.println("Enter player name");
                            name = br.readLine();
                            System.out.println("Enter position in list");
                            position = Integer.parseInt(br.readLine());
                            if (position > players.size()) players.add(players.size() , name);
                            else players.add(position - 1, name);
                        } catch (Exception e) {
                            System.out.println("Unreached player position");
                        }
                        break;
                    case 2:
                        try {
                            System.out.println("Enter player name to remove");
                            name = br.readLine();
                            players.remove(name);
                        }catch(Exception e){
                            System.out.println("Unknown player");
                        }
                        break;
                    case 3:
                        try {
                            System.out.println("Enter position in list");
                            position = Integer.parseInt(br.readLine());
                            System.out.println("Enter player name");
                            name = br.readLine();
                            players.set(position - 1, name);
                        } catch (Exception e) {
                            System.out.println("Unknown player");
                        }
                        break;
                    default:
                        System.out.println("Exiting program");
                        return;
                }

        }while(choice < 4 && choice >= 0);
    }

}
