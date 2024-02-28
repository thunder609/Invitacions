package com.example.EventoFiesta.domain.dto;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvitadoRequestEntityDto  {
   Integer id;
    String name;
    String last_name;
   Integer pass;
   Integer table_number;
}