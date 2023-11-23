package de.htwberlin.webtech.web.persistance;

import jakarta.persistence.*;

@Entity( name = "persons")
public class PersonEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "first name", nullable = false)
    private String firstName;
    @Column(name = "last name",nullable = false)
    private String lastName;

    private  Boolean vaccinated;

    public PersonEntity(Long id, String firstName, String lastName, Boolean vaccinated) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.vaccinated = vaccinated;
    }

    public Long getId() {
        return id;
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

    public Boolean getVaccinated() {
        return vaccinated;
    }

    public void setVaccinated(Boolean vaccinated) {
        this.vaccinated = vaccinated;
    }
}
