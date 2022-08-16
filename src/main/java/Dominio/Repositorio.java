package Dominio;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
public class Repositorio {
    @PersistenceContext(name = "Exercicio-jba_PU")
    private EntityManager em;

    public void salvar(Funcionario pessoa) {
        em.persist(pessoa);
    }
}
