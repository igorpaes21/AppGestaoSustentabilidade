package entity;

import java.util.ArrayList;

public class ProjetoEnergiaRenovavel extends ProjetoSustentavel {
    Double energiaGerada;

    ProjetoEnergiaRenovavel(){}
    public ProjetoEnergiaRenovavel(Double energiaGerada) {
        this.energiaGerada = energiaGerada;
    }
    public ProjetoEnergiaRenovavel(String descricao, String nome, String relatorioImpacto, ArrayList<Voluntario> voluntarios, Double energiaGerada) {
        super(descricao, nome, relatorioImpacto, voluntarios);
        this.energiaGerada = energiaGerada;
    }

    public Double getEnergiaGerada() {
        return energiaGerada;
    }

    public void setEnergiaGerada(Double energiaGerada) {
        this.energiaGerada = energiaGerada;
    }

    @Override
    public String toString() {
        return "ProjetoEnergiaRenovavel{" +
                "energiaGerada=" + energiaGerada + ", voluntarios=" + voluntarios + '}';
    }
}
