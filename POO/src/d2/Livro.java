package d2;

import java.util.ArrayList;

public class Livro {
    
    private String autores;
    private int quantExemplar;
    private int quantDisponivel;
    
    private ArrayList<Livro> livroAux = new ArrayList<>();
    Publicacao publicacaoAux = new Publicacao();
    
    public Livro() {
    }
    
    public Livro(String autores, int quantExemplar, int quantDisponivel) {
        this.autores = autores;
        this.quantExemplar = quantExemplar;
        this.quantDisponivel = quantDisponivel;
    }

    // <editor-fold defaultstate="collapsed" desc="Métodos Getters e Setters">
    public String getAutores() {
        return autores;
    }
    
    public void setAutores(String autores) {
        this.autores = autores;
    }
    
    public int getQuantExemplar() {
        return quantExemplar;
    }
    
    public void setQuantExemplar(int quantExemplar) {
        this.quantExemplar += quantExemplar;
    }
    
    public int getQuantDisponivel() {
        return quantDisponivel;
    }
    
    public void setQuantDisponivel(int quantDisponivel) {
        this.quantDisponivel += quantDisponivel;
    }
    // </editor-fold >

    public void cadastraLivro(Livro livro) {
        livroAux.add(livro);
    }

    //Caso emprestimo indice = 1, se não indice = 0
    public String atualizarQuantidadeDisponivel(int... indiceAtualiza) {
        try {
            if (indiceAtualiza.equals(1)) {
                if (this.quantDisponivel > 0) {
                    this.quantDisponivel -= 1;
                }
            } else {
                this.quantDisponivel += 1;
            }
        } catch (Exception ex) {
            return ex.getMessage();
        }
        return "Atualizado com sucesso !";
    }
    
    public boolean verificaLivroExistente(String autor) {
        
        if (!"".equals(autor)) {
            for (int i = 0; i < livroAux.size(); i++) {
                if (livroAux.get(i).getAutores().contains(autor)) {
                    return true;
                }
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "\n ------------ Livro ------------"
                + "\nAutores: " + autores
                + "\nQuantidade de Exemplar: " + quantExemplar
                + "\nQuantidade Disponivel=" + quantDisponivel;
    }
}

// <editor-fold defaultstate="collapsed" desc="Métodos criados e não utilizados">
/* 
    public void cadastraLivro(Publicacao publicacao) {
        String _titulo;

        if (auxQtLivros == 0) {
            _titulo = JOptionPane.showInputDialog("Digite o titulo do livro: ");
            if (publicacaoAux.verificaPublicacaoExistente(0, _titulo, "", 0)) {
                int opcao = Integer.parseInt(JOptionPane.showInputDialog("O livro informado já existe, deseja adicionar mais um exemplar ? \n\t[1] - SIM [2] - NÃO"));
                if (opcao == 1) {
                    this.quantExemplar += 1;
                    this.quantDisponivel += 1;
                } else {
                    String _autor = JOptionPane.showInputDialog("Digite o nome do autor: ");
                    try {
                        if (verificaLivroExistente(_autor)) {
                            JOptionPane.showMessageDialog(null, "O livro informado já encontra-se cadastrado, adicionamos mais um exemplar!");
                            this.quantExemplar += 1;
                            this.quantDisponivel += 1;
                        } else {
                            int _quantExemplar = Integer.parseInt(JOptionPane.showInputDialog("Digite o nome do autor: "));
                            int _quantDisponivel = Integer.parseInt(JOptionPane.showInputDialog("Digite o nome do autor: "));
                            int _codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o nome do autor: "));
                            String _editora = JOptionPane.showInputDialog("Digite o nome do autor: ");
                            int _ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o nome do autor: "));
                            
                            Livro livro = new Livro(_autor, _quantExemplar, _quantDisponivel);
                            livroAux.add(livro);

                        }
                    } catch (Exception ex) {
                        ex.getMessage();
                    }
                }
            }
        }
    }*/
    // </editor-fold>
