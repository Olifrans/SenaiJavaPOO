package models;

public class Carro extends Veiculo {
    public Long Id;

    public String Modelo;
    public String Cor;
    public int Ano;

    public void ExibirInformacao() {
        System.out.println(Id+"O medole do carro é: " + Modelo + "O ano do carro é :" + Ano + "A cor é :" + Cor);
    }


    @Override
    public void MoverVeiculo(){
        System.out.println("Carro em movimento");
        System.out.println("Carro em alta velocidade");
    }

}
