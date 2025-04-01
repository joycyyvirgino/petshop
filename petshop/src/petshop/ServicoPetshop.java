package petshop;

import java.time.LocalDate;

public abstract class ServicoPetshop implements ServircoPetshopIF{

    private LocalDate data;
    private int codigo;
    protected TamanhoAnimal tamanhoAnimal;

    public ServicoPetshop(LocalDate data, int codigo, TamanhoAnimal tamanhoAnimal) {
        this.data = data;
        this.codigo = codigo;
        this.tamanhoAnimal = tamanhoAnimal;
    }

    @Override
    public abstract double  calcularPreco();
}
