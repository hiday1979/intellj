package hidayLec8;

/**
 * Created by hackeru on 16/02/2017.
 */
public class DefencePlayer extends Player{
    private int numOfFouls;

    public DefencePlayer(String firstName, String lastNmae, double chance) {
        super(firstName, lastNmae, chance);
        this.numOfFouls = 0;
    }

    public DefencePlayer() {
        super();
        this.numOfFouls = this.numOfFouls;
    }

    public void dofoul (){
        numOfFouls ++;
        System.out.println("that was unsportsmanlike");
    }

    @Override
    public String toString() {
        return "DefencePlayer{" +
                "numOfFouls=" + numOfFouls +
                "} " + super.toString();
    }
}
