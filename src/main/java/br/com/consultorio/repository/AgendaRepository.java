package br.com.consultorio.repository;

import br.com.consultorio.entity.Agenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface AgendaRepository extends JpaRepository<Agenda, Long> {

    @Modifying
    @Query("UPDATE Agenda agenda " +
            "SET agenda.excluido = :excluido " +
            "WHERE agenda.id = :agenda")
    public void updateStatus(@Param("excluido") LocalDateTime excluido, @Param("agenda") Long idAgenda);


    @Modifying
    @Query("SELECT Agenda agenda.statusAgendamento " +
            "FROM agenda " +
            "WHERE agenda.statusAgendamento = :status ")
    public void listStatus(@Param("status") String status);

    //select agendas.status from agendas where status = 'cancelado'


    @Modifying
    @Query("UPDATE Agenda agenda "+
            "SET agenda.encaixe = :encaixe" +
            "WHERE agenda.id = :agenda")
    public void updateEncaixe(@Param("encaixe") Boolean encaixe, @Param("agenda") Long idAgenda);
}
