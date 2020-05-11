package br.com.study.service.impl;

import br.com.study.domain.Something;
import br.com.study.repository.SomethingRepository;
import br.com.study.service.SomethingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class SomethingServiceImpl implements SomethingService {

    private SomethingRepository somethingRepository;

    @Autowired
    public SomethingServiceImpl(SomethingRepository somethingRepository) {
        this.somethingRepository = somethingRepository;
    }

    @Override
    public List<Something> findAll() {
        return somethingRepository.findAll();
    }

    @Override
    public Optional<Something> findById(Integer id){
        return somethingRepository.findById(id);
    }

    @Override
    public Something save(Something something){
        return somethingRepository.save(something);
    }

    @Override
    public void remove(Integer id) {
        somethingRepository.deleteById( id );
    }
}
