package hidayLec8;

/**
 * Created by hackeru on 16/02/2017.
 */
public class Player {
   private String firstName;
   private String lastName;
   protected int score = 0;
   private double pctFromField;

    public Player(String firstName, String lastNmae, double chance) {
        this.firstName = firstName;
        this.lastName = lastNmae;
        this.pctFromField = chance;
    }

    public Player() {
        this.firstName = IO.getString("Enter the player first name:");
        this.lastName = IO.getString("Enter the player last name:");
        this.score = 0;
        this.pctFromField = IO.getInt("Enter the player pct From the field",0,100);
    }

    //Methods

    public boolean shotFromTwo (){
        int shoot = hidayLec8.Utils.getInt(1,100);
        boolean didScore = shoot <= this.pctFromField;
        if (didScore)
            this.score +=2;
        return didScore;
    }
    //getters and setters

    public String getFirstName() {
        return firstName;
    }

    public String getLastNmae() {
        return lastName;
    }

    public int getScore() {
        return score;
    }

    public double getChance() {
        return pctFromField;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastNmae(String lastNmae) {
        this.lastName = lastNmae;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setChance(double pctFromField) {
        this.pctFromField = pctFromField;
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", score=" + score +
                ", pctFromField=" + pctFromField +
                '}';
    }
}
