package practice;

public class IndividualBusinessman extends Client {
    @Override
    public void put(double amountToPut) {
        if(amountToPut > 0 && amountToPut < 1000) {
            amount += amountToPut - 0.01 * amountToPut;
        }
        if(amountToPut >= 1000) {
            amount += amountToPut - 0.005 * amountToPut;
        }
    }

    @Override
    public void take(double amountToTake) {
        if(amountToTake <= amount) {
            amount = amount -  (amountToTake + 0.01 * amountToTake);
        }
    }
}
