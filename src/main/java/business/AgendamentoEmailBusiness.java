package business;

import br.com.alura.dao.AgendamentoEmailDAO;
import br.com.alura.entity.AgendamentoEmail;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class AgendamentoEmailBusiness {

    @Inject
    private AgendamentoEmailDAO agendamentoEmailDAO;
    public List<AgendamentoEmail> listarAgendamentosEmail(){

        List<String> emails = new ArrayList<>();
        emails.add("teste@testes");
        emails.add("teste@testes2");
        return agendamentoEmailDAO.listarAgendamentoEmail();


    }
}
