package com.apiweb.backenduao.Model;

import com.apiweb.backenduao.Model.Enum.Genero;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="empleado")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class EmpleadoModel {
    @Id
    private Integer idEmpleado;
    private String nombre;
    private String apellidos;

    @Column(name = "genero")
    @Enumerated(EnumType.STRING)
    private Genero genero;
    private Integer edad;

    @ManyToOne
    @JoinColumn(name = "idLugar")
    private LugarModel lugar;

    @ManyToOne
    @JoinColumn(name = "idSede")
    private SedeModel sede;
}
