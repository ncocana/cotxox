package edu.craptocraft.cotxox.tarifa;

import edu.craptocraft.cotxox.carrera.Carrera;

public class Tarifa {
    
    private static final double COSTE_MILLA = 1.35;
    private static final double COSTE_MINUTO = 0.35;
    private static final double COSTE_MINIMO = 5.0;

    public Tarifa() {}

    public static double getCosteDistancia(double distancia) {
        return distancia * COSTE_MILLA;
    }

    public static double getCosteTiempo(int tiempo) {
        return tiempo * COSTE_MINUTO;
    }

    // If "costeTotal" is less than "COSTE_MINIMO",
    // return "COSTE_MINIMO". Otherwise, return "costeTotal".
    public static double getCosteTotalEsperado(Carrera carrera) {
        double costeTotal = getCosteDistancia(carrera.getDistancia()) + getCosteTiempo(carrera.getTiempoEsperado());
        return costeTotal > COSTE_MINIMO? costeTotal : COSTE_MINIMO;
    }

}
