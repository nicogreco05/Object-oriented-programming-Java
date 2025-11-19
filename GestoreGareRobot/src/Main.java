import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args){
        ArrayList listaRobot = new ArrayList<>();
        listaRobot.add(new RobotTerrestre("Silvio", 30, 0));
        listaRobot.add(new RobotTerrestre("GianBattista", 25, 0));
        GaraRobot gara = new GaraRobot(listaRobot);
        gara.eseguiTurno();
        gara.eseguiTurno();
    }
}
