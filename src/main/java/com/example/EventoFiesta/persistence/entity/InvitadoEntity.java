package com.example.EventoFiesta.persistence.entity;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="invitado")

public class InvitadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_invitado")
    private Integer id;
    @Column(name="nombre")
    private String name;
    @Column(name="apellido")
    private String last_name;
    @Column(name="cantidad_pases")
    private Integer pass;
    @Column(name="numero_mesa")
    private Integer table_number;


}
