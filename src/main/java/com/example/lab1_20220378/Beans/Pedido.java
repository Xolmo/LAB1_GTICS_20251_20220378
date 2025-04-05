package com.example.lab1_20220378.Beans;

public class Pedido {
    private String nombre;
    private int numeroMesa;
    private boolean cafe;
    private boolean te;
    private boolean postre;
    private String tamanio;
    private int cantidad;
    private boolean lecheVegetal;
    private boolean sinAzucar;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(int numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public boolean isCafe() {
        return cafe;
    }

    public void setCafe(boolean cafe) {
        this.cafe = cafe;
    }

    public boolean isTe() {
        return te;
    }

    public void setTe(boolean te) {
        this.te = te;
    }

    public boolean isPostre() {
        return postre;
    }

    public void setPostre(boolean postre) {
        this.postre = postre;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public boolean isLecheVegetal() {
        return lecheVegetal;
    }

    public void setLecheVegetal(boolean lecheVegetal) {
        this.lecheVegetal = lecheVegetal;
    }

    public boolean isSinAzucar() {
        return sinAzucar;
    }

    public void setSinAzucar(boolean sinAzucar) {
        this.sinAzucar = sinAzucar;
    }
}
