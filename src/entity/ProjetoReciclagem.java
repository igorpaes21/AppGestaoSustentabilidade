package entity;

public class ProjetoReciclagem extends ProjetoSustentavel {
    private double toneladasRecicladas;

    public ProjetoReciclagem() {
    }

    public ProjetoReciclagem(String nome, String descricao, double toneladasRecicladas) {
        super(nome, descricao);
        this.toneladasRecicladas = toneladasRecicladas;
    }

    public double getToneladasRecicladas() {
        return toneladasRecicladas;
    }

    public void setToneladasRecicladas(double toneladasRecicladas) {
        this.toneladasRecicladas = toneladasRecicladas;
    }

    @Override
    public void calcularImpacto( int arvoresPlantadas, double reducaoCo2) {
        reducaoCo2 = toneladasRecicladas * 0.5;
        getRelatorioImpacto().setArvoresPlantadas(arvoresPlantadas);
        getRelatorioImpacto().setReducaoCo2(reducaoCo2);
        System.out.println("Impacto do Projeto de Reciclagem");
        System.out.println("Impacto: " + toneladasRecicladas + " toneladas recicladas");
        System.out.println("Arvores Plantadas: " + arvoresPlantadas);
        System.out.println("Redução de CO2: " + reducaoCo2 + " toneladas");
    }
}
