package hibernate;

import javax.persistence.*;

@Entity
@Table(name="user")
public class Customer {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "Customer Id")
    private Integer id;

    @Column(name = "First Name")
    private String fName;

    @Column(name = "Last Name")
    private String lName;

    @Column(name = "Phone")
    private String phone;

    @Column(name = "email")
    private String email;

    @Column(name = "address1")
    private String address;

    @Column(name = "city")
    private String city;

    @Column(name = "State")
    private String state;

    @Column(name = "zipcode")
    private String zip;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id){ this.id = id; }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) { this.fName = fName; }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {this.lName = lName;}

    public String getPhone() {return phone; }

    public void setPhone(String phone) {this.phone = phone; }

    public String getEmail() {return email; }

    public void setEmail(String email) {this.email = email; }

    public String getAddress() {return address; }

    public void setAddress(String address) {this.address = address; }

    public String getCity() {return city; }

    public void setCity(String city) {this.phone = city; }

    public String getState() {return state; }

    public void setState(String state) {this.phone = state; }

    public String getZip() {return zip; }

    public void setZip(String zip) {this.zip = zip; }

    @Override
    public String toString() {
        return Integer.toString(id) + " " + fName + " " + lName + " " + address + " " + phone;
    }
}
