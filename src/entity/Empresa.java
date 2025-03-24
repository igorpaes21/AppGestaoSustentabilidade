package entity;

public class Empresa extends Organizacao {
    private String cnpj;

    public Empresa() {
        super();
    }

    public Empresa(String nome, String cnpj) {
        super(nome);
        this.cnpj = cnpj;
    }

    public Empresa(String nomeEspresa) {
        super(nomeEspresa);
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Empresa{");
        sb.append("nome=").append(getNome()).append('\'');
        sb.append(", cnpj=").append(cnpj).append('\'');
        sb.append(", listaProjetos=").append(getListaProjetos());
        if (getListaProjetos() != null) {
            for (int i = 0; i < getListaProjetos().size(); i++) {
                ProjetoSustentavel projeto = getListaProjetos().get(i);
                sb.append("ProjetoSustentavel{");
                sb.append("nome = ").append(projeto.getNome()).append('\'');
                sb.append(", descricao = ").append(projeto.getDescricao()).append('\'');
                sb.append(", RelatorioImpacto = ").append(projeto.getRelatorioImpacto()).append('\'');
                sb.append('}');
                if (i < getListaProjetos().size() - 1) {
                    sb.append(", ");
                }

            }
        }
        sb.append('}');
        return sb.toString();
    }
}
