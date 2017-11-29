package be.cegeka.bibliothouris.domain.users;

import javax.persistence.*;

@Entity
@Table(name = "USERS")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "NAME")
    private String name;
    @Column(name = "INSS")
    private String inss;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "STREET")
    private String street;
    @Column(name = "NUMBER")
    private String number;
    @Column(name = "POSTAL_CODE")
    private String postalCode;
    @Column(name = "CITY")
    private String city;


    private User(){
    }

    public User(String name, String inss, String city) {
        this.name = name;
        this.inss = inss;
        this.city = city;
    }

    public User withFirstName(String firstName){
        this.firstName = firstName;
        return this;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (id != user.id) return false;
        return name != null ? name.equals(user.name) : user.name == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (id ^ (id >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public String getFirstName() {
        return firstName;
    }

    public User withStreet(String street) {
        this.street = street;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public User withNumber(String number) {
        this.number = number;
        return this;
    }

    public String getNumber() {
        return number;
    }

    public User withPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    public String getPostalCode() {
        return postalCode;
    }
}
