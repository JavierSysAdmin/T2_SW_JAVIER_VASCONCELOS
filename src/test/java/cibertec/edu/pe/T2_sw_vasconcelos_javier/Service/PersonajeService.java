package cibertec.edu.pe.T2_sw_vasconcelos_javier.Service;





import cibertec.edu.pe.T2_sw_vasconcelos_javier.model.Personaje;

import java.util.List;
import java.util.Optional;

public interface PersonajeService {
    List<Personaje> findAll();
    Optional<Personaje> findById(Integer id);
    Personaje save(Personaje personaje);
    Personaje update(Personaje personaje, Integer id);
    void deleteById(Integer id);
}
