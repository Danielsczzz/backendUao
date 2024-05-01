package com.apiweb.backenduao.Repository;

import com.apiweb.backenduao.Model.FormacionModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFormacionRepository extends JpaRepository<FormacionModel, Integer> {
}
