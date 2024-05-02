package com.apiweb.backenduao.Model;

import com.apiweb.backenduao.Model.Enum.Estado;
import com.apiweb.backenduao.Model.PK.VinculacionPK;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name="empleado")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class VinculacionModel {
    @EmbeddedId
    @AttributeOverrides({
            @AttributeOverride(name="empleadoId", column=@Column(name="idEmpleado")),
            @AttributeOverride(name="sedeId", column=@Column(name="idSede")),
            @AttributeOverride(name="fechaInicio", column=@Column(name="fechaInicio")),
    })
    private VinculacionPK idVinculacion;
    private Date fechaFin;
    private Estado estado;
}
