package cibertec.edu.pe.T2_sw_vasconcelos_javier.controller;



import cibertec.edu.pe.T2_sw_vasconcelos_javier.Service.PersonajeService;
import cibertec.edu.pe.T2_sw_vasconcelos_javier.model.Personaje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/personaje")
public class PersonajeController {

    @Autowired
    private PersonajeService personajeService;

    @GetMapping
    public List<Personaje> getAllPersonajes() {
        return personajeService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Personaje> getPersonajeById(@PathVariable Integer id) {
        return personajeService.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public Personaje createPersonaje(@RequestBody Personaje personaje) {
        return personajeService.save(personaje);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Personaje> updatePersonaje(@PathVariable Integer id, @RequestBody Personaje personaje) {
        Personaje updatedPersonaje = personajeService.update(personaje, id);
        if (updatedPersonaje != null) {
            return ResponseEntity.ok(updatedPersonaje);
            return ResponseEntity.ok(updatedPersonaje);
        }
        return ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePersonaje(@PathVariable Integer id) {
        personajeService.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
