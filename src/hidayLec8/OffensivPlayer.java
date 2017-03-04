package hidayLec8;

/**
 * Created by hackeru on 16/02/2017.
 */
public class OffensivPlayer extends Player{
    private int ptcFromThree;

    public OffensivPlayer(String firstName, String lastNmae, double chance, int ptcFromThree) {
        super(firstName, lastNmae, chance);
        this.ptcFromThree = ptcFromThree;
    }

    public OffensivPlayer() {
        super();
        this.ptcFromThree = IO.getInt("Entar the players ptc from three");
    }

    public boolean shotFromTwo (){
        int shoot = hidayLec8.Utils.getInt(0,100);
        boolean didScore = shoot <= this.ptcFromThree;
        if (didScore)
            this.score +=3;
        return didScore;
    }

    @Override
    public String toString() {
        return "OffensivPlayer{" +
                "ptcFromThree=" + ptcFromThree +
                "} " + super.toString();
    }
}
