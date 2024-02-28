package com.example.EventoFiesta.persistence.mapper;

import com.example.EventoFiesta.domain.dto.InvitadoRequestEntityDto;
import com.example.EventoFiesta.domain.dto.InvitadoResponseEntityDto;
import com.example.EventoFiesta.persistence.entity.InvitadoEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface IInvitadoMapper {
    InvitadoRequestEntityDto toInvitadoRequestDto(InvitadoEntity invitadoEntity);
    InvitadoResponseEntityDto toInvitadoRespnseDto(InvitadoEntity invitadoEntity);

    InvitadoEntity toInvitadoEntity(InvitadoResponseEntityDto invitadoResponseEntityDto);
    InvitadoEntity toInvitadoEntity(InvitadoRequestEntityDto invitadoRequestEntityDto);



    List<InvitadoResponseEntityDto> toInvitadosResponseDto(List<InvitadoEntity> invitadoEntityList);




}
