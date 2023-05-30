package practice;

public abstract class Client {
    protected double amount;
    public double getAmount() {
        return amount;
    }

    public void put(double amountToPut) {
        amount += amountToPut;
    }

    public void take(double amountToTake) {
        amount -= amountToTake;
    }

}
