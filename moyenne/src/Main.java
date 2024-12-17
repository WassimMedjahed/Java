import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        ArrayList<Matiere> matieres = new ArrayList<>();
        float moyenneGenerale = 0f;


        Matiere francais = new Matiere();
        francais.libelle = "Français";
        francais.notes.add(12f);
        francais.notes.add(8f);
        francais.notes.add(13f);
        francais.notes.add(6f);

        matieres.add(francais);

        Matiere maths = new Matiere();
        maths.libelle = "Maths";
        maths.notes.add(4f);
        maths.notes.add(9f);
        maths.notes.add(16f);
        maths.notes.add(18f);

        matieres.add(maths);


        Matiere sport = new Matiere();
        sport.libelle = "Sport";
        sport.notes.add(15f);
        sport.notes.add(13f);
        sport.notes.add(17f);
        sport.notes.add(2f);
        sport.notes.add(6f);

        matieres.add(sport);

        for(Matiere matiere : matieres) {
            moyenneGenerale += matiere.calculerMoyenne();
            System.out.println(String.format("La moyenne en %s est : %.2f", matiere.libelle, matiere.calculerMoyenne()));
            System.out.println("----------------------------------------------------------------------------------------------");

        }
        System.out.println(String.format("La moyenne générale est : %.2f", moyenneGenerale/matieres.size()));
    }
}