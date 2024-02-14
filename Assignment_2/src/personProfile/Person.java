/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personProfile;

/**
 *
 * @author nasik
 */
public class Person {

    private String firstName;
    private String lastName;
    private String ssn;
    private String license_number;
    private String gender;
    private int age;
    private Address homeadr;
    private Address workadr;

    public Person() {
        this.homeadr = new Address();
        this.workadr = new Address();
    }

    public Address getHomeadr() {
        return homeadr;
    }

    public void setHomeadr(Address homeadr) {
        this.homeadr = homeadr;
    }

    public Address getWorkadr() {
        return workadr;
    }

    public void setWorkadr(Address workadr) {
        this.workadr = workadr;
    }
    
    

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getLicense_number() {
        return license_number;
    }

    public void setLicense_number(String license_number) {
        this.license_number = license_number;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
    public String toString(){
        return firstName;
    }
    
    
}
