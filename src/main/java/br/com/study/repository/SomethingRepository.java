package br.com.study.repository;

import br.com.study.domain.Something;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SomethingRepository extends JpaRepository<Something, Integer> {
}
