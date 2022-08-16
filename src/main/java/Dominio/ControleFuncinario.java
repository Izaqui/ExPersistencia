package Dominio;

public class ControleFuncinario {

    private Funcionario funcionario;

    private  Repositorio repositorio;

    @PostConstruct
    public void init() {
        funcionario = new Funcionario() {
            @Override
            public String getNome() {
                return super.getNome();
            }
        };
        repositorio = new Repositorio();
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public String savar() {

        repositorio.salvar(funcionario);
        this.funcionario = new Funcionario() {
            @Override
            public String getNome() {
                return super.getNome();
            }
        };
        return null;

    }

}
