package edu.craptocraft.cotxox.conductores;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PoolConductores {
    
    private List<Conductor> conductores = new ArrayList<Conductor>();

    public PoolConductores(List<Conductor> conductores) {
        this.conductores = conductores;
    }

    public List<Conductor> getPoolConductores() {
        return this.conductores;
    }

    // Assign a random conductor who isn't busy currently.
    public Conductor asignarConductor() {
        Conductor conductor = new Conductor();
        Random conductorAleatorio = new Random();
        boolean isAsignado = false;

        while (!isAsignado) {
            int index = conductorAleatorio.nextInt(getPoolConductores().size());
            conductor = getPoolConductores().get(index);
            if (!conductor.isOcupado()) {
                conductor.setOcupado(true);
                isAsignado = true;
            }
        }

        return conductor;
    }

}
