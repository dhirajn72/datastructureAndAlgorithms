package interview.designpatterns.decorator;

/**
 * @author Dhiraj
 * @date 08/02/19
 */
public class Milk extends Condiments {
    public Milk(Beverage beverage) {
        super(beverage);
    }
    @Override
    public String getDescription() {
        return null;
    }
    @Override
    public double cost() {
        return getBeverage().cost()+10;
    }
}
