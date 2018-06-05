package model;


import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@lombok.Getter
@lombok.Setter
@ToString
@Entity // This tells Hibernate to make a table out of this class
public class Contact {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String id;
    private String name;
    private String address;
    private String city;
    private String phone;
    private String email;
}
