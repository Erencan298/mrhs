package entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private int id;



    @Column(name = "email ")
    private String email;
    @Column(name = "passwoed")
    private String password;
    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

    @Column(name = "identification_no")
    private String identificationNo;

    @Column(name = "date_of_birth" )
    private String dateOfBirth;

    @Column(name = "role_ıd")
    private int roleId;

}
