package resource;

import java.util.List;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.Produto;
import service.ProdutoService;

@Path("produtos")
public class ProdutoResource {

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    public Response postProduto(Produto produto) {
        ProdutoService service = new ProdutoService();
        boolean retorno = service.incluirProduto(produto);
        Response response;

        if (retorno) {
            response = Response.status(Response.Status.CREATED).entity(produto).build();
        } else {
            response = Response.status(Response.Status.NOT_FOUND)
                    .entity("Não foi possível realizar a inclusão").build();
        }

        return response;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getProdutos() {
        ProdutoService service = new ProdutoService();
        List<Produto> lista = service.listar();
        Response response = Response.ok().entity(lista).build();
        return response;
    }
}