package com.apiweb.backenduao.Repository;

import com.apiweb.backenduao.Model.FormacionModel;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IFormacionRepository extends JpaRepository<FormacionModel, Integer> {
    public List<FormacionModel> findAllByEmpleado_IdEmpleado(int idEmpleado);
}
