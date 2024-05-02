package com.apiweb.backenduao.Service;

import com.apiweb.backenduao.Model.SedeModel;

import java.util.List;

public interface ISedeService {
    String guardarSede(SedeModel sede);
    List<SedeModel> listarSedes();
}
