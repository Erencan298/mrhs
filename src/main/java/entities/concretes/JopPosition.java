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


public class JopPosition {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)

    @Column(name = "Id")
    private int id;

    @Column(name = "position")
    private String position;

}
