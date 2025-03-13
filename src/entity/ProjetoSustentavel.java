package entity;

import java.util.ArrayList;

public class ProjetoSustentavel {

    private String nome;
    private String descricao;
    private String relatorioImpacto;
    ArrayList<Voluntario> voluntarios = new ArrayList<>();

    ProjetoSustentavel(){}

    public ProjetoSustentavel(String descricao, String nome, String relatorioImpacto, ArrayList<Voluntario> voluntarios) {
        this.descricao = descricao;
        this.nome = nome;
        this.relatorioImpacto = relatorioImpacto;
        this.voluntarios = voluntarios;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRelatorioImpacto() {
        return relatorioImpacto;
    }

    public void setRelatorioImpacto(String relatorioImpacto) {
        this.relatorioImpacto = relatorioImpacto;
    }

    public ArrayList<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public void setVoluntarios(ArrayList<Voluntario> voluntarios) {
        this.voluntarios = voluntarios;
    }
    public static void adicionarVoluntario(Voluntario voluntario){

    }
    public static void gerarRelatorioImpacto(int arvoresPlantadas, double reducaoCO2){

    }
}
