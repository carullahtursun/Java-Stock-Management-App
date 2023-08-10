package entities;

import java.util.Date;

public class SalesContact {

    private int id;
    private int  employeeId;
    private int customerId;
    private int productId;
    private int piece;
    private Date date;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "SalesContact{" +
                "id=" + id +
                ", employeeId=" + employeeId +
                ", customerId=" + customerId +
                ", productId=" + productId +
                ", piece=" + piece +
                ", date=" + date +
                '}';
    }
}
