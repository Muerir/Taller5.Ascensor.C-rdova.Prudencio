package ascensor;

import java.util.Random;

public class Ascensor {

    public String IniciarAscensor() {
        int PisoAscensor = 1;

        String sistema = "";

        sistema += PisoAscensor;

        return sistema;
    }

    public int CrearPersona(){
        Random rand = new Random();
        int PisoPersona = rand.nextInt(3 - 1) + 1;
        System.out.println("PisoPersona " + PisoPersona);
        
        return PisoPersona;
    }
    
    public void PisoDestinoDiferentePisoPersona(int PisoDestino) throws Exception {
        Random rand = new Random();
        int PisoPersona = CrearPersona();
        String resultado = "";
        if (PisoDestino > 3) {

            throw new Exception("Piso No Disponible");

        } else {
            if (PisoDestino == PisoPersona) {
                throw new Exception("Se encuentra en el mismo piso");
            } else {
                resultado += "Todo bien";
                System.out.println("Todo bien");
            }
        }

    }
    
    public int LlegadaAscensor(int PisoPersona){
        int PisoAscensor = Integer.parseInt(IniciarAscensor());
        String DesplazamientoPiso="";
        
        if(PisoPersona==1){
            DesplazamientoPiso="0";
        }
        else{
            if(PisoPersona==2){
                DesplazamientoPiso="1";
                PisoAscensor++;
            }
            else{
                DesplazamientoPiso="2";
                PisoAscensor+=2;
            }
        }
        
        return DesplazamientoPiso;
    }

}
