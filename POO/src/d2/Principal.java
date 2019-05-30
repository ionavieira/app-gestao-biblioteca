package d2;

import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();
        int opc = 0;

        do {
            try {
                int _codigo = Integer.parseInt(JOptionPane.showInputDialog("----------Menu----------\n1- Cadastro\n2- Listar\n0- Sair\nEscolha uma opção: "));
                switch (_codigo) {
                    case 0:
                        opc = 1;
                        break;
                    case 1:
                        int _codigo2 = Integer.parseInt(JOptionPane.showInputDialog("--------Cadasatro--------\n1-  Usuario\n2- Publicação\n3- Emprestimo \n4- Devolução \n \nEscolha uma opção: "));
                        switch (_codigo2) {
                            case 1:
                                biblioteca.cadastrarUsuario();
                                break;

                            case 2:
                                biblioteca.cadastrarPublicacao();
                                break;

                            case 3:
                                biblioteca.cadastrarEmprestimo();
                                break;

                            case 4:
                                biblioteca.cadastrarDevolucao();
                                break;

                            case 0:
                                break;
                        }
                        break;
                    case 2:
                        int _codigo3 = Integer.parseInt(JOptionPane.showInputDialog("--------Listar--------\n1-  Usuario\n2- Publicação\n3- Emprestimo \n4- Devolução \nEscolha uma opção: "));
                        switch (_codigo3) {
                            case 0:
                                break;
                            case 1:
                                JOptionPane.showMessageDialog(null, biblioteca.listarUsuario());
                                break;
                            case 2:
                                JOptionPane.showMessageDialog(null, biblioteca.listarPublicacao());
                                break;
                            case 3:
                                JOptionPane.showMessageDialog(null, biblioteca.listarEmprestimo());
                                break;
                            case 4:
                                JOptionPane.showMessageDialog(null, biblioteca.listarDevolucao());
                                break;
                        }
                }

            } catch (Exception ex) {
                ex.getMessage();
            }

        } while (opc == 0);
    }
}
