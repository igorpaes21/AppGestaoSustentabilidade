package entity;

public class RelatorioImpacto {
    private static int arvoresPlantadas;
    private static double reducaoCo2;

    public RelatorioImpacto(){}

    public RelatorioImpacto(int arvoresPlantadas, double reducaoCo2) {
        this.arvoresPlantadas = arvoresPlantadas;
        this.reducaoCo2 = reducaoCo2;
    }

    public int getArvoresPlantadas() {
        return arvoresPlantadas;
    }

    public void setArvoresPlantadas(int arvoresPlantadas) {
        this.arvoresPlantadas = arvoresPlantadas;
    }

    public double getReducaoCo2() {
        return reducaoCo2;
    }

    public void setReducaoCo2(double reducaoCo2) {
        this.reducaoCo2 = reducaoCo2;
    }
    public void exibirRelatorio(){
        System.out.println("Relatório de Impacto: " + arvoresPlantadas + " árvores plantadas e " + reducaoCo2 + " toneladas de CO2 reduzidas.");

    }
    @Override
    public String toString() {
        return "RelatorioImpacto{" +
                "Arvores Plantadas = " + arvoresPlantadas +
                ", ReducaoCo2 = " + reducaoCo2 +
                '}';
    }
}