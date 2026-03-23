package com.queiroz.Gerenciamento_Departamentos.repository;

import com.queiroz.Gerenciamento_Departamentos.models.DepartamentoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartamentoRepository extends JpaRepository<DepartamentoModel, Long> {
}
