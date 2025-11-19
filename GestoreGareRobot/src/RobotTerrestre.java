public class RobotTerrestre implements Robot{
    private final String nome; // metto private final perche sara definitivo il nome
    private final String categoria; // idem per la categoria che sara "Terrestre"
    private double energia;
    private int posizione;

    // Faccio il costruttore con tutte le varie cose che non vanno bene
    public RobotTerrestre(String nome, double energiaIn, int posizioneIn){
        if(nome == null){
            throw new IllegalArgumentException("il nome del robot è nullo!");
        }
        if(energiaIn < 0){
            throw new IllegalArgumentException("Energia insufficente per partire!");
        }
        if(posizioneIn < 0){
            throw  new IllegalArgumentException("Posizione iniziale non valida!");
        }
        this.nome = nome;
        this.categoria = "Terrestre";
        this.energia = energiaIn;
        this.posizione = posizioneIn;
    }

    @Override
    public String nome(){
        return nome;
    }

    @Override
    public String categoria(){
        return categoria;
    }

    @Override
    public double energia(){
        return energia;
    }

    @Override
    public int posizione(){
        return  posizione;
    }

    // Metodo che fa muovere il robot
    public void muoviti(){
        if(energia > 0){
            posizione += 5;
            energia -= 1.5;
        }
        else{
            System.out.println("Energia insufficente per il robot " + nome);
        }
    }
}

