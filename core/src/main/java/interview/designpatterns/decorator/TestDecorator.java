package interview.designpatterns.decorator;

/**
 * @author Dhiraj
 * @date 08/02/19
 */
public class TestDecorator {
    public static void main(String[] args) {
        Beverage beverage= new Latte();
        beverage=new Milk(beverage);
        beverage=new MochaChocolate(beverage);
        System.out.println("Pay:"+beverage.cost());
    }
}
