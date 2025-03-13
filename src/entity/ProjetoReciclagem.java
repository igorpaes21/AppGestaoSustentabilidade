package entity;

import java.util.ArrayList;

public class ProjetoReciclagem extends ProjetoSustentavel{
    Double toneladasRecicladas;

    ProjetoReciclagem(){}

    public ProjetoReciclagem(Double toneladasRecicladas) {
        this.toneladasRecicladas = toneladasRecicladas;
    }

    public ProjetoReciclagem(String descricao, String nome, String relatorioImpacto, ArrayList<Voluntario> voluntarios, Double toneladasRecicladas) {
        super(descricao, nome, relatorioImpacto, voluntarios);
        this.toneladasRecicladas = toneladasRecicladas;
    }

    public Double getToneladasRecicladas() {
        return toneladasRecicladas;
    }

    public void setToneladasRecicladas(Double toneladasRecicladas) {
        this.toneladasRecicladas = toneladasRecicladas;
    }

    @Override
    public String toString() {
        return "ProjetoReciclagem{" +
                "toneladasRecicladas=" + toneladasRecicladas + ", voluntarios=" + voluntarios + '}';
    }
}
