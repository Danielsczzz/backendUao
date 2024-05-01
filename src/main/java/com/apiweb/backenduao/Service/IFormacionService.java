package com.apiweb.backenduao.Service;

import com.apiweb.backenduao.Model.FormacionModel;

import java.util.List;

public interface IFormacionService {
    String guardarFormacion(FormacionModel formacion);
    List<FormacionModel> listarFormaciones();
}
