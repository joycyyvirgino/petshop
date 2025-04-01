package petshop;

import java.time.LocalDate;

public class Tosa extends ServicoPetshop {
    public Tosa(LocalDate data, int codigo, TamanhoAnimal tamanhoAnimal) {
        super(data, codigo, tamanhoAnimal);

    }

    @Override
    public double calcularPreco() {
        switch (tamanhoAnimal){
            case PEQUENO :
                return 30;

            case MEDIO:
                return 40;

            case GRANDE:
                return 50;

            default:
                throw new IllegalArgumentException("Opção invalida!");
        }
    }

    @Override
    public String descricao() {
        return "Tosa para um animal " + tamanhoAnimal;
    }

    @Override
    public String toString() {
        return "Tosa{" +
                "tamanhoAnimal=" + tamanhoAnimal +
                '}';
    }
}