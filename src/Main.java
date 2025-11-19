public class Main {
    public void main(String[] args){
        StoricoAccessiImp storicosccessi = new StoricoAccessiImp();
        Utente utente1 = new Utente("Silvio", "16/10");
        Utente utente2 = new Utente("Nico", "17/10");
        Utente utente3 = new Utente("Mario", "18/10");
        System.out.println(storicosccessi.aggiungiEvento(utente1));
        System.out.println(storicosccessi.aggiungiEvento(utente2));
        System.out.println(storicosccessi.aggiungiEvento(utente3));
        System.out.println(storicosccessi.visualizzaStorico());
        Utente utente4 = new Utente("Pino", "19/10");
        System.out.println(storicosccessi.aggiungiEvento(utente4));
        storicosccessi.rimuoviEvento();
        System.out.println(storicosccessi.visualizzaStorico());
        System.out.println((storicosccessi.cercaEvento(utente3)));

    }
}
