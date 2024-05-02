package com.apiweb.backenduao.Service;

import com.apiweb.backenduao.Exception.RecursoNoEncontradoExcep;
import com.apiweb.backenduao.Model.EmpleadoModel;
import com.apiweb.backenduao.Model.FormacionModel;
import com.apiweb.backenduao.Repository.IFormacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormacionServiceImp implements IFormacionService {
    // Fields injections
    @Autowired IFormacionRepository formacionRepository;
    @Autowired IEmpleadoService empleadoService;

    // Get all the degrees
    @Override
    public List<FormacionModel> listarFormaciones() {
        return formacionRepository.findAll();
    }

    // Get degrees by employee, if the id of the employee doesn't exist it returns an exception.
    @Override
    public List<FormacionModel> listarFormacionesPorEmpleado(int idEmpleado) {
        EmpleadoModel empleadoRecuperado = empleadoService.obtenerEmpleadoPorId(idEmpleado);
        if (empleadoRecuperado==null) {
            throw new RecursoNoEncontradoExcep("No existe ningun empleado con este id.");
        }
        return formacionRepository.findAllByEmpleado_IdEmpleado(idEmpleado);
    }

    // Method to save a degree in the db
    @Override
    public String guardarFormacion(FormacionModel formacion) {
        formacionRepository.save(formacion);
        return String.format("La formacion %s del usuario %d fue creada con exito", formacion.getNombre(), formacion.getEmpleado().getIdEmpleado());
    }
}
