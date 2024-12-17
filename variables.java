public class variables {

    static int[] player = new int[2];
    static int[] enemy = new int[2];


    static int[] currentPlayer;

    static int[] currentTarget;

    static boolean isPlaying = false;


    public static void initData(){
        // Les données du joueur
        player[0] = 100; // 0 : PV
        player[1] = 34; // 1 : ATK

        // Les données de l'enemie
        enemy[0] = 80; // 0 : PV
        enemy[1] = 22; // 1 : ATK
    }


    public static void selectFirstPlayer() {
        currentPlayer = player;
        currentTarget = enemy;

        System.out.println("Le player joue en premier");
    }


    public static void executePlayerAction() {

        currentTarget[0] -= currentPlayer[1];

        System.out.println("----------------------------------------------------");
        System.out.println("La cible a perdu " + currentPlayer[1] + " PV");
        System.out.println("La cible : PV restant " + currentTarget[0]);
        System.out.println("----------------------------------------------------");
        System.out.println("");


        if (currentTarget[0] < 1) {
            isPlaying = false;
        }
    }


    public static void selectNextPlayer() {

        if (currentPlayer == player){
            currentPlayer = enemy;
            currentTarget = player;

            System.out.println("L'enemy va jouer");
        }
        else {
            currentPlayer = player;
            currentTarget = enemy;

            System.out.println("Le player qui va jouer");
        }
    }


    public static void displayWinner() {

    }


    public static boolean isGameRunning() {
        // la condition pour savoir si la partie est terminé ou pas
        return isPlaying;
    }


    public static void main(String[] args)
    {
        initData();

        isPlaying = true;

        selectFirstPlayer();


        while (isGameRunning()) {
            executePlayerAction();

            selectNextPlayer();
        }

        displayWinner();
    }
}