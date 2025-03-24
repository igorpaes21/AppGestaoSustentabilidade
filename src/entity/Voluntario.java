package entity;

import java.util.ArrayList;

public class Voluntario {

    private String nome;
    private String email;
    private final ArrayList<ProjetoSustentavel> projetos = new ArrayList<>();

    public Voluntario() {}

    public Voluntario(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<ProjetoSustentavel> getProjetos() {
        return projetos;
    }

    public void participarProjeto(ProjetoSustentavel projeto) {
        projetos.add(projeto);
        projeto.addVoluntario(this);
    }

    @Override
    public String toString() {
        StringBuilder projetosNomes = new StringBuilder();
        for (ProjetoSustentavel projeto : projetos) {
            projetosNomes.append(projeto.getNome()).append(", ");
        }
        if (projetosNomes.length() > 0){
            projetosNomes.setLength(projetosNomes.length() -2);
        }
        return "Voluntario{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", projetos=[" + projetosNomes + "]"+
                '}';

    }

}
