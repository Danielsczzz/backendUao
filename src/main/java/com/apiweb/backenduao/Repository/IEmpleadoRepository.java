package com.apiweb.backenduao.Repository;

import com.apiweb.backenduao.Model.EmpleadoModel;
import com.apiweb.backenduao.Model.SedeModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IEmpleadoRepository  extends JpaRepository<EmpleadoModel, Integer> {
}
