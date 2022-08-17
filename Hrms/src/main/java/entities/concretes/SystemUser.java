package entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name="systemUser")
@Entity
public class SystemUser {
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

    public SystemUser(){

    }

    public SystemUser(int userId, String firstName, String lastName, String nationalityId){
        this.userId=userId;
        this.firstName=firstName;
        this.lastName=lastName;
        this.nationalityId=nationalityId;
    }


}
