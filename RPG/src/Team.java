import java.util.ArrayList;

public class Team {

    public String name;
    public ArrayList<Battler> battlers = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public boolean isLost() {

        boolean lost = true;
        for (Battler b : battlers) {
            if(b.hp > 0) {
                lost = false;
                break;
            }
        }
        return lost;
    }


    public Battler getBattler(String name) {
        for (Battler b : battlers) {
            if(b.name.equals(name)) {
                return b;
            }
        }
        return null;
    }

    public void updateBattler() {

        ArrayList<Battler> updatedBattelers = new ArrayList<>();

        for (Battler b : this.battlers) {

            if(b.hp > 0) {
                updatedBattelers.add(b);
            }
        }

        this.battlers.clear();
        this.battlers.addAll(updatedBattelers);

    }


    public String aliveBattler() {
        String alive = "";
        for( Battler b : battlers){
                alive += b.name+" ";
        }

        return alive;
    }
}
