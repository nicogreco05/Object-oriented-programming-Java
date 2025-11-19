import java.util.Iterator;
import java.util.LinkedList;

public class StoricoAccessiImp implements  StoricoAccessi{

    LinkedList<Utente> storicoaccessi = new LinkedList<>();

    @Override
    public String aggiungiEvento(Utente utente){
        storicoaccessi.addFirst(utente);
        return "Evento aggiunto";
    }

    @Override
    public void rimuoviEvento(){
        if(storicoaccessi.size() > 3){
            // System.out.println("Rimuovo: " + storicoaccessi.getLast());
            System.out.println("Rimosso utente per overflow: " + storicoaccessi.removeLast());
        }
    }

    @Override
    public String cercaEvento(Utente utente){
        StringBuilder ret = new StringBuilder();
        Iterator<Utente> iter = storicoaccessi.iterator();
        while(iter.hasNext()){
            Utente utenteCorrente = iter.next();
            if(utenteCorrente.equals(utente)){
                ret.append(utenteCorrente);
                // System.out.println(utenteCorrente);
            }
        }
        return ret.toString();
    }

    @Override
    public String visualizzaStorico(){
        StringBuilder ret = new StringBuilder();
        Iterator<Utente> iter = storicoaccessi.iterator();
        while(iter.hasNext()){
            Utente utenteCorrente = iter.next();
            ret.append(utenteCorrente);
            // System.out.println(utenteCorrente)
        }
        return ret.toString();
    }

}
