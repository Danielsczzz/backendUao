package com.apiweb.backenduao.Service;

import com.apiweb.backenduao.Model.EmpleadoModel;
import com.apiweb.backenduao.Repository.IEmpleadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpleadoServiceImp implements  IEmpleadoService{
    @Autowired
    IEmpleadoRepository empleadoRepository;
    @Override
    public String guardarEmpleado(EmpleadoModel empleado) {
        empleadoRepository.save(empleado);
        return "El empleado " + empleado.getNombre() + " " +empleado.getApellidos() + " ha sido guardado correctamente";
    }

    @Override
    public List<EmpleadoModel> obtenerEmpleados() {
        return empleadoRepository.findAll();
    }
}
