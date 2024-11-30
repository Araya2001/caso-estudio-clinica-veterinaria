package tech.aarayaj.casoestudioclinicaveterinaria.backend.service;

import org.springframework.stereotype.Service;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.Pet;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.repository.PetRepository;

@Service
public class PetServiceImpl extends AbstractBaseEntityServiceImpl<Pet> implements PetService {

    protected PetServiceImpl(PetRepository jpaRepository) {
        super(jpaRepository);
    }
}
