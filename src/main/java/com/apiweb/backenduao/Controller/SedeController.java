package com.apiweb.backenduao.Controller;

import com.apiweb.backenduao.Model.SedeModel;
import com.apiweb.backenduao.Service.ISedeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/apiweb/v1/sedes")
public class SedeController {
    @Autowired ISedeService sedeService;

    @GetMapping("/")
    public ResponseEntity<List<SedeModel>> listarSedes() {
        return new ResponseEntity<>(sedeService.listarSedes(), HttpStatus.OK);
    }

    @PostMapping("/insertar")
    public ResponseEntity<String> crearSede(@RequestBody SedeModel sede) {
        return new ResponseEntity<>(sedeService.guardarSede(sede), HttpStatus.OK);
    }
}
