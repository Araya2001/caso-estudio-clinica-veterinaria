package tech.aarayaj.casoestudioclinicaveterinaria.backend.service;

import org.springframework.stereotype.Service;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.PetOwner;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.repository.PetOwnerRepository;

@Service
public class PetOwnerServiceImpl extends AbstractBaseEntityServiceImpl<PetOwner> implements PetOwnerService {

    protected PetOwnerServiceImpl(PetOwnerRepository jpaRepository) {
        super(jpaRepository);
    }
}
