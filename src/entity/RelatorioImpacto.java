package entity;

public class RelatorioImpacto {

    private int arvoresPlanta;
    private Double reducaoCo2;

    RelatorioImpacto(){}

    public RelatorioImpacto(int arvoresPlanta, Double reducaoCo2) {
        this.arvoresPlanta = arvoresPlanta;
        this.reducaoCo2 = reducaoCo2;
    }

    public int getArvoresPlanta() {
        return arvoresPlanta;
    }

    public void setArvoresPlanta(int arvoresPlanta) {
        this.arvoresPlanta = arvoresPlanta;
    }

    public Double getReducaoCo2() {
        return reducaoCo2;
    }

    public void setReducaoCo2(Double reducaoCo2) {
        this.reducaoCo2 = reducaoCo2;
    }
    public static void exibirRelatorio(){
    }
}
