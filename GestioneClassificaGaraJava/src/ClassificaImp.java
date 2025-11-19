import java.util.Map;
import java.util.TreeSet;

public class ClassificaImp implements  Classifica{

    TreeSet<Atleta> classifica = new TreeSet<>();

    @Override
    public String aggiungiAtleta(Atleta a){
        classifica.add(a);
        return "Aggiunta completata";
    }

    @Override
    public String rimuoviAtleta(Atleta a){
        classifica.remove(a);
        return "Rimozione completata";
    }

    @Override
    public String stampaClassifica(){
        for(Atleta atleta: classifica){
            System.out.println(atleta);
        }
        return "Fine classifica";
    }
}
