package test;

import java.util.Set;

/**
 * @author Dhiraj
 * @date 15/06/19
 */
class User {
    private int id;
    private String username;
    private Set<Roles> roles;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Set<Roles> getRoles() {
        return roles;
    }

    public void setRoles(Set<Roles> roles) {
        this.roles = roles;
    }
}
