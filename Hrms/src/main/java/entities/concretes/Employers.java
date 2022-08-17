package entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "employers")
@Entity
public class Employers {
    @Id
    @GeneratedValue
    @Column(name = "userId")
    private int userId;
    @Column(name = "companyName")
    private String companyName;
    @Column(name = "webSite")
    private String webSite;
    @Column(name = "phoneNumber")
    private String phoneNumber;

    public Employers(){

    }

    public Employers(int userId,String companyName,String webSite,String phoneNumber){
        this.userId=userId;
        this.companyName=companyName;
        this.webSite=webSite;
        this.phoneNumber=phoneNumber;

    }


}
