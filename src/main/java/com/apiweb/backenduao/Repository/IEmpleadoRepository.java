package com.apiweb.backenduao.Repository;

import com.apiweb.backenduao.Model.EmpleadoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IEmpleadoRepository  extends JpaRepository<EmpleadoModel, Integer> {

}
