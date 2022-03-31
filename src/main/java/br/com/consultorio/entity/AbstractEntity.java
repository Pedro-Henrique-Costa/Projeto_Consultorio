package br.com.consultorio.entity;
//Abstrata
import javax.persistence.Id;
import java.time.LocalDateTime;

public abstract class AbstractEntity {

    @Id
    private Long id;
    private LocalDateTime cadastro;
    private LocalDateTime atualizado;
    private LocalDateTime excluido;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public LocalDateTime getCadastro() {
        return cadastro;
    }

    public void setCadastro(LocalDateTime cadastro) {
        this.cadastro = cadastro;
    }

    public LocalDateTime getAtualizado() {
        return atualizado;
    }

    public void setAtualizado(LocalDateTime atualizado) {
        this.atualizado = atualizado;
    }

    public LocalDateTime getExcluido() {
        return excluido;
    }

    public void setExcluido(LocalDateTime excluido) {
        this.excluido = excluido;
    }
}
