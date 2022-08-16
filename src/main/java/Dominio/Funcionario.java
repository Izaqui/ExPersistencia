package Dominio;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = " ", length = 1, discriminatorType = DiscriminatorType.STRING)
public abstract class Funcionario {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;
    private String sobreNome;
    private String cpf;
    private Endereco endereco;
    private Depedente depedente;
    private Object InheritanceType;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Depedente getDepedente() {
        return depedente;
    }

    public void setDepedente(Depedente depedente) {
        this.depedente = depedente;
    }
}
