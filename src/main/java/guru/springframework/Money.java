package guru.springframework;

public class Money {

    protected int amount;

    @Override
    public boolean equals(Object obj) {
        Money money = (Money) obj;
        return money.amount == this.amount
                && this.getClass().equals(obj.getClass());
    }

}
