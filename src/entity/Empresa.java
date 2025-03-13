package entity;

import java.util.ArrayList;

public class Empresa extends Oraganizaçao{
    private String cnpj;

   public Empresa(){}

    public Empresa(String cnpj) {
        this.cnpj = cnpj;
    }

    public Empresa(ArrayList<ProjetoSustentavel> listaProjetos, String nome, String cnpj) {
        super(listaProjetos, nome);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Empresa{" + "cnpj='" + cnpj + '\'' + '}';
    }
}
