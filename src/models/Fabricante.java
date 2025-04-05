package models;

public class Fabricante extends ModeloAno {
    public Long Id;

    public String Modelo;
    public String Cor;
    public int Ano;


    @Override
    public void VeiculoDoAno(){
        System.out.println("Carro de corrida ABCD");
    }

}
