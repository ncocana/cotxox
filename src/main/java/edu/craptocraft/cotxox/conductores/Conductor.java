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

    // For "valoracion" in "this.valoraciones", add it to "sumaValoraciones"
    // and then divide that for "this.valoraciones" size/length.
    // This will get the average of "this.valoraciones" and return it.
    private double calcularValoracionMedia() {
        double sumaValoraciones = 0;
        for (byte valoracion : this.valoraciones) {
            sumaValoraciones += valoracion;
        }
        this.valoracionMedia = sumaValoraciones / this.valoraciones.size();
        return this.valoracionMedia;
    }

    public boolean isOcupado() {
        return this.ocupado;
    }

    public void setOcupado(boolean newStatus) {
        this.ocupado = newStatus;
    }

}
