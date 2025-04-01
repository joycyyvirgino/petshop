package petshop;


import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      InventarioPetshop petshop = new InventarioPetshop();
      Scanner scan = new Scanner(System.in);
      int codigo = 1;
      boolean continuar = true;

      do {
          try {PetshopUtils.exibirMenu();
          int opcao = scan.nextInt();
          scan.hasNextLine();

          switch (opcao) {
              case 1:
                  PetshopUtils.adicionarBanho(petshop, scan, codigo++);
                  break;
              case 2:
                  PetshopUtils.adicionarHotel(petshop, scan, codigo++);
                  break;
              case 3:
                  PetshopUtils.adicionarTosa(petshop, scan, codigo++);
                  break;
              case 4:
                  petshop.fecharLoja();
                  continuar = false;
                  break;
              default:
                  System.out.println("Opção inválida! Escolha um número de 1 a 5.");
          }
          } catch (InputMismatchException e) {
              System.out.println("Entrada inválida! Digite um número válido.");
              scan.next(); // Limpa entrada inválida
              continuar = true;
          }
          catch (IllegalArgumentException e) {
              System.out.println("Erro: " + e.getMessage());
              continuar = true;
          }
          catch (Exception e) {
              System.out.println("Ocorreu um erro inesperado: " + e.getMessage());
              continuar = true;
          }
      }while (continuar);

    }
}
