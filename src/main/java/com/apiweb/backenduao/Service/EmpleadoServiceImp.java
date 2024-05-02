package com.apiweb.backenduao.Service;

import com.apiweb.backenduao.Exception.RecursoNoEncontradoExcep;
import com.apiweb.backenduao.Model.EmpleadoModel;
import com.apiweb.backenduao.Model.SedeModel;
import com.apiweb.backenduao.Repository.IEmpleadoRepository;
import com.apiweb.backenduao.Repository.ISedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImp implements  IEmpleadoService {
    // Fields injections
    @Autowired IEmpleadoRepository empleadoRepository;
    @Autowired ISedeRepository sedeRepository;

    // Get all the employees in the db
    @Override
    public List<EmpleadoModel> obtenerEmpleados() {
        return empleadoRepository.findAll();
    }

    // Get employee by id
    @Override
    public EmpleadoModel obtenerEmpleadoPorId(int id) {
        Optional<EmpleadoModel> empleadoRecuperado = empleadoRepository.findById(id);
        return empleadoRecuperado.orElseThrow(()-> new RecursoNoEncontradoExcep("No existe un empleado con este id"));
    }

    // Create an employee and add to db
    @Override
    public String guardarEmpleado(EmpleadoModel empleado) {
        empleadoRepository.save(empleado);
        return "El empleado " + empleado.getNombre() + " " +empleado.getApellidos() + " ha sido guardado correctamente";
    }
}
