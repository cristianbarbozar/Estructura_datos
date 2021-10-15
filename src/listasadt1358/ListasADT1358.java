package listasadt1358;

import ico.fes.modelo.Empleado;
import ico.fes.unam.edd1358.LinkedListADT;


public class ListasADT1358 {

    public static void main(String[] args) {
        LinkedListADT lsl = new LinkedListADT();
        lsl.append(new String("Marco"));
        lsl.append(new String("Diana"));
        lsl.append(new String("jose"));
        lsl.transversal();
        LinkedListADT lsl2 = new LinkedListADT();
        lsl2.append(new Empleado(1, "Marco", "Pérez","García", 1850.5f, 2015,3));
        lsl2.append(new Empleado(1, "Rodrigo", "Pérez","García", 2860.5f, 2011,4));
        lsl2.append(new Empleado(1, "Diana", "Pérez","García", 1550.5f, 2007,8));
        lsl2.transversal();
        
    }

}
