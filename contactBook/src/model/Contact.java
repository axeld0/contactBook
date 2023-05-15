package model;

import java.util.Objects;

/** es la culpa de quien consume el codigo?
el retorno es como un susurro
la mayoria de las veces, por no decir siempre, vamos a tratar de elevar la excepcion
eso es desesperada y eternamente**/


/** PREGUNTA DE PARCIAL
 * POR QUE DEFINIMOS NUEVOS TIPOS DE EXCEPCIONES?
 *
 * PARA AMPLIAR EL TIPO DE EXCEPCIONES PROVISTAS POR JAVA Y AGREGARLE COMPORTAMIENTO.
 */

public class Contact {
    private String name;
    private String surname;
    private String address;
    private String email;
    private String phoneNumber;


    public Contact(String name, String surname, String address, String email, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Contact ()
    {
        name = "";
        surname = "";
        address = "";
        email = "";
        phoneNumber = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return name.equals(contact.name) && surname.equals(contact.surname) && address.equals(contact.address) && email.equals(contact.email) && phoneNumber.equals(contact.phoneNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, address, email, phoneNumber);
    }
}
