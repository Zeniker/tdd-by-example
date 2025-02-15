package guru.springframework;

public class Sum implements Expression{
    final Expression augmend;
    Expression addmend;

    Sum(Expression augmend, Expression addmend) {
        this.augmend = augmend;
        this.addmend = addmend;
    }

    @Override
    public Expression times(int multiplier) {
        return new Sum(augmend.times(multiplier), addmend.times(multiplier));
    }

    @Override
    public Money reduce(Bank bank, String to){
        int amount = this.augmend.reduce(bank, to).amount + this.addmend.reduce(bank, to).amount;
        return new Money(amount, to);
    }

    @Override
    public Expression plus(Expression addend) {
        return new Sum(this, addmend);
    }
}
