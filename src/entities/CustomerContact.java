package entities;

public class CustomerContact {
    private int id ;
    private String nameSurname;
    private int phone;
    private String address;
    private int cityId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCityId() {
        return cityId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    @Override
    public String toString() {
        return "CustomerContact{" +
                "id=" + id +
                ", nameSurname='" + nameSurname + '\'' +
                ", phone=" + phone +
                ", address='" + address + '\'' +
                ", cityId=" + cityId +
                '}';
    }
}
