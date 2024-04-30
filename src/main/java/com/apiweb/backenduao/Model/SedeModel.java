package com.apiweb.backenduao.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="sede")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SedeModel {
    @Id
    private int idSede;
    private String nombre;
    @ManyToOne
    @JoinColumn(name = "idLugar")
    private LugarModel lugar;
}
