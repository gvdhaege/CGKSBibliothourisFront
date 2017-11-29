export class User {
    id: number;
    inss: string;
    lastName: string;
    firstName: string;
    street: string;
    number: string;
    postalCode: string;
    city: string;

    constructor(id: number, lastName: string, firstName:string,street : string,number:string,postalCode:string, city :string) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.city = city;
    }
}