package interview.designpatterns.decorator;

/**
 * @author Dhiraj
 * @date 08/02/19
 */
public class MildChocolateShake extends Beverage {
    public MildChocolateShake(String description) {
        setDescription("MildChocolateShake");
    }

    @Override
    public double cost() {
        return 12;
    }
}
