package practice;

public class LegalPerson extends Client {
    @Override
    public void put(double amountToPut) {
        if(amountToPut > 0) {
            amount += amountToPut;
        }
    }

    @Override
    public void take(double amountToTake) {
        if(amountToTake <= amount) {
            amount = amount -  (amountToTake + 0.01 * amountToTake);
        }
    }


}
