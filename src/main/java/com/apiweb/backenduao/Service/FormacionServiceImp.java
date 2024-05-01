package com.apiweb.backenduao.Service;

import com.apiweb.backenduao.Model.FormacionModel;
import com.apiweb.backenduao.Repository.IFormacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormacionServiceImp implements IFormacionService {
    @Autowired
    IFormacionRepository formacionRepository;

    @Override
    public String guardarFormacion(FormacionModel formacion) {
        formacionRepository.save(formacion);
        return String.format("La formacion %s del usuario %d fue creada con exito", formacion.getNombre(), formacion.getEmpleado().getIdEmpleado());
    }

    @Override
    public List<FormacionModel> listarFormaciones() {
        return formacionRepository.findAll();
    }
}
