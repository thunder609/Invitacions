package com.example.EventoFiesta.persistence.crud;

import com.example.EventoFiesta.persistence.entity.InvitadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IInvitadoCrudRepository extends JpaRepository<InvitadoEntity, Integer> {
List<InvitadoEntity>findInvitadoEntityByPass(Integer pass);

}
