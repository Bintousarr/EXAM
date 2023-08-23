package sn.isi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sn.isi.entities.Paiement;

@Repository
public interface PaiementRepository extends JpaRepository<Paiement, Long> {
}
