package be.cegeka.bibliothouris.domain.users;

public class UserDto {
    private String inss;
    private String lastName;
    private String firstName;
    private String street;
    private String number;
    private String postalCode;
    private String city;

    private UserDto() {
    }

    public UserDto(String inss, String lastName, String firstName, String street, String number, String postalCode, String city) {
        this.inss = inss;
        this.lastName = lastName;
        this.firstName = firstName;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
    }

    public String getInss() {
        return inss;
    }

    public String getLastName() {
        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getStreet() {
        return street;
    }

    public String getNumber() {
        return number;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }
}
