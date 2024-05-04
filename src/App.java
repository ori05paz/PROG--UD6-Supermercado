import javax.swing.JOptionPane;

import org.supermarkets.hiperdino.elements.Cashier;
import org.supermarkets.hiperdino.management.Supermarket;
import org.supermarkets.hiperdino.util.Menu;

public class App {
    public static void main(String[] args) {
        
        Cashier cashier = new Cashier(1);

        Supermarket supermarket = new Supermarket(cashier);

        int option;
        do {
            option = Menu.showMenu();
            
            switch (option) {
                case 1:
                    try {
                        supermarket.openBox();
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    supermarket.addNewClient();
                    break;
                case 3:
                    supermarket.serveClient();
                    break;
                case 4:
                    supermarket.pendingClients();
                    break;
                case 5:
                try {
                    supermarket.closeSupermarket();
                    JOptionPane.showMessageDialog(null, "Caja cerrada correctamente.");
                } catch (IllegalStateException e) {
                    JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción inválida. Inténtelo de nuevo.", "Error", JOptionPane.ERROR_MESSAGE);
                break;
            }
        } while (option != 5);
    }
}
