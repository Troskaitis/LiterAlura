package br.com.literalura.repository;

import br.com.literalura.entity.Autor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long> {

    Optional<Autor> findByAutor(String autor);

    @Query(value = """
            SELECT a FROM Autor a
            WHERE :data >= a.anoNascimento
            AND :data <= a.anoFalecimento
            """)
    List<Autor> findByAutorVivoPorData(int data);
}
