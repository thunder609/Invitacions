package com.example.EventoFiesta.domain.userCases;

import com.example.EventoFiesta.domain.dto.InvitadoRequestEntityDto;
import com.example.EventoFiesta.domain.dto.InvitadoResponseEntityDto;

import java.util.List;
import java.util.Optional;

public interface IInviadoUserCase {

   List<InvitadoResponseEntityDto> getAll();





 List<InvitadoResponseEntityDto> getInvitadoEntityByPass_number(Integer pass_number);

   Optional<InvitadoResponseEntityDto> getInvitado(Integer id);
    InvitadoRequestEntityDto save(InvitadoRequestEntityDto invitadoRequestEntityDto);

   /* Optional<InvitadoResponseEntityDto> update(InvitadoRequestEntityDto modifyInviyado);
*/

  boolean delete(Integer  id);
}

