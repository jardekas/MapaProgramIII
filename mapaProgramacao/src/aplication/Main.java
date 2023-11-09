package aplication;

import java.util.Scanner;

import javax.swing.JOptionPane;

import Entities.Aluguel;
import Entities.Carro;
import Entities.Cliente;
public class Main {
    public static void main(String[] args) {
        // Cria um novo objeto Scanner para ler a entrada do usuário
        Scanner sc = new Scanner(System.in);
        String cpf, telefone, nome, modelo, marca;
        double valorPorkm, kmInicial, kmFinal;
        int quantidadeDeDias;
        // Pede ao usuário para inserir as informações do cliente
        Cliente cliente;
        cliente.setNome(JOptionPane.showInputDialog("Informe o nome do cliente: "));
        nome = sc.nextLine();
        cliente.setCpf(JOptionPane.showInputDialog("Informe o CPF do cliente: "));
        cpf = sc.nextLine();
        cliente.setTelefone(JOptionPane.showInputDialog("Informe o telefone do cliente: "));
        telefone = sc.nextLine();
        // Cria um novo objeto Cliente com as informações inseridas pelo usuário
        new Cliente(nome, cpf, telefone);
        // Pede ao usuário para inserir as informações do carro
        Carro carro;
        carro.setModelo(JOptionPane.showInputDialog("Informe o modelo do carro: "));
        modelo = sc.nextLine();
        carro.setMarca(JOptionPane.showInputDialog("Informe a marca do carro: "));
        marca = sc.nextLine();
        carro.setValorPorkm(Double.parseDouble(JOptionPane.showInputDialog("Informe o valor por km do carro: ")));
        valorPorkm = sc.nextDouble();
        // Cria um novo objeto Carro com as informações inseridas pelo usuário
        new Carro(modelo, marca, valorPorkm);
        // Pede ao usuário para inserir as informações do aluguel
        Aluguel aluguel;
        aluguel.setKmInicial(Integer.parseInt(JOptionPane.showInputDialog("Informe o km inicial do carro: ")));
        kmInicial = sc.nextDouble();
        aluguel.setKmFinal(Integer.parseInt(JOptionPane.showInputDialog("Informe o km final do carro: ")));
        kmFinal = sc.nextDouble();
        aluguel.setKmFinal(Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dias: ")));
        quantidadeDeDias = sc.nextInt();
        // Cria um novo objeto AluguelCarro com as informações inseridas pelo usuário
        new Aluguel(kmInicial, kmFinal, quantidadeDeDias);
        // Calcula o valor total do aluguel
        // Exibe o valor total do aluguel
        System.out.println("Valor total do aluguel: " + aluguel);
    }
}