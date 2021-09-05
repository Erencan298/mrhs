package entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "job_seekers")
@Data
@AllArgsConstructor
@NoArgsConstructor


public class JobSeeker {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id")
    private int id;

    @Column(name = "user_ıd")
    private int userId;

    @Column(name = "role_Id")
    private int roleId;

}
