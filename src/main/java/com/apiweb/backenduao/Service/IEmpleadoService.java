package com.apiweb.backenduao.Service;

import com.apiweb.backenduao.Model.EmpleadoModel;

import java.util.List;
import java.util.Optional;

public interface IEmpleadoService {
    List<EmpleadoModel> obtenerEmpleados();
    EmpleadoModel obtenerEmpleadoPorId(int id);
    String guardarEmpleado(EmpleadoModel empleado);
}
