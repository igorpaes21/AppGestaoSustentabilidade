package entity;

import interfaces.ImpactoAmbiental;

import java.util.ArrayList;

public abstract class ProjetoSustentavel implements ImpactoAmbiental {
    String nome;
    String descricao;
    private RelatorioImpacto relatorioImpacto;
    private static final ArrayList<Voluntario> voluntarios = new ArrayList<>();

    public ProjetoSustentavel() {
    }

    public ProjetoSustentavel(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
        this.relatorioImpacto = new RelatorioImpacto();
    }

    public ProjetoSustentavel(String nome, String descricao, ArrayList<Voluntario> voluntarios) {
        this.nome = nome;
        this.descricao = descricao;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public RelatorioImpacto getRelatorioImpacto() {
        return relatorioImpacto;

    }

    public void setRelatorioImpacto(RelatorioImpacto relatorioImpacto) {
        this.relatorioImpacto = relatorioImpacto;
    }

    public ArrayList<Voluntario> getVoluntarios() {
        return voluntarios;
    }

    public int getArvoresPlantadas() {
        return relatorioImpacto.getArvoresPlantadas();

    }

    public double getReducaoCo2() {
        return relatorioImpacto.getReducaoCo2();
    }

    public void addVoluntario(Voluntario voluntario) {
        voluntarios.add(voluntario);
    }

    public void gerarRelatorioImpacto(int arvoresPlantadas, double reducaoCo2) {
        this.relatorioImpacto = new RelatorioImpacto(arvoresPlantadas, reducaoCo2);
    }

    public void calcularImpacto(int arvoresPlantadas, double reducaoCo2) {
        gerarRelatorioImpacto(arvoresPlantadas, reducaoCo2);
    }

    @Override
    public String toString() {
        StringBuilder voluntariosNomes = new StringBuilder();
        for (Voluntario voluntario : voluntarios) {
            voluntariosNomes.append(voluntario.getNome()).append(", ");
        }
        if (!voluntariosNomes.isEmpty()) {
            voluntariosNomes.setLength(voluntariosNomes.length() - 2);
        }

        return "ProjetoSustentavel{" +
                "nome = '" + nome + '\'' +
                ", descricao = '" + descricao + '\'' +
                ", relatorio Impacto = " + relatorioImpacto +
                ", voluntarios = " + voluntariosNomes +
                '}';
    }


    public void ListarVoluntarios() {
        for (Voluntario voluntario : voluntarios) {
            System.out.println(voluntario);
        }
    }
}
