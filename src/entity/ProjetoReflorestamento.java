package entity;

import java.util.ArrayList;

public class ProjetoReflorestamento extends ProjetoSustentavel{
    int arvoresPlantadas;

    public ProjetoReflorestamento(){}

    public ProjetoReflorestamento(int arvoresPlantadas) {
        this.arvoresPlantadas = arvoresPlantadas;
    }

    public ProjetoReflorestamento(String descricao, String nome, String relatorioImpacto, ArrayList<Voluntario> voluntarios, int arvoresPlantadas) {
        super(descricao, nome, relatorioImpacto, voluntarios);
        this.arvoresPlantadas = arvoresPlantadas;
    }

    public int getArvoresPlantadas() {
        return arvoresPlantadas;
    }

    public void setArvoresPlantadas(int arvoresPlantadas) {
        this.arvoresPlantadas = arvoresPlantadas;
    }

    @Override
    public String toString() {
        return "ProjetoReflorestamento{" +
                "arvoresPlantadas=" + arvoresPlantadas + ", voluntarios=" + voluntarios + '}';
    }
}
