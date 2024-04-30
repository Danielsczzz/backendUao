package com.apiweb.backenduao.Service;

import com.apiweb.backenduao.Model.EmpleadoModel;
import com.apiweb.backenduao.Model.SedeModel;
import com.apiweb.backenduao.Repository.IEmpleadoRepository;
import com.apiweb.backenduao.Repository.ISedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.FluentQuery;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpleadoServiceImp implements  IEmpleadoService {
    @Autowired
    IEmpleadoRepository empleadoRepository;
    @Autowired
    ISedeRepository sedeRepository;
    @Override
    public String guardarEmpleado(EmpleadoModel empleado) {
        empleadoRepository.save(empleado);
        return "El empleado " + empleado.getNombre() + " " +empleado.getApellidos() + " ha sido guardado correctamente";
    }

    @Override
    public List<EmpleadoModel> obtenerEmpleados() {
        return empleadoRepository.findAll();
    }

    @Override
    public List<EmpleadoModel> obtenerEmpleadosSede(int idSede) {
        Optional<SedeModel> sede = sedeRepository.findById(idSede);
        return empleadoRepository.findBySede(sede);
    }

}
