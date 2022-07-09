package extra03;

import java.util.Date;

public class Extra03 {

    public static void main(String[] args) {
        Date d = new Date();
        System.out.println("Hoje "+d+" teremos uma disputa para saber o mais rápido");
        System.out.println("O percurso será a volta ao mundo");
        Corredor c[] = new Corredor[6];
        c[0] = new Corredor("Sonic","SEGA",01,4500,0,0,0);
        c[1] = new Corredor("Mercúrio","Marvel - FOX", 02, 4950,0,0,0);
        c[2] = new Corredor("Flash","DC comics",03,305000,0,0,0);
        c[3] = new Corredor("Trem Bala","VOUGHT",04,310000,0,0,0);
        c[4] = new Corredor("PapaLéguas","Looney Tunes",05,215000,0,0,0);
        c[5] = new Corredor("Flecha Pera","Disney pixar", 06,208400,0,0,0);
        c[1].apresentar();
    }
    
}
