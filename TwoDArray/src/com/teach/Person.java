package com.teach;

/**
 * Created by gharpure on 3/10/17.
 */
public class Person {
    String firstname;
    String lastname;

    //TODO: Add Constructor
    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    //TODO: Add getters
    public String getFirstname() { return this.firstname; }
    public String getLastname() { return this.lastname; }

    public void setFirstname(String v) { this.firstname = v; }
    public void setLastname(String v) {this.lastname = v;}

    public String toString() {
        return this.firstname + " " + this.lastname;
    }
}
// Person p = new Person("Shivani", "Shimpi");
// System.out.println(p);
//