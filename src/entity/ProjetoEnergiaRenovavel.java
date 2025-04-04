package entity;

import interfaces.ImpactoAmbiental;

import java.util.ArrayList;

public class ProjetoEnergiaRenovavel extends ProjetoSustentavel {
    private double energiaGerada;

    public ProjetoEnergiaRenovavel() {
    }

    public ProjetoEnergiaRenovavel(String nome, String descricao, Double energiaGerada) {
        super(nome, descricao);
        this.energiaGerada = energiaGerada;
    }

    public ProjetoEnergiaRenovavel(String descricao, double energiaGerada) {
        super();
        setDescricao(descricao);
        setNome(nome);
        this.energiaGerada = energiaGerada;
    }

    public double getEnergiaGerada() {
        return energiaGerada;
    }

    public void setEnergiaGerada(double energiaGerada) {
        this.energiaGerada = energiaGerada;
    }

    @Override
    public void calcularImpacto(int arvoresPlantadas, double reducaoCo2) {
        reducaoCo2 = energiaGerada * 0.5;
        getRelatorioImpacto().setArvoresPlantadas(arvoresPlantadas);
        getRelatorioImpacto().setReducaoCo2(reducaoCo2);
        System.out.println("Impacto do Projeto de Energia Renovável");
        System.out.println("Impacto: " + energiaGerada + " KWh de energia gerada");
        System.out.println("Arvores Plantadas: " + arvoresPlantadas);
        System.out.println("Redução de CO2: " + reducaoCo2 + " toneladas");

    }

    @Override
    public RelatorioImpacto getRelatorioImpacto(int arvoresPlantadas, double reducaoCo2) {
        RelatorioImpacto relatorio = new RelatorioImpacto();
        relatorio.setArvoresPlantadas(arvoresPlantadas);
        relatorio.setReducaoCo2(reducaoCo2);
        return relatorio;
    }

    @Override
    public RelatorioImpacto getRelatorioImpacto() {
        return new RelatorioImpacto();

    }
}
