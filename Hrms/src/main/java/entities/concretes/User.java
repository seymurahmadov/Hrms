package entities.concretes;

import lombok.Data;

import javax.persistence.*;

@Data //lombok
@Table(name="users") // == hansi table
@Entity    // entity class oldugu deyirlir
public class User {
    @Id // primari acar oldugun deyir
    @GeneratedValue  // id in bir bir artirmaq
    @Column(name="id")
    private int id  ;
    @Column(name="eMail")
    private String eMail;
    @Column(name="passWord")
    private String passWord;
    @Column(name="rePassword")
    private String rePassword;

    public User() {

    }

    public User(int id, String eMail, String passWord,String rePassword){
        this.id=id;
        this.eMail=eMail;
        this.passWord=passWord;
        this.rePassword=rePassword;
    }



}
