package interview.designpatterns.decorator;

/**
 * @author Dhiraj
 * @date 08/02/19
 */
public class Espresso extends Beverage {
    public Espresso() {
        setDescription("Espresso");
    }
    @Override
    public double cost() {
        return 10;
    }
}
