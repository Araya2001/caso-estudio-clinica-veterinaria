package tech.aarayaj.casoestudioclinicaveterinaria.backend.service;

import org.springframework.stereotype.Service;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.model.Veterinary;
import tech.aarayaj.casoestudioclinicaveterinaria.backend.repository.VeterinaryRepository;

@Service
public class VeterinaryServiceImpl extends AbstractBaseEntityServiceImpl<Veterinary> implements VeterinaryService {

    protected VeterinaryServiceImpl(VeterinaryRepository jpaRepository) {
        super(jpaRepository);
    }
}
