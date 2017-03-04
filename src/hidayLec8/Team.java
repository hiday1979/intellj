package hidayLec8;

import java.util.ArrayList;

/**
 * Created by hackeru on 16/02/2017.
 */
public class Team {
    ArrayList <Player> players = new ArrayList<>();

    public void addPlayear (Player a){
        players.add(a);
    }

    public void addPlayear (){
        int choice = IO.getInt("Which player to add?\n" +
                                "1)offence Player\n"+
                                 "2)Defence Player",1,2);
        if (choice==1)
            players.add(new OffensivPlayer());
        else if (choice==2){
            players.add(new DefencePlayer());
        }
    }

    public void removePlayer(Player p){
        players.remove(p);
    }
    public void removePlayer(String name){
        for (Player player : players) {
           if (player.getFirstName().equalsIgnoreCase(name)){
               players.remove(player);
               break;
           }
        }

    }
    public void printPlayer(){
        System.out.println(players);
    }
}
