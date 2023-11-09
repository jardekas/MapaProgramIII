package Entities;

public class Carro{
private int id;
    private String modelo;
    private String marca;
    private double valorPorkm;
    public Carro(String modelo, String marca, double valorPorkm) {
        this.modelo = modelo;
        this.marca = marca;
        this.valorPorkm = valorPorkm;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getValorPorkm() {
        return valorPorkm;
    }
    public void setValorPorkm(double valorPorkm) {
        this.valorPorkm = valorPorkm;
    }
    public void cadastrarCarro(String modelo, String marca, double valorPorkm) {
    	id += 1;
        this.modelo = modelo;
        this.marca = marca;
        this.valorPorkm = valorPorkm;
    }
    public String toString() {
        return "Carro \n Modelo: "
        		+ modelo
        		+ "\n Marca: "
        		+ marca
        		+ "\n Valor por Km: "
        		+ valorPorkm;
        }
}