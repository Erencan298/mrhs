package entities.concretes;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "role_name")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    @Column(name = "Id")
    private int id;


    @Column(name = "role_name")
    private String   roleName;
}
