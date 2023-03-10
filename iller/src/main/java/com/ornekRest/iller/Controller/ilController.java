package com.ornekRest.iller.Controller;

import com.ornekRest.iller.Service.ilService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.ornekRest.iller.Model.il;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/ils")
@AllArgsConstructor
public class ilController {

    private final ilService ilServices;

    @GetMapping("/iller")
    public ResponseEntity<List<il>> getIller() {

        return new ResponseEntity<>(ilServices.getiller(), HttpStatus.OK);

    }

    @GetMapping("/{id}")
    public ResponseEntity<il> getIl(@PathVariable String id) {
        return new ResponseEntity<>(ilServices.getById(id), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void>delete(@PathVariable String id)
    {
        ilServices.deleteIl(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Void>update(@PathVariable String id,@RequestBody il yeni)
    {
        ilServices.update(id,yeni);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    private il getIlById(String id)
    {
        return ilServices.getById(id);
       // return iller.stream().filter((n)->n.getId().equals(id)).findFirst().orElseThrow(()->new RuntimeException("il not found"));
    }

   @PostMapping
    public ResponseEntity<il>create(@RequestBody il yeni)
   {
       return new ResponseEntity<>(ilServices.createIl(yeni),HttpStatus.CREATED);

    }
    @GetMapping
    public ResponseEntity<il>getByName(@RequestParam (required = false)String name)
    {

        return new ResponseEntity<>(ilServices.search(name),HttpStatus.OK);

    }

    @ExceptionHandler(Exceptions.class)
    public ResponseEntity<String> handleEx(Exceptions ex)
    {
        return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);

    }

    }


