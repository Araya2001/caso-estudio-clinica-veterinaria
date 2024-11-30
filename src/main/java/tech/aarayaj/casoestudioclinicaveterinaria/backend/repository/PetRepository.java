package tech.aarayaj.casoestudioclinicaveterinaria.backend.repository;

import org.springframework.stereotype.Repository;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.Pet;

@Repository
public interface PetRepository extends BaseEntityRepository<Pet> {
}