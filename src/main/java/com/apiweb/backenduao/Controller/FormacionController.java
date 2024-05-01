package com.apiweb.backenduao.Controller;

import com.apiweb.backenduao.Exception.RecursoNoEncontradoExcep;
import com.apiweb.backenduao.Model.EmpleadoModel;
import com.apiweb.backenduao.Model.FormacionModel;
import com.apiweb.backenduao.Service.IEmpleadoService;
import com.apiweb.backenduao.Service.IFormacionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiweb/v1/formacion")
public class FormacionController {
    @Autowired
    IFormacionService formacionService;
    @Autowired
    IEmpleadoService empleadoService;

    @PostMapping("/insertar")
    public ResponseEntity<String> crearFormacion(@RequestBody FormacionModel formacion) {
        try {
            int idEmpleado = formacion.getEmpleado().getIdEmpleado();
            EmpleadoModel empleadoRecuperado = empleadoService.obtenerEmpleadoPorId(idEmpleado);
            if(empleadoRecuperado == null) {
                throw new RecursoNoEncontradoExcep("No se encontro el empleado");
            }
            return new ResponseEntity<String>(formacionService.guardarFormacion(formacion), HttpStatus.OK);
        } catch (RecursoNoEncontradoExcep e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }
    }

    @GetMapping("/")
    public ResponseEntity<List<FormacionModel>> listarFormacion() {
        return new ResponseEntity<List<FormacionModel>>(formacionService.listarFormaciones(), HttpStatus.OK);
    }
}
