package com.apiweb.backenduao.Service;

import com.apiweb.backenduao.Model.EmpleadoModel;

import java.util.List;

public interface IEmpleadoService {
    String guardarEmpleado(EmpleadoModel empleado);
    List<EmpleadoModel> obtenerEmpleados();
}
