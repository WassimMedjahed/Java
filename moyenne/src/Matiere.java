import java.util.ArrayList;


public class Matiere {

    String libelle;
    ArrayList<Float> notes = new ArrayList<>();

    float calculerMoyenne(){
        float moyenne = 0.0f;
        for(Float note : notes){
            moyenne += note;
        }
        moyenne /= notes.size();

        return moyenne;
    }

}
