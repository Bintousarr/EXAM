package sn.isi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.isi.entities.Declaration;

@Repository
public interface DeclarationRepository extends JpaRepository<Declaration, Long> {

}
