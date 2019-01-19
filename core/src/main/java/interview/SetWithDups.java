package interview;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dhiraj
 * @date 14/01/19
 */
public class SetWithDups {
    public static void main(String[] args) {
        Set<Emp> emps= new HashSet<>();
        emps.add(new Emp(1,"dk"));
        emps.add(new Emp(1,"dk"));
        System.out.println(emps);
    }
}

class Emp{
    private int id;
    private String name;

    public Emp(int id, String name) {
        this.id = id;
        this.name = name;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Emp){
            System.out.println("equals called");
            return this.id==((Emp)obj).id && this.name==((Emp)obj).name;
            //return false;
        }
        return false;
    }

    @Override
    public int hashCode() {
        System.out.println("hascode called");
        return id%7+name.hashCode();
    }

    @Override
    public String toString() {
        return "Emp{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}