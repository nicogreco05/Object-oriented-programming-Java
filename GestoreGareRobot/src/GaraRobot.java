import java.util.ArrayList;
import java.util.Collections;

public class GaraRobot{
    private ArrayList<Robot> robotList = new ArrayList<>();
    private int count = 1; // privata perche è fuori da qualsiasi metodo

    public GaraRobot(ArrayList<Robot> robotList){
        this.robotList = robotList;
    }

    public void eseguiTurno(){
        System.out.println("\nTurno " + count);
        count++;
        for(int i = 0; i < robotList.size(); i++) {
            Robot robot = robotList.get(i);
            if (robot.energia() > 0) {
                robot.muoviti();
                System.out.println("Turno eseguito per il robot " + robot.nome());
            }
            else{
                System.out.println("Energia esaurita, il robot " + robot.nome() + " non è in grado di proseguire");
            }
        }
        System.out.println("---Turno corrente completato---");
        classifica();
    }

    public void classifica(){
       Collections.sort(robotList, (r1, r2) -> Integer.compare(r2.posizione(), r1.posizione()));
       /* ordina la lista dei robot e (r1, r2) -> Integer.compare(r2.posizione(), r1.posizione()) confronta 2 robot diversi e se:
       - r2.posizione() è maggiore di r1.posizione(), il confronto risulta positivo → r2 viene prima di r1
	   - r2.posizione() è minore di r1.posizione(), il confronto risulta negativo → r1 viene prima
	   - sono uguali, restano “pari”
        */

       System.out.println("\nClassifica aggiornata\n----------");
       for(int i = 0; i < robotList.size(); i++){
           Robot robot = robotList.get(i);
           System.out.println((i + 1) + ") " + robot.nome() + " " + robot.posizione() + ", energia rimanente " + robot.energia());
        }
    }
}
