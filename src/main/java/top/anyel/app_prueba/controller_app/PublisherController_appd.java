package top.anyel.app_prueba.controller_app;


import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import top.anyel.app_prueba.model_app.exercise1.Publisher_appd;
import top.anyel.app_prueba.service_app.PublisherService_appd;

import java.net.URI;

@RestController
@RequestMapping("/publisher/v1")
public class PublisherController_appd {
    private final PublisherService_appd publisherServiceAppd;

    public PublisherController_appd(PublisherService_appd publisherServiceAppd) {
        this.publisherServiceAppd = publisherServiceAppd;
    }

    @GetMapping("/")
    public ResponseEntity<Void> index() {
        try {
            return ResponseEntity.status(HttpStatus.FOUND).location(URI.create("/swagger-ui.html")).build();
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @PostMapping("/save_appd")
    public ResponseEntity<?> save(@Valid @RequestBody Publisher_appd publisherAppd) {
        try {
            return ResponseEntity.ok(publisherAppd);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }


    }
    @PutMapping("/updatePublisherById/")
    public ResponseEntity<?> updateById(@RequestParam int id,
                                        @RequestBody Publisher_appd publisherAppd) {
        try {
            Publisher_appd updatedUser = publisherServiceAppd.updatePublisherById_appd(id, publisherAppd);
            if (updatedUser == null) {
                String mensaje = "No se encontraron datos para el ID proporcionado.";
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body(mensaje);
            }
            return ResponseEntity.ok(updatedUser);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error inesperado.");
        }
    }

    @DeleteMapping("/deleteBookById/{id}")
    public ResponseEntity<?> deleteBookById(@PathVariable int id) {
        try {
            String mensaje = publisherServiceAppd.deleteBookById_appd(id);
            if (mensaje == null) {
                return ResponseEntity.status(HttpStatus.NOT_FOUND).body("No se encontraron datos para el ID proporcionado.");
            }
            return ResponseEntity.ok(mensaje);
        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Ocurrió un error inesperado.");
        }
    }

}
