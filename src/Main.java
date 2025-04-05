import models.Carro;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro();

        carro.Id = 777L;
        carro.Modelo = "Onix";
        carro.Cor = "Preto";
        carro.Ano = 2024;
        carro.ExibirInformacao();

        System.out.println("Conceito de Abstração!!!");
        carro.MoverVeiculo();



    }
}