package entity;

import java.util.ArrayList;

public class ProjetoReflorestamento extends ProjetoSustentavel{
   private int arvoresPlantadas;

    public ProjetoReflorestamento() {}

    public ProjetoReflorestamento(String nome, String descricao, int arvoresPlantadas) {
        super(nome, descricao);
        this.arvoresPlantadas = arvoresPlantadas;
    }

    public int getArvoresPlantadas() {
        return arvoresPlantadas;
    }

    public void setArvoresPlantadas(int arvoresPlantadas) {
        this.arvoresPlantadas = arvoresPlantadas;
    }

    @Override
    public void calcularImpacto( int arvoresPlantadas, double reducaoCo2) {
        reducaoCo2 = arvoresPlantadas * 0.5;
        gerarRelatorioImpacto().setArvoresPlantadas(arvoresPlantadas);
        gerarRelatorioImpacto().setReducaoCo2(reducaoCo2);
        System.out.println("Impacto do Projeto de Reflorestamento");
        System.out.println("Impacto: " + arvoresPlantadas + " árvores plantadas");
        System.out.println("Redução de CO2: " + reducaoCo2 + " toneladas");
    }

    private RelatorioImpacto gerarRelatorioImpacto() {
        return new RelatorioImpacto();
    }
}
