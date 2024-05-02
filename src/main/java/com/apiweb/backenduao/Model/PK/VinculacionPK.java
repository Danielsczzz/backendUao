package com.apiweb.backenduao.Model.PK;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class VinculacionPK implements Serializable {
    private Integer empleadoId;
    private Integer sedeId;
    private Date fechaInicio;
}
