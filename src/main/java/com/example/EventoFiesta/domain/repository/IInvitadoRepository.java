package com.example.EventoFiesta.domain.repository;

import com.example.EventoFiesta.domain.dto.InvitadoRequestEntityDto;
import com.example.EventoFiesta.domain.dto.InvitadoResponseEntityDto;

import java.util.List;
import java.util.Optional;

public interface IInvitadoRepository {
    List<InvitadoResponseEntityDto> getAll();


    Optional<InvitadoResponseEntityDto> getInvitado(Integer id);


List<InvitadoResponseEntityDto> getEntitiesByPass_number(Integer pass_number);


    InvitadoRequestEntityDto save(InvitadoRequestEntityDto invitadoRequestEntityDto);

   /* Optional<InvitadoResponseEntityDto> update(InvitadoRequestEntityDto modifyInviyado);*/


 void delete(Integer  id);
}
