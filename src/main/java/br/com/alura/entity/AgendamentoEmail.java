package br.com.alura.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

@Entity

public class AgendamentoEmail {


    @Id
    @GeneratedValue
    private Long id;
    @Column
    private String email;
    @Column
    private Boolean enviado;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AgendamentoEmail)) return false;
        AgendamentoEmail that = (AgendamentoEmail) o;
        return getId().equals(that.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }

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

    public Boolean getEnviado() {
        return enviado;
    }

    public void setEnviado(Boolean enviado) {
        this.enviado = enviado;
    }



}
