package interview.designpatterns.decorator;

/**
 * @author Dhiraj
 * @date 08/02/19
 */
public class Latte extends Beverage {

    public Latte() {
        setDescription("Latte");
    }

    @Override
    public double cost() {
        return 20;
    }
}
