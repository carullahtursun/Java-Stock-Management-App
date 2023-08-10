package entities;

import java.util.Date;

public class StockContact {
    private int id;
    private int customerId;
    private int productId;
    private Date date;
    private int piece;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getPiece() {
        return piece;
    }

    public void setPiece(int piece) {
        this.piece = piece;
    }

    @Override
    public String toString() {
        return "StockContact{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", productId=" + productId +
                ", date=" + date +
                ", piece=" + piece +
                '}';
    }
}
