package com.example.EventoFiesta.domain.service;

import com.example.EventoFiesta.domain.dto.InvitadoRequestEntityDto;
import com.example.EventoFiesta.domain.dto.InvitadoResponseEntityDto;


import com.example.EventoFiesta.domain.repository.IInvitadoRepository;
import com.example.EventoFiesta.domain.userCases.IInviadoUserCase;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service

@RequiredArgsConstructor
public class InvitadoSevice implements IInviadoUserCase {
    private final IInvitadoRepository iInvitadoRepository;

    @Override
    public List<InvitadoResponseEntityDto> getAll() {
        return iInvitadoRepository.getAll();
    }

    @Override
    public List<InvitadoResponseEntityDto> getInvitadoEntityByPass_number(Integer pass_number) {
        return iInvitadoRepository.getEntitiesByPass_number(pass_number);
    }

    @Override
    public Optional<InvitadoResponseEntityDto> getInvitado(Integer id) {
        return iInvitadoRepository.getInvitado(id);
    }

    @Override
    public InvitadoRequestEntityDto save(InvitadoRequestEntityDto invitadoRequestEntityDto) {
        return iInvitadoRepository.save(invitadoRequestEntityDto);
    }

   /* @Override
    public Optional<InvitadoResponseEntityDto> update(InvitadoRequestEntityDto modifyInviyado) {
        return Optional.empty();
    }*/

    @Override
    public boolean delete(Integer id) {
        if (iInvitadoRepository.getInvitado(id).isEmpty()) {
            return false;
        }
        iInvitadoRepository.delete(id);
        return true;
    }
}
