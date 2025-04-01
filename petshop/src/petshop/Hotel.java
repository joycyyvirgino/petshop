package petshop;

import java.time.LocalDate;
import java.util.Objects;

public class Hotel extends  ServicoPetshop {
        private int qtdHora;


    public Hotel(LocalDate data, int codigo, TamanhoAnimal tamanhoAnimal, int hora) {
        super(data, codigo, tamanhoAnimal);
        this.qtdHora = hora;
    }

    @Override
    public double calcularPreco() {

        switch (tamanhoAnimal){
            case PEQUENO :
                return qtdHora * 12;
            case MEDIO:
                return qtdHora * 18;
            case GRANDE:
                return qtdHora * 25;
            default:
                throw  new IllegalArgumentException("Opção invalida");
        }
    }

    @Override
    public String descricao() {
        return "Hospedagem por " + qtdHora + " horas para um animal " + tamanhoAnimal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Hotel hotel = (Hotel) o;
        return qtdHora == hotel.qtdHora && tamanhoAnimal == hotel.tamanhoAnimal;
    }

    @Override
    public int hashCode() {
        return Objects.hash(qtdHora, tamanhoAnimal);
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "qtdHora=" + qtdHora +
                ", tamanho=" + tamanhoAnimal +
                '}';
    }
}
