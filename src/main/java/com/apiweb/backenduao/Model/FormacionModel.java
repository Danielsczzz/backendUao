package com.apiweb.backenduao.Model;

import com.apiweb.backenduao.Model.Enum.Nivel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="formacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class FormacionModel {
    @Id
    private Integer idFormacion;
    private String nombre;
    @Column(name="nivel")
    @Enumerated(EnumType.STRING)
    private Nivel nivel;

    @ManyToOne
    @JoinColumn(name="idEmpleado")
    private EmpleadoModel empleado;

}
