package petshop;

import java.util.ArrayList;
import java.util.List;

public class InventarioPetshop  {
    List<ServicoPetshop> servicos = new ArrayList<>();

    public void adicionarServicos(ServicoPetshop servico){
        if(servico == null){
            throw new IllegalArgumentException("invalido!!");
        }
        servicos.add(servico);
    }

    public double calcularValor () {
        double total = 0;
        for (ServicoPetshop servico : servicos) {
            total += servico.calcularPreco();
        }
        return total;
    }

    public  String listaServicos(){
        StringBuilder sb = new StringBuilder();
        for(ServicoPetshop servico : servicos){
            sb.append(servico.descricao()).append("Preço").append(servico.calcularPreco());
        }

        return sb.toString();
    }
    public void fecharLoja() {
        System.out.println("-+-+-+-+ Inventário do Dia -+-+-+-+-");
        System.out.println(listaServicos());
        System.out.println("Valor total arrecadado: R$" + calcularValor());
        System.out.println("Loja fechada. Até amanhã!");
    }

    public List<ServicoPetshop> getServicos() {
        return new ArrayList<>(servicos);
    }

    public void setServicos(List<ServicoPetshop> servicos) {
        if (servicos == null) {
            throw new IllegalArgumentException("A lista de serviços não pode ser nula!");
        }
        this.servicos = new ArrayList<>(servicos);
    }
}
