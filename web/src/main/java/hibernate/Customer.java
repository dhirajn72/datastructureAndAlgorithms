package hibernate;

import javax.persistence.*;

/**
 * @author Dhiraj
 * @date 08/12/19
 */

@Entity
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column
    private String name;
    @Column
    private String dept;
    @Column
    private long phone;

    public Customer() {
    }

    public Customer( String name, String dept, long phone) {
        this.name = name;
        this.dept = dept;
        this.phone = phone;
    }

    @OneToOne
    @JoinColumn(name = "aid",referencedColumnName = "id")
    private Address address;

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
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

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
