package entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "jobSeekers")
@Entity
public class JobSeekers {
    @Id
    @GeneratedValue
    @Column(name = "userId")
    private int userId;
    @Column(name = "firstName")
    private String firstName;
    @Column(name = "lastName")
    private String lastName;
    @Column(name = "nationalityId")
    private String nationalityId;
    @Column(name = "dateOfBirth")
    private String dateOfBirth;

    public JobSeekers(){

    }

    public JobSeekers(int userId,String firstName, String lastName, String nationalityId, String dateOfBirth){
        this.userId=userId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.nationalityId=nationalityId;
        this.dateOfBirth=dateOfBirth;
  }



}
