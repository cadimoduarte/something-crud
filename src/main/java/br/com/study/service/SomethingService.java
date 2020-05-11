package br.com.study.service;


import br.com.study.domain.Something;

import java.util.List;
import java.util.Optional;

public interface SomethingService {

    List<Something> findAll();

    Optional<Something> findById(Integer id);

    Something save(Something something);

    void remove(Integer id);

}
