package com.example.EventoFiesta.persistence.repository;

import com.example.EventoFiesta.domain.dto.InvitadoRequestEntityDto;
import com.example.EventoFiesta.domain.dto.InvitadoResponseEntityDto;
import com.example.EventoFiesta.domain.repository.IInvitadoRepository;
import com.example.EventoFiesta.persistence.crud.IInvitadoCrudRepository;
import com.example.EventoFiesta.persistence.mapper.IInvitadoMapper;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
@RequiredArgsConstructor
public class InvitadoRepository implements IInvitadoRepository {
    private final IInvitadoCrudRepository iInvitadoCrudRepository;
    private final IInvitadoMapper iInvitadoMapper;
    @Override
    public List<InvitadoResponseEntityDto> getAll() {
        return iInvitadoMapper.toInvitadosResponseDto(iInvitadoCrudRepository.findAll());
    }

    @Override
    public Optional<InvitadoResponseEntityDto> getInvitado(Integer id) {
        return iInvitadoCrudRepository.findById(id)
                .map(iInvitadoMapper::toInvitadoRespnseDto);
    }

    @Override
    public List<InvitadoResponseEntityDto> getEntitiesByPass_number(Integer pass_number) {
        return iInvitadoMapper.toInvitadosResponseDto(iInvitadoCrudRepository.findInvitadoEntityByPass(pass_number));
    }

    @Override
    public InvitadoRequestEntityDto save(InvitadoRequestEntityDto invitadonew) {
        return iInvitadoMapper.toInvitadoRequestDto(iInvitadoCrudRepository.
                save(iInvitadoMapper.toInvitadoEntity(invitadonew)));
    }

    /*@Override
    public Optional<InvitadoResponseEntityDto> update(InvitadoRequestEntityDto modifyInviyado) {
        return Optional.empty();
    }*/

    @Override
    public void delete(Integer id) {
    iInvitadoCrudRepository.deleteById(id);
    }
}
