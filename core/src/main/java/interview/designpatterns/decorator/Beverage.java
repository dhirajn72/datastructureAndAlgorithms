package interview.designpatterns.decorator;

/**
 * @author Dhiraj
 * @date 08/02/19
 */
public abstract class Beverage {
    private String description="Unnamed";
    public String getDescription() {
        return description;
    }
    public void setDescription(String desc){
        this.description=desc;
    }
    public abstract double cost();
}
