package petshop;

import java.time.LocalDate;
import java.util.Objects;

public class Banho extends ServicoPetshop{


    private TamanhoPelo tamanhoPelo;

    public Banho(LocalDate data, int codigo, TamanhoAnimal tamanhoAnimal, TamanhoPelo tamanhoPelo) {
        super(data, codigo, tamanhoAnimal);
        this.tamanhoPelo = tamanhoPelo;
    }


    @Override
    public double calcularPreco() {
        int precoBase = 0;
        int adicionar = 0;
        switch (tamanhoAnimal) {
            case PEQUENO:
                precoBase = 50;
                break;

            case MEDIO:
                precoBase = 60;
                break;

            case GRANDE:
                precoBase = 70;
                break;

            default:
                throw new IllegalArgumentException("Opção invalida!");
        }

        switch (tamanhoPelo){
            case CURTO :
                adicionar = 0;
                break;
            case MEDIO:
                adicionar = 15;
                break;
            case GRANDE:
                adicionar = 25;
                break;
            default:
                throw new IllegalArgumentException("Opção invalida!");
        }
        return precoBase + adicionar;
    }

    @Override
    public String descricao() {
        return "Banho para " + tamanhoAnimal + " com pelo " + tamanhoPelo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Banho banho = (Banho) o;
        return tamanhoAnimal == banho.tamanhoAnimal && tamanhoPelo == banho.tamanhoPelo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(tamanhoAnimal, tamanhoPelo);
    }

    @Override
    public String toString() {
        return "Banho{" +
                "preco=" + tamanhoAnimal +
                ", tamanhoPelo=" + tamanhoPelo +
                '}';
    }
}
