package guru.springframework;

public class Sum implements Expression{
    Expression augmend;
    Expression addmend;

    public Sum(Expression augmend, Expression addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    @Override
    public Money reduce(Bank bank, String to){
        int amount = this.augmend.reduce(bank, to).amount + this.addmend.reduce(bank, to).amount;
//        int amount = this.augmend.amount + this.addmend.amount;
        return new Money(amount, to);
    }

    @Override
    public Expression plus(Expression addend) {
        return null;
    }
}
