package com.imoveis.flimoveis.serviceimpl;
import com.imoveis.flimoveis.model.Localidade;
import com.imoveis.flimoveis.repository.LocalidadeRepository;
import com.imoveis.flimoveis.service.LocalidadeSevice;
import org.springframework.stereotype.Service;
import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
public class LocalidadeServiceImpl implements LocalidadeSevice {

    private final LocalidadeRepository localidadeRepository;

    public LocalidadeServiceImpl(LocalidadeRepository localidadeRepository) {
        this.localidadeRepository = localidadeRepository;
    }

    @Override
    public List<Localidade> findAll() {
        return localidadeRepository.findAll();
    }

    @Override
    public Localidade findById(Long id) {
        String message = String.format("Resource id %s not found", id);
        return this.localidadeRepository
                .findById(id)
                .orElseThrow(() -> new EntityNotFoundException(message));
    }

    @Override
    public Localidade create(Localidade localidade) {
        return localidadeRepository.save(localidade);
    }

    @Override
    public Localidade update(Localidade localidade) {
        return localidadeRepository.save(localidade);
    }

    @Override
    public void deleteById(Long id) {
        Localidade localidade = this.findById(id);
        this.localidadeRepository.delete(localidade);
    }
}
