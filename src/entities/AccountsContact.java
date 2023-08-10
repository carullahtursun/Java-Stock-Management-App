package entities;

public class AccountsContact {
    private int id;
    private int roleId;
    private int employeeId;
    private String password;
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

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AccountsContact{" +
                "id=" + id +
                ", roleId=" + roleId +
                ", employeeId=" + employeeId +
                ", password='" + password + '\'' +
                '}';
    }
}
