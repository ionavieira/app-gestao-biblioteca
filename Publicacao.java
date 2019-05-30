package biblioteca;

import java.awt.HeadlessException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Publicacao {

    private int codigo;
    private String titulo;
    private String editora;
    private int ano;

    private ArrayList<Publicacao> publicacaoAux = new ArrayList<>();

    public Publicacao() {
    }

    public Publicacao(int codigo, String titulo, String editora, int ano) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.editora = editora;
        this.ano = ano;
    }

    // <editor-fold defaultstate="collapsed" desc="Métodos Getters e Setters">  
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    // </editor-fold>

    public boolean verificaPublicacaoExistente(int codigo, String titulo, String editora, int ano) {
        if (codigo != 0 && !"".equals(titulo) && !"".equals(editora) && ano != 0) {
            Publicacao publicacao = new Publicacao(codigo, titulo, editora, ano);
            if (publicacaoAux.contains(publicacao)) {
                return true;
            }
        } else if (!"".equals(titulo)) {
            for (int i = 0; i < publicacaoAux.size(); i++) {
                if (publicacaoAux.get(i).getTitulo().equals(titulo)) {
                    return true;
                }
            }
        } else if (!"".equals(editora)) {
            for (int i = 0; i < publicacaoAux.size(); i++) {
                if (publicacaoAux.get(i).getEditora().equals(editora)) {
                    return true;
                }
            }
        } else if (ano != 0) {
            for (int i = 0; i < publicacaoAux.size(); i++) {
                if (publicacaoAux.get(i).getAno() == ano) {
                    return true;
                }
            }
        }
        return false;
    }

    public void cadastraPublicacao() {
        Livro livro = new Livro();

        if (publicacaoAux.isEmpty()) {
            String _titulo = JOptionPane.showInputDialog("Digite o titulo da publicação: ");
            if (verificaPublicacaoExistente(0, _titulo, "", 0)) {
                int opcao = Integer.parseInt(JOptionPane.showInputDialog("A publicação informada já existe, deseja adicionar mais um exemplar ? \n\t[1] - SIM [2] - NÃO"));
                if (opcao == 1) {
                    livro.atualizarQuantidadeDisponivel(1);
                    livro.setQuantExemplar(1);
                }
            } else {
                String _autor = JOptionPane.showInputDialog("Digite o nome do autor: ");
                try {
                    if (livro.verificaLivroExistente(_autor)) {
                        JOptionPane.showMessageDialog(null, "O livro informado já encontra-se cadastrado!");
                    } else {

                        String _editora = JOptionPane.showInputDialog("Digite o a editora da publicação: ");
                        int _ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano da publicação: "));

                        int _numEdicao = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de edição da publicação: "));
                        String _mes = JOptionPane.showInputDialog("Digite o mês da publicação: ");

                        int _quantExemplar = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de exemplares que deseja: "));
                        int _quantDisponivel = _quantExemplar;

                        try {
                            try {
                                livro = new Livro(_autor, _quantExemplar, _quantDisponivel);
                                livro.cadastraLivro(livro);
                            } catch (Exception ex) {
                                ex.getMessage();
                            }
                            try {
                                Publicacao publicacao = new Publicacao(gerarCodigo(), _titulo, _editora, _ano);
                                publicacaoAux.add(publicacao);
                            } catch (Exception ex) {
                                ex.getMessage();
                            }
                            try {
                                Periodico periodico = new Periodico(_numEdicao, _mes);
                                periodico.cadastraPeriodico(periodico);
                            } catch (Exception ex) {
                                ex.getMessage();
                            }
                        } catch (Exception ex) {
                            ex.getMessage();
                        }

                    }
                } catch (HeadlessException | NumberFormatException ex) {
                    ex.getMessage();
                }
            }
        }
    }

//Método para Listar Publicações
    public String listarPublicacao() {
        String _listUser = "Não existem publicações cadastradas";
        if (!publicacaoAux.isEmpty()) {
            try {
                for (int i = 0; i < publicacaoAux.size(); i++) {
                    _listUser = "Publicação [" + i + "]: " + publicacaoAux.get(i).toString();
                }
            } catch (Exception ex) {
                return "Opa, algo deu errado !";
            }
        }
        return _listUser;
    }

    public String pesquisarPublicacao(String nomeLivro, String... nomeAutor) {
        for (int i = 0; i < publicacaoAux.size(); i++) {
            if (publicacaoAux.get(i).getTitulo().equals(nomeLivro)) {
                return publicacaoAux.get(i).toString();
            }
        }
        return "Livro não encontrado";
    }

    public int gerarCodigo() {
        int random = 1 + (int) (Math.random() * 100);
        return random;
    }

    @Override
    public String toString() {
        return "\n ------------ Publicacao ------------"
                + "\nCodigo: " + codigo
                + "\nTitulo: " + titulo
                + "\nEditora: " + editora
                + "\nAno: " + ano;
    }

}
