package cibertec.edu.pe.T2_sw_vasconcelos_javier.Service;


import cibertec.edu.pe.T2_sw_vasconcelos_javier.model.ProgramaTV;

import java.util.List;
import java.util.Optional;

public interface ProgramaTVService {
    List<ProgramaTV> findAll();
    Optional<ProgramaTV> findById(Integer id);
    ProgramaTV save(ProgramaTV programaTv);
    ProgramaTV update(ProgramaTV programaTv, Integer id);
    void deleteById(Integer id);
}
