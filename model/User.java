package model;

public class User {
    private Long id;
    private String nome;
    private String email;

    public User(Long id, String email, String nome) {
        this.id = id;
        this.email = email;
        this.nome = nome;
    }


    public User() {}

    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getEmail() {

        return email;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public String getNome() {

        return nome;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }


}
