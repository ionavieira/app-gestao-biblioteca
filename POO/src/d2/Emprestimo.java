package d2;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

public class Emprestimo {

    private int codigo;
    private Date dataEmprestimo;
    private Date dataPrevDevolucao;
    private double valorMulta;
    Usuario usuario;

    ArrayList<Emprestimo> emprestimoAux = new ArrayList<>();
    Publicacao publicacao = new Publicacao();
    Livro livro = new Livro();

    public Emprestimo() {
    }

    public Emprestimo(int codigo, Date dataEmprestimo, Usuario usuario) {
        this.codigo = codigo;
        this.dataEmprestimo = dataEmprestimo;
        this.usuario = usuario;
    }

    public Emprestimo(int codigo, Date dataEmprestimo, Date dataPrevDevolucao, Usuario usuario) {
        this.codigo = codigo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataPrevDevolucao = dataPrevDevolucao;
        this.usuario = usuario;
    }

    // <editor-fold defaultstate="collapsed" desc="Métodos Getters e Setters">
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(Date dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Date getDataPrevDevolucao() {
        return dataPrevDevolucao;
    }

    public void setDataPrevDevolucao(Date dataPrevDevolucao) {
        this.dataPrevDevolucao = dataPrevDevolucao;
    }

    public double getValorMulta() {
        return valorMulta;
    }

    public void setValorMulta(double valorMulta) {
        this.valorMulta = valorMulta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    // </editor-fold>

    public void adicionarItem() throws ParseException {
        int _codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite o código da Publicação: "));
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
        Date _dataEmprestimo = new Date(); //Data de hoje
        Date _dataPrevDevolucao = dateFormat.parse(JOptionPane.showInputDialog("Data a data de devolução: "));

        if (!publicacao.verificaPublicacaoExistente(_codigo, "", "", 0)) {
            try {
                Emprestimo emprestimo = new Emprestimo(_codigo, _dataEmprestimo, _dataPrevDevolucao, adicionaUsuario());
                emprestimoAux.add(emprestimo);
                livro.atualizarQuantidadeDisponivel(1);
            } catch (Exception ex) {
                ex.getMessage();
            }
        }
    }
  
    public void calcularValorMulta() {
        double taxa = 0.5;
        this.valorMulta = verificarDatas() * (1 + taxa);
    }

    public Usuario adicionaUsuario() {
        usuario = new Usuario();
        usuario.cadastrarUsuario();
        return usuario;
    }

    //parâmetro auxiliar somente para diferenciar assinatura dos métodos; não está sendo utilizado
    public void adicionaUsuario(int... aux) {
        usuario = new Usuario();
        usuario.cadastrarUsuario();
    }

    // <editor-fold defaultstate="collapsed" desc="Métodos pendentes para implementação">
    public void devolverItem() {

    }

    public void devolverTodos() {

    }

    public int verificarDatas() {
        return 0;
    }
    // </editor-fold>

    @Override
    public String toString() {
        return "\n ------------ Empréstimo ------------"
                + "\nCodigo: " + codigo
                + "\nDataEmprestimo: " + dataEmprestimo
                + "\nData Previsão de Devolucao: " + dataPrevDevolucao
                + "\nValorMulta: " + valorMulta;
    }

}
