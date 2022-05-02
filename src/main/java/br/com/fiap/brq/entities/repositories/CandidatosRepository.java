package br.com.fiap.brq.entities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import br.com.fiap.brq.entities.Candidatos;

public interface CandidatosRepository extends JpaRepository<Candidatos, Long>, JpaSpecificationExecutor<Candidatos> {

}
