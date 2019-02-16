package interview.designpatterns.decorator;

/**
 * @author Dhiraj
 * @date 08/02/19
 */
public abstract class Condiments  extends Beverage{
    private Beverage beverage;
    public Condiments(Beverage beverage) {
        this.beverage=beverage;
    }

    public  abstract String getDescription() ;

    public Beverage getBeverage() {
        return beverage;
    }
}
