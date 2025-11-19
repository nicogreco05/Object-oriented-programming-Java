public class Utente{
    private String username;
    private String dataAccesso;

    public Utente(String username, String dataAccesso){
        if(username == null){
            throw new IllegalArgumentException("Username non valido");
        }
        if(dataAccesso == null){
            throw new IllegalArgumentException("Data di accesso non valida");
        }
        this.username = username;
        this.dataAccesso = dataAccesso;
    }

    @Override
    public String toString() {
        return "Utente: " + username + ", Data di accesso: " + dataAccesso + "\n";
    }

    public String getUsername(){
        return username;
    }

    public String getDataAccesso(){
        return dataAccesso;
    }

}
