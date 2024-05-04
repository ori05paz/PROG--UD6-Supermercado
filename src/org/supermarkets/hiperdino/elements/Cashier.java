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

    
}
