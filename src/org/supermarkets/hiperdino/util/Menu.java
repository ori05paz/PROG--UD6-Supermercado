package org.supermarkets.hiperdino.util;

import javax.swing.JOptionPane;

public class Menu {

    public static int showMenu(){

        String menu = "Menú:\n" 
        + "Seleccione una opción:\n" 
        + "1. Abrir caja\n" 
        + "2. Añadir un nuevo cliente a la cola\n" 
        + "3. Atender un cliente\n" 
        + "4. Ver clientes pendientes\n" 
        + "5. Cerrar supermercado\n";

        String option = JOptionPane.showInputDialog(null, menu, "Menú", JOptionPane.PLAIN_MESSAGE);

        int choice = -1;
        try {
            choice = Integer.parseInt(option);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error: Por favor, ingrese un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        return choice;
    }

    
}
