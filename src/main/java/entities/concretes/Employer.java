package entities.concretes;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "employers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employer {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    @Column(name = "Id")
    private int id;


    @Column(name = "Company_Name")
    private String companyName;

    @Column(name = "WebSites")
    private String webSites;

    @Column(name = "Sites_Email")
    private String  sitesEmail;

    @Column(name = "PhoneNumber")
    private String phoneNumber;

    @Column(name = "user_ıd")
    private int UserId;

    @Column(name = "Role_Id")
    private int RoleId;



}
