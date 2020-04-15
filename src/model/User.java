package model;


import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "email")
    private String email;

    @Column(name = "name")
    private String name;

    @Column(name = "pass")
    private String pass;

    public User() {

    }

    public User(String email, String name, String pass) {
        this.email = email;
        this.name = name;
        this.pass = pass;
    }

    public User(Long id, String email, String name, String pass) {
        this.id = id;
        this.email = email;
        this.name = name;
        this.pass = pass;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String id) {
        this.name = name;
    }


}
