package com.apiweb.backenduao.Service;

import com.apiweb.backenduao.Model.SedeModel;
import com.apiweb.backenduao.Repository.ISedeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SedeServiceImp implements ISedeService{
    @Autowired ISedeRepository sedeRepository;

    @Override
    public String guardarSede(SedeModel sede) {
        sedeRepository.save(sede);
        return String.format("La sede %s ha sido creada con exito", sede.getNombre());
    }

    @Override
    public List<SedeModel> listarSedes() {
        return sedeRepository.findAll();
    }
}
