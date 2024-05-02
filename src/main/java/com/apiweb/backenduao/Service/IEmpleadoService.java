package com.apiweb.backenduao.Service;

import com.apiweb.backenduao.Model.EmpleadoModel;

import java.util.List;
import java.util.Optional;

public interface IEmpleadoService {
    String guardarEmpleado(EmpleadoModel empleado);
    List<EmpleadoModel> obtenerEmpleados();
    EmpleadoModel obtenerEmpleadoPorId(int id);
    List<EmpleadoModel> obtenerEmpleadosSede(int idSede);
}
