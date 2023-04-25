package nl.novi.techiteasy.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("televisions")
public class TelevisionController {

    @GetMapping
    public ResponseEntity<String> getTelevisions() {
        return ResponseEntity.ok("televisions");
    }

    @GetMapping("/{id}")
    public ResponseEntity<String> getTelevision(@PathVariable int id) {
        return ResponseEntity.ok("Television");
    }

    @PostMapping
    public ResponseEntity<String> addTelevision(@RequestParam String television) {
        return ResponseEntity.created(null).body(television);
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateTelevision(@PathVariable int id, @RequestParam String television) {
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTelevision(@PathVariable int id) {
        return ResponseEntity.noContent().build();
    }
}
