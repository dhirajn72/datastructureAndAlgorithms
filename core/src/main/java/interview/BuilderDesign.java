package interview;

/**
 * @author Dhiraj
 * @date 11/06/19
 */
public class BuilderDesign {
    public static void main(String[] args) {
        Employee employee1= new Employee.EmployeeBuilder().setId(99).setName("Dk").build();
        System.out.println(employee1);
        Employee employee2= new Employee.EmployeeBuilder().setId(99).setEmail("gmail").setName("Dk").build();
        System.out.println(employee2);
    }
}

class Employee{
    private int id;
    private String name;
    private String email;


    private Employee() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static class EmployeeBuilder{

        private Employee employee=new Employee();
        public EmployeeBuilder setId(int id) {
            this.employee.setId(id);
            return this;
        }
        public EmployeeBuilder setName(String name){
            this.employee.setName(name);
            return this;
        }
        public EmployeeBuilder setEmail(String mail){
            this.employee.setEmail(mail);
            return this;
        }

        public Employee build(){
            return employee;
        }
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}