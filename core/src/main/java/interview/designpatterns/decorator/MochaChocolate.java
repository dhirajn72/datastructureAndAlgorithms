package interview.designpatterns.decorator;

/**
 * @author Dhiraj
 * @date 08/02/19
 */
public class MochaChocolate extends Condiments {
    public MochaChocolate(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return "Mocha";
    }

    @Override
    public double cost() {
        return getBeverage().cost()+20;
    }
}
