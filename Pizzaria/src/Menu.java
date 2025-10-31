
import javax.swing.JOptionPane;

/**
 * classe criada para apresentar um menu de opcoes ao cliente com os diversos
 * sabores de pizza e o pao
 *
 * @author Guilherme A.
 */
public class Menu {

    Pizza pizza;
    Forno forno = new Forno();
    String msg;

    public Menu() {

        msg = "1- Calabresa";
        msg = msg + "\n2- Cinco Queijos";
        msg = msg + "\n3- Frango com CATUPIRY";
        msg = msg + "\n4- Marguerita";
        msg = msg + "\n5- Brocolis";
        msg = msg + "\n6- Pizza de Cachorro quente";
        msg = msg + "\n7- Banana com doce de leite";
        msg = msg + "\n8- Romeu e julieta";
        msg = msg + "\n9- Pao";
        msg = msg + "\n10- Sair";

        while (true) {
            int opc = Integer.parseInt(JOptionPane.showInputDialog(msg));
            switch (opc) {
                case 1:
                    pizza = new Calabresa();
                    break;
                case 2:
                    pizza = new CincoQueijos();
                    break;
                case 3:
                    pizza = new FrangoCatupiry();
                    break;
                case 4:
                    pizza = new Marguerita();
                    break;
                case 5:
                    pizza = new Brocolis();
                    break;
                case 6:
                    pizza = new CachorroQuente();
                    break;
                case 7:
                    pizza = new BananaDoceLeite();
                    break;
                case 8:
                    pizza = new RomeuJulieta();
                    break;
                case 9:
                    pizza = new Pao();
                case 10:
                    System.exit(0);
                default:
                    JOptionPane.showConfirmDialog(null, "Opcao invalida");
            }
        }

    }
}
