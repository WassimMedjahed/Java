import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



    Scanner sc = new Scanner(System.in);
    Random random = new Random();

    Battler attacker, target;

    Team players = new Team("Players");
    Team enemies = new Team("Enemies");
    Team actualPlaying, enemyPlaying;

    players.battlers.add(new Battler("player1",20,25));
    players.battlers.add(new Battler("player2",20,30));

    enemies.battlers.add(new Battler("enemy1",20,10));
    enemies.battlers.add(new Battler("enemy2",20,30));


    actualPlaying =  random.nextBoolean() ? players : enemies;
    enemyPlaying = (actualPlaying == players) ? enemies : players;


    while( !actualPlaying.isLost() && !enemyPlaying.isLost()) {


        System.out.println(String.format("Team : %s attacks now",actualPlaying.name));

        System.out.println(String.format("Who is attacking ? %s",actualPlaying.aliveBattler()));
        attacker = actualPlaying.getBattler(sc.nextLine());

        System.out.println(String.format("Who do you wanna attack ? %s",enemyPlaying.aliveBattler()));
        target = enemyPlaying.getBattler(sc.nextLine());


        attacker.attack(target);
        enemyPlaying.updateBattler();
        if (enemyPlaying.battlers.isEmpty()) {
            System.out.println("Winning team is : "+ actualPlaying.name);
        }



        Team temp = actualPlaying;
        actualPlaying = enemyPlaying;
        enemyPlaying = temp;


    }


    }
}