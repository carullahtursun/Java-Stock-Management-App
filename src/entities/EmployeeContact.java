package entities;

public class EmployeeContact {
    private int id;
    private int roleId;
    private String nameSurname;
    private String email;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "EmployeeContact{" +
                "id=" + id +
                ", role=" + roleId +
                ", nameSurname='" + nameSurname + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
