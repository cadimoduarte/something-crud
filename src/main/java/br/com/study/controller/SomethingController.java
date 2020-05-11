package br.com.study.controller;


import br.com.study.domain.Something;
import br.com.study.representation.SomethingRepresentation;


import br.com.study.service.SomethingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/something")
public class SomethingController {

    private SomethingService somethingService;

    @Autowired
    public SomethingController(SomethingService somethingService) {
        this.somethingService = somethingService;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<SomethingRepresentation> findAll() {

        List<Something> somethings = somethingService.findAll();
        return somethings
                .stream()
                .map(SomethingRepresentation::of)
                .collect(Collectors.toList());
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public SomethingRepresentation findById( @PathVariable("id") Integer id ){
        Optional<Something> something = somethingService.findById(id);
        return something.map(SomethingRepresentation::of).get();
    }

    @PostMapping
    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @ResponseStatus(code = HttpStatus.CREATED)
    public SomethingRepresentation save(@RequestBody Something something){
        return SomethingRepresentation.of(somethingService.save(something));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public void remove( @PathVariable("id") Integer id ){
        somethingService.remove(id);
    }

}
