package edu.craptocraft.cotxox.conductores;

import java.util.ArrayList;

public class Conductor {
    
    private String nombre = "";
    private String modelo = "";
    private String matricula = "";
    private double valoracionMedia = 0.0d;
    private boolean ocupado = false;
    private ArrayList<Byte> valoraciones = new ArrayList<>();

    public Conductor() {}

    public Conductor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String newModelo) {
        this.modelo = newModelo;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String newMatricula) {
        this.matricula = newMatricula;
    }

    public double getValoracion() {
        return this.valoracionMedia;
    }

    public int getNumeroValoraciones() {
        return this.valoraciones.size();
    }

    public void setValoracion(byte newValoracion) {
        this.valoraciones.add(newValoracion);
        calcularValoracionMedia();
    }

    private double calcularValoracionMedia() {
        double resultValoracionMedia = this.valoraciones.stream().mapToDouble(d -> d).average().getAsDouble();
        return resultValoracionMedia;
    }

    public boolean isOcupado() {
        return this.ocupado;
    }

    public void setOcupado(boolean newStatus) {
        this.ocupado = newStatus;
    }

}
