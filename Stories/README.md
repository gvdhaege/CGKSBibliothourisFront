# Stories
## Story 1:
As a registered user I can request a service to show all books registered in the system. These books should contain an ISBN, title and the author's last and first name 
## Story 2:
As a registered user I can request the details of a single book.
## Story 3:
As a registered user I can search for a book by entering a part of the isbn. I should be able to enter wildcards if I don't know the complete ISBN.
<details><summary>Hint:</summary>
Use regex for the wildcard part.
</details>

## Story 4:
As a registered user I can search for a book by entering a part of the title. I should be able to enter wildcards if I don't know the complete title.
## Story 5:
As a registered user I can search for a book by entering a part of the Author. I should be able to enter wildcards if I don't know the complete name of the Author. Also I don't have to know the authors first or last name.
## Story 6:
As a librarian I can register a new book
## Story 7:
As an unregistered user I want to be able to register myself as a new library member. This member should have a unique INSS, last name, first name, street, number, postal code and city.
The INSS should be filled in and unique.
The last name and city should be filled in.
Don't validate the postal code and the city.
## Story 8:
As an admin user I want to be able to view all registered members within the system.
## Story 9:
As a member I can lend a book. You should be able to put in a member identification number, ISBN number of the book and a due date(by default today + 3 weeks)
ISBN and INSS should exist and filled in.
## Story 10:
As a member I can return a book. When the book is late, show a corresponding message.
## Story 11:
As a registered user I can see all the books borrowed by a member.
## Story 12:
As a librarian I can search for all the books that are overdue.
## Story 13:
Show in the details page of the book if it's lend, and by whom.
## Story 14:
As a librarian I can register a new book. The ISBN, title and author's last name are required.
## Story 15:
As a librarian I want the ISBN to be validated.
## Story 16:
As a member I will get a fine when I return a book too late. (details see powerpoint)

## Story 17:
As an admin I want to make sure that non registered users can't access the application.
You should also update the member information with passwords and user role.
Update the REST requests
<details><summary>Hint:</summary>
Read the [Third step: Securing the REST service with Spring Security:](https://jaxenter.com/rest-api-spring-java-8-112289.html)
</details>

## Story 18:
As a librarian I want to have the same book multiple times. This ensures that we can lend the book at the same time to multiple members.
Also check before lending a book that this book is available.
Make sure that the correct person gets the fines.

## Story 19:
As a librarian I want to mark a book damaged, this will give the previous loaner a fine:
``` (initial price) * (1 - ((age of the book in years) * 0.2) ``` with a minimum of 5 euro.

## Story 20:
As an accountant I want to send an invoice to the registered members.
1. Create a new spring boot application with a different port (preferable another git repo)
2. Make sure you can ask the other application for all of his users, and his fines.
3. Every user should pay a subscription fee of 5 euro.
4. Using a fake SMTP server send emails to the users. <http://papercut.codeplex.com/>

## Story 21:
As a librarian I wan to have a report on the lending history of a book.
This should contain the periods it has been loaned and by whom.
Also try to sugest some data that could be usefull for the librarian within the report.

## Story 22:
As an accountant I want to have a generated excel document about the revenue of a complete year. 
