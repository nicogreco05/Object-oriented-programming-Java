public class Main{
    public static void main(String[] args){
        ClassificaImp classifica = new ClassificaImp();
        Atleta atleta1 = new Atleta("Nicolò", 50.0);
        Atleta atleta4 = new Atleta("Pino", 48.0);
        Atleta atleta5 = new Atleta("Totti", 49.0);
        System.out.println(classifica.aggiungiAtleta(atleta1));
        System.out.println(classifica.aggiungiAtleta(atleta4));
        System.out.println(classifica.aggiungiAtleta(atleta5));
        Atleta atleta6 = new Atleta("Sesko", 33.0);
        System.out.println(classifica.rimuoviAtleta(atleta6));
        System.out.println(classifica.stampaClassifica());



    }
}
