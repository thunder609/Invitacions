package com.example.EventoFiesta.controller;

import com.example.EventoFiesta.domain.dto.InvitadoRequestEntityDto;
import com.example.EventoFiesta.domain.dto.InvitadoResponseEntityDto;
import com.example.EventoFiesta.domain.userCases.IInviadoUserCase;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path="/invitaciones")
@RequiredArgsConstructor
public class InvitadoController {
    private final IInviadoUserCase iInviadoUserCase;

    @GetMapping()
    public ResponseEntity<List<InvitadoResponseEntityDto>> getAll() {
        return ResponseEntity.ok(iInviadoUserCase.getAll());

    }

    @GetMapping(path = "PassNumber/{pass_number}")
    public ResponseEntity<List<InvitadoResponseEntityDto>> findInvitadoEntitiesByPass_number(@PathVariable Integer pass_number) {
        return ResponseEntity.ok(iInviadoUserCase.getInvitadoEntityByPass_number(pass_number));
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<InvitadoResponseEntityDto> getInvitado(@PathVariable Integer id) {
        return ResponseEntity.of
                (iInviadoUserCase.getInvitado(id));
    }

    @PostMapping
    public ResponseEntity<InvitadoRequestEntityDto> save(@RequestBody InvitadoRequestEntityDto invitadonew) {
        return ResponseEntity.status(HttpStatus.CREATED).
                body(iInviadoUserCase.save(invitadonew));
    }

    /* Optional<InvitadoResponseEntityDto> update(InvitadoRequestEntityDto modifyInviyado);
     */

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Boolean> delete(@PathVariable Integer id) {
      return new
              ResponseEntity<>(this.iInviadoUserCase.delete(id) ?
              HttpStatus.OK: HttpStatus.NOT_FOUND);

    }
}



