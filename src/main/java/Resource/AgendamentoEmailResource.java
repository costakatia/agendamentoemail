package Resource;

import br.com.alura.entity.AgendamentoEmail;
import business.AgendamentoEmailBusiness;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/agendamentoemail")

public class AgendamentoEmailResource {

    @Inject
    private AgendamentoEmailBusiness agendamentoEmailBusiness;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response listarAgendamentoEmail(){
        List<AgendamentoEmail> emails = agendamentoEmailBusiness.listarAgendamentosEmail();

        return Response.ok(emails).build();

    }
}
