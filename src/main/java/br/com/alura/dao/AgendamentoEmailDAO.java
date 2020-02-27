package br.com.alura.dao;

import br.com.alura.entity.AgendamentoEmail;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class AgendamentoEmailDAO {
    @PersistenceContext
    private EntityManager entityManager;

    public List<AgendamentoEmail> listarAgendamentoEmail(){
        return entityManager
                .createQuery("SELECT  a FROM   AgendamentoEmail as a", AgendamentoEmail.class).
                        getResultList();

    }

}
