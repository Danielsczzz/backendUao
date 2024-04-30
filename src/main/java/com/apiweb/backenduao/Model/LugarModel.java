package com.apiweb.backenduao.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;
import java.util.HashSet;

@Entity
@Table(name="lugar")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LugarModel {
    @Id
    private Integer idLugar;
    private String nombre;
    @OneToMany(mappedBy = "lugar")
    private Set<SedeModel> sedes = new HashSet<>();

    @OneToMany(mappedBy = "lugar")
    private Set<LugarModel> lugares = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "sublugar")
    private LugarModel lugar;

}
