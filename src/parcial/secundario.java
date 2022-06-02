/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial;

/**
 *
 * @author mono-
 */
public class secundario {

    private int espacio, año, minutos;
    private String placa, marca, modelo;

    public secundario(int espacio, String placa) {
        this.espacio = espacio;
        this.placa = placa;

    }

    public String getEspacio() {
        String est = "";
        if (espacio != 0) {
            est = "Uso";
        } else {
            est = "";
        }
        return est;
    }

    public void setEspacio(int espacio) {
        this.espacio = espacio;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getTotal() {
        int total = 100;
        total = this.minutos * total;
        return total;
    }

    @Override
    public String toString() {
        return '{' + "Placa: " + placa + ", Marca: " + marca + ", Modelo: " + modelo + ", Año: " + año + ", Minutos: " + minutos + '}';
    }

}
