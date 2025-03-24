import entity.*;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class AppGestaoSustentabilidade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<ProjetoSustentavel> projetoSustentaveis = new ArrayList<>();
        List<Organizacao> organizacoes = new ArrayList<>();
        List<Voluntario> voluntarios = new ArrayList<>();

        int option;

        do {
            System.out.println("GESTÃO DE SUSTENTABILIDADE\n");
            System.out.println("1. CADASTRO\n" +
                    "2. RELATORIO\n" +
                    "3. IMPACTO AMBIENTAL\n" +
                    "4. LISTAR ORGANIZAÇÕES\n" +
                    "5. SAIR");
            try {
                option = scan.nextInt();
                scan.nextLine();

                switch (option) {
                    case 1:
                        System.out.println("TELA DE CADASTRO\n\n" +
                                "ESCOLHA UMA DAS OPÇÕES ABAIXO\n" +
                                "1. EMPRESA\n" +
                                "2. ONG\n" +
                                "3. PROJETO\n" +
                                "4. VOLUNTÁRIO\n" +
                                "5. LISTAR PROJETOS");

                        int option2 = scan.nextInt();
                        scan.nextLine();
                        switch (option2) {
                            case 1:
                                System.out.println("Nome: ");
                                String nomeEspresa = scan.nextLine();
                                System.out.println("CNPJ: ");
                                String cnpj = scan.nextLine();

                                Empresa novaEmpresa = new Empresa(nomeEspresa, cnpj);
                                organizacoes.add(novaEmpresa);

                                System.out.println("Empresa cadastrado com sucesso!\n" +
                                        "Tecle ENTER para continuar...");
                                scan.nextLine();
                                break;
                            case 2:
                                System.out.println("Nome: ");
                                String nomeOng = scan.nextLine();

                                Ong novaOng = new Ong(nomeOng);
                                organizacoes.add(novaOng);

                                System.out.println("Ong cadastrada com sucesso!\n" +
                                        "Tecle ENTER para continuar...");
                                scan.nextLine();
                                break;
                            case 3:
                                System.out.println("ESCOLHA O TIPO DE PROJETO\n" +
                                        "1. Projeto de Reflorestamento\n" +
                                        "2. Projeto de Reciclagem\n" +
                                        "3. Projeto de Energia Renovável");
                                int option3 = scan.nextInt();
                                scan.nextLine();
                                System.out.println("Nome: ");
                                String nomeProjeto = scan.nextLine();
                                System.out.println("Descrição: ");
                                String descricao = scan.nextLine();

                                switch (option3) {
                                    case 1:
                                        System.out.println("Quantidade de árvores plantadas: ");
                                        int arvoresPlantadas = scan.nextInt();
                                        scan.nextLine();
                                        ProjetoReflorestamento projetoReflorestamento = new ProjetoReflorestamento(nomeProjeto, descricao, arvoresPlantadas);
                                        if (!organizacoes.isEmpty()) {
                                            System.out.println("Selecione a organização para adicionar o projeto: ");
                                            for (int i = 0; i < organizacoes.size(); i++) {
                                                System.out.println(i + 1 + ". " + organizacoes.get(i).getNome());
                                            }
                                            int esclohaOrganizacao = scan.nextInt();
                                            scan.nextLine();
                                            if (esclohaOrganizacao > 0 && esclohaOrganizacao <= organizacoes.size()) {
                                                Organizacao organizacaoEscolhida = organizacoes.get(esclohaOrganizacao - 1);
                                                organizacaoEscolhida.adicionarProjetos(projetoReflorestamento);
                                                projetoSustentaveis.add(projetoReflorestamento);
                                                System.out.println("Projeto adicionado à organização - " + organizacaoEscolhida.getNome());
                                            } else {
                                                System.out.println("Organização não encontrada!");
                                            }
                                        } else {
                                            System.out.println("Nenhuma organização cadastrada para adicionar o projeto!");
                                        }
                                        break;
                                    case 2:
                                        System.out.println("Quantidade de lixo reciclado em toneladas: ");
                                        double lixoReciclado = scan.nextDouble();
                                        scan.nextLine();
                                        ProjetoReciclagem projetoReciclagem = new ProjetoReciclagem(nomeProjeto, descricao, lixoReciclado);
                                        if (!organizacoes.isEmpty()) {
                                            System.out.println("Selecione a organização para adicionar o projeto: ");
                                            for (int i = 0; i < organizacoes.size(); i++) {
                                                System.out.println(i + 1 + ". " + organizacoes.get(i).getNome());
                                            }
                                            int esclohaOrganizacao = scan.nextInt();
                                            scan.nextLine();
                                            if (esclohaOrganizacao > 0 && esclohaOrganizacao <= organizacoes.size()) {
                                                Organizacao organizacaoEscolhida = organizacoes.get(esclohaOrganizacao - 1);
                                                organizacaoEscolhida.adicionarProjetos(projetoReciclagem);
                                                projetoSustentaveis.add(projetoReciclagem);
                                                System.out.println("Projeto adicionado à organização - " + organizacaoEscolhida.getNome());
                                            } else {
                                                System.out.println("Organização não encontrada!");
                                            }
                                        } else {
                                            System.out.println("Nenhuma organização cadastrada para adicionar o projeto!");
                                        }
                                        break;
                                    case 3:
                                        System.out.println("Quantidade de energia gerada: ");
                                        double energiaGerada = scan.nextDouble();
                                        scan.nextLine();
                                        ProjetoEnergiaRenovavel projetoEnergiaRenovavel = new ProjetoEnergiaRenovavel(nomeProjeto, descricao, energiaGerada);
                                        if (!organizacoes.isEmpty()) {
                                            System.out.println("Selecione a organização para adicionar o projeto: ");
                                            for (int i = 0; i < organizacoes.size(); i++) {
                                                System.out.println(i + 1 + ". " + organizacoes.get(i).getNome());
                                            }
                                            int esclohaOrganizacao = scan.nextInt();
                                            scan.nextLine();
                                            if (esclohaOrganizacao > 0 && esclohaOrganizacao <= organizacoes.size()) {
                                                Organizacao organizacaoEscolhida = organizacoes.get(esclohaOrganizacao - 1);
                                                organizacaoEscolhida.adicionarProjetos(projetoEnergiaRenovavel);
                                                projetoSustentaveis.add(projetoEnergiaRenovavel);
                                                System.out.println("Projeto adicionado à organização - " + organizacaoEscolhida.getNome());
                                            } else {
                                                System.out.println("Organização não encontrada!");
                                            }
                                        } else {
                                            System.out.println("Nenhuma organização cadastrada para adicionar o projeto!");
                                        }
                                        break;
                                    default:
                                        System.out.println("Opção Inválida!");
                                }
                                System.out.println("Projeto cadastrado com sucesso!" +
                                        "Tecle ENTER para continuar...\n");
                                scan.nextLine();
                                break;
                            case 4:
                                System.out.println("Nome: ");
                                String nomeVoluntario = scan.nextLine();
                                System.out.println("E-mail: ");
                                String email = scan.nextLine();

                                Voluntario novoVoluntario = new Voluntario(nomeVoluntario, email);
                                voluntarios.add(novoVoluntario);

                                System.out.println("Escolha um projeto para participar: ");
                                for (int i = 0; i < projetoSustentaveis.size(); i++) {
                                    System.out.println(i + 1 + ". " + projetoSustentaveis.get(i).getNome());
                                }
                                int projetoEscolhido = scan.nextInt();
                                scan.nextLine();
                                if (projetoEscolhido > 0 && projetoEscolhido <= projetoSustentaveis.size()) {
                                    ProjetoSustentavel projeto = projetoSustentaveis.get(projetoEscolhido - 1);
                                    novoVoluntario.participarProjeto(projeto);
                                } else {
                                    System.out.println("Projeto não encontrado!");
                                }

                                System.out.println("Voluntário cadastrado com sucesso!" +
                                        "Tecle ENTER para continuar...");
                                scan.nextLine();
                                break;
                            case 5:
                                if (!organizacoes.isEmpty()) {
                                    Organizacao primeiraOrganizacao = organizacoes.get(0);
                                    primeiraOrganizacao.ListarProjetos();
                                } else {
                                    System.out.println("Nenhuma organização cadastrada para listar os projetos!");
                                }
                                break;
                            default:
                                System.out.println("Opção Inválida!");
                        }
                        break;
                    case 2:
                        System.out.println("RELATÓRIO\n ");
                        System.out.println("Escolha uma das opções abaixo\n" +
                                "1. Relatório de Impacto\n" +
                                "2. Relatório de Projetos\n" +
                                "3. Relatório de Voluntários");
                        int option4 = scan.nextInt();
                        scan.nextLine();
                        switch (option4) {
                            case 1:
                                System.out.println("Digite o ID do Projeto: ");
                                int idProjeto = scan.nextInt();
                                if (idProjeto > 0 && idProjeto <= projetoSustentaveis.size()) {
                                    ProjetoSustentavel projeto = projetoSustentaveis.get(idProjeto - 1);
                                    projeto.calcularImpacto(projeto.getArvoresPlantadas(), projeto.getReducaoCo2());
                                    projeto.getRelatorioImpacto().exibirRelatorio();
                                } else {
                                    System.out.println("ID de Projeto inválido!");
                                }
                                break;
                            case 2:
                                if (!organizacoes.isEmpty()) {
                                    Organizacao primeiraOrganizacao = organizacoes.get(0);
                                    primeiraOrganizacao.ListarProjetos();
                                } else {
                                    System.out.println("Nenhuma organização cadastrada para listar os projetos!");
                                }
                                break;
                            case 3:
                                System.out.println("Voluntários cadastrados: ");
                                for (Voluntario v : voluntarios) {
                                    System.out.println(v);
                                    if (v.getProjetos().isEmpty()) {
                                        System.out.println("Não está participando de nenhum projeto");
                                    } else {
                                        for (ProjetoSustentavel projeto : v.getProjetos()) {
                                            System.out.println("Participando do projeto: " + projeto.getNome());
                                        }

                                    }


                                }
                                break;
                            default:
                                System.out.println("Opção Inválida!");
                        }
                        break;
                    case 3:
                        System.out.println("IMPACTO AMBIENTAL DOS PROJETOS\n ");
                        for (ProjetoSustentavel projetoSustentavel : projetoSustentaveis) {
                            projetoSustentavel.calcularImpacto(projetoSustentavel.getArvoresPlantadas(), projetoSustentavel.getReducaoCo2());
                            projetoSustentavel.getRelatorioImpacto().exibirRelatorio();
                        }
                        break;
                    case 4:
                        System.out.println("LISTA DE ORGANIZAÇÕES\n");
                        for (Organizacao org : organizacoes) {
                            System.out.println(org);
                        }
                        break;
                    case 5:
                        System.out.println("Até Logo!");
                        break;
                    default:
                        System.out.println("Opção Inválida!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Opção Inválida!");
                scan.nextLine();
                option = 0;
            } catch (IndexOutOfBoundsException e) {
                System.out.println("ID InválidO!");
                scan.nextLine();
                option = 0;
            }
        } while (option != 5);

    }
}