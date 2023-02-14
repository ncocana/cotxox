package edu.craptocraft.cotxox.carrera;

import edu.craptocraft.cotxox.conductores.Conductor;
import edu.craptocraft.cotxox.conductores.PoolConductores;
import edu.craptocraft.cotxox.tarifa.Tarifa;

public class Carrera {
    
    private String tarjetaCredito = "";
    private String origen = "";
    private String destino = "";
    private double distancia = 0.0d;
    private int tiempoEsperado = 0;
    private int tiempoCarrera = 0;
    private double costeTotal = 0.0d;
    private int propina = 0;
    private Conductor conductor = null;

    public Carrera(String tarjetaCredito) {
        this.tarjetaCredito = tarjetaCredito;
    }

    public String getTarjetaCredito() {
        return this.tarjetaCredito;
    }

    public String getOrigen() {
        return this.origen;
    }

    public void setOrigen(String newOrigen) {
        this.origen = newOrigen;
    }

    public String getDestino() {
        return this.destino;
    }

    public void setDestino(String newDestino) {
        this.destino = newDestino;
    }

    public double getDistancia() {
        return this.distancia;
    }

    public void setDistancia(double newDistancia) {
        this.distancia = newDistancia;
    }

    public double getCosteEsperado() {
        return Tarifa.getCosteTotalEsperado(this);
    }

    public int getTiempoEsperado() {
        return this.tiempoEsperado;
    }

    public void setTiempoEsperado(int newTiempoEsperado) {
        this.tiempoEsperado = newTiempoEsperado;
    }

    public int getTiempoCarrera() {
        return this.tiempoCarrera;
    }

    public void setTiempoCarrera(int newTiempoCarrera) {
        this.tiempoCarrera = newTiempoCarrera;
    }

    public Conductor getConductor() {
        return this.conductor;
    }

    public void setConductor(Conductor newConductor) {
        this.conductor = newConductor;
    }

    public void asignarConductor(PoolConductores conductores) {
        setConductor(conductores.asignarConductor());
    }

    public void realizarPago(double pago) {
        this.costeTotal = pago;
    }

    public double getCosteTotal() {
        return this.costeTotal;
    }

    public void recibirPropina(int newPropina) {
        this.propina = newPropina;
    }

    public int getPropina() {
        return this.propina;
    }

    public void liberarConductor() {
        getConductor().setOcupado(false);
    }

}
