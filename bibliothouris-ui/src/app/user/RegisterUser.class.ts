export class RegisterUser {

    inss: string;
    lastName: string;
    firstName: string;
    street: string;
    number: string;
    postalCode: string;
    city: string;

    constructor(
        inss: string,
        lastName: string,
        firstName: string,
        street: string,
        number: string,
        postalCode: string,
        city: string
    
    ) {
      this.inss = inss;
      this.firstName = firstName;
      this.lastName = lastName;
      this.street = street;
      this.number = number;
      this.postalCode = postalCode;
      this.city = city;
    }
  
}