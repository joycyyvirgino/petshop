package petshop;

import java.time.LocalDate;
import java.util.Scanner;

public class PetshopUtils {
    public static void exibirMenu() {
        System.out.println("\n-+-+- BEM VINDOS AO PETSHOP -+-+-");
        System.out.println("1- Banho");
        System.out.println("2- Hotel");
        System.out.println("3- Tosa");
        System.out.println("4- Fechar loja");
        System.out.print("Escolha uma opção: ");
    }

    public static TamanhoAnimal lerTamanhoAnimal(Scanner scan){
        System.out.print("Tamanho do Animal (1-PEQUENO, 2-MÉDIO, 3-GRANDE): ");
        int tamanhoA = scan.nextInt();
        if(tamanhoA < 1 || tamanhoA > 3 ){
            throw new IllegalArgumentException("Tamanho inválido!");
        }
        return TamanhoAnimal.values()[tamanhoA - 1];
    }

    public static TamanhoPelo lerTamanhoPelo(Scanner scan ){
        System.out.print("Tamanho do Pelo (1-CURTO, 2-MÉDIO, 3-LONGO): ");
        int tamanhoP = scan.nextInt(); if(tamanhoP < 1 || tamanhoP > 3 ){
            throw new IllegalArgumentException("Tamanho do pelo inválido!");
        }
        return TamanhoPelo.values()[tamanhoP - 1];
    }

    public static void adicionarBanho(InventarioPetshop petshop, Scanner scan, int codigo ){
        TamanhoAnimal tamanho = lerTamanhoAnimal(scan);
        TamanhoPelo tamPelo = lerTamanhoPelo(scan);
        petshop.adicionarServicos(new Banho(LocalDate.now(), codigo, tamanho, tamPelo));
        System.out.println("Banho adicionado com sucesso!");
    }

    public static void adicionarHotel(InventarioPetshop petshop, Scanner scan, int codigo){
        TamanhoAnimal tamanho = lerTamanhoAnimal(scan);
        System.out.println("Quantidade de horas: ");
        int horas = scan.nextInt();
        if (horas <=  0){
            throw new IllegalArgumentException("Quantidade de horas inválida!");
        }
        petshop.adicionarServicos(new Hotel(LocalDate.now(), codigo, tamanho, horas));
        System.out.println("Reserva no hotel adicionada com sucesso!");
    }

    public static void adicionarTosa(InventarioPetshop petshop, Scanner scan, int cogido){
        TamanhoAnimal tamanho = lerTamanhoAnimal(scan);
        petshop.adicionarServicos(new Tosa(LocalDate.now(), cogido, tamanho));
        System.out.println("Tosa adicionada com sucesso!");
    }
}

