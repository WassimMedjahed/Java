public class Battler {
    public String name;
    public int hp;
    public int power;

    public Battler(String name, int hp, int power) {
        this.name = name;
        this.hp = hp;
        this.power = power;
    }

    public void attack(Battler opponent){
        opponent.hp -= this.power;
    }



}
