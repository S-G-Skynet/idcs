package idcs.demo.service;

import idcs.demo.model.SelfPlus;
import idcs.demo.repository.SelfPlusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class SelfPlusService {

    private final SelfPlusRepository repository;

    public SelfPlus create() {
        return repository.save(new SelfPlus());
    }

    @Transactional(readOnly = true)
    public List<SelfPlus> findAll() {
        return repository.findAll();
    }

    public SelfPlus plus(Long id, Long value) {
        SelfPlus entity = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Not found"));
        entity.plus(value);
        return entity;
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}

