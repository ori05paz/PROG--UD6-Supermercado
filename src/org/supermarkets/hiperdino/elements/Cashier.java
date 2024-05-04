package org.supermarkets.hiperdino.elements;


public class Cashier {

    private int number;
    private boolean openedBox;


    public Cashier(int number, boolean openedBox) {
        this.number = number;
        this.openedBox = openedBox;
    }


    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void openBox() {
        if (!openedBox) {
            openedBox = true;
            System.out.println("Caja " + number + " abierta.");
        } else {
            throw new IllegalStateException("La caja " + number + " ya está abierta.");
        }
    }

    public void closeBox() {
        if (openedBox) {
            openedBox = false;
            System.out.println("Caja " + number + " cerrada.");
        } else {
            throw new IllegalStateException("La caja " + number + " ya está cerrada.");
        }
    }

    public boolean isOpenedBox() {
        return openedBox;
    }

    @Override
    public String toString() {
        return "Cajero{" +
                "número =" + number +
                ", caja abierta =" + openedBox +
                '}';
    }
}
