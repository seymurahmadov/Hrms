package entities.concretes;


import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "jobPositions")
@Entity
public class JobPositions {
    @Id
    @GeneratedValue
    @Column(name ="id" )
    private int id;
    @Column(name ="position" )
    private String position;

    public JobPositions(){

    }

    public JobPositions(int id, String position){
        this.id=id;
        this.position=position;

    }

}
