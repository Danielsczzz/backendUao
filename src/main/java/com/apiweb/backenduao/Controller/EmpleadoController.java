package com.apiweb.backenduao.Controller;

import com.apiweb.backenduao.Exception.RecursoNoEncontradoExcep;
import com.apiweb.backenduao.Model.EmpleadoModel;
import com.apiweb.backenduao.Service.IEmpleadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiweb/v1/empleados")
public class EmpleadoController {
    @Autowired
    IEmpleadoService empleadoService;
    @PostMapping("/insertar")
    public ResponseEntity<String> crearEmpleado(@RequestBody EmpleadoModel empleado){
        return new ResponseEntity<>(empleadoService.guardarEmpleado(empleado), HttpStatus.OK);
    }

    @GetMapping("/")
    public ResponseEntity<List<EmpleadoModel>> mostrarEmpleados() {
        return new ResponseEntity<>(empleadoService.obtenerEmpleados(), HttpStatus.OK);
    }

    @GetMapping("/sede/{id}")
    public ResponseEntity<?> mostrarEmpleadosSede(@PathVariable int id) {
        try {
            List<EmpleadoModel> empleados = empleadoService.obtenerEmpleadosSede(id);
            return ResponseEntity.ok(empleados);
        } catch (RecursoNoEncontradoExcep e) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
        }

    }

}
