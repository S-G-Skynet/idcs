package idcs.demo.service;

import idcs.demo.model.SelfPlus;
import idcs.demo.repository.SelfPlusRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@RequiredArgsConstructor
public class SelfPlusScheduler {

    private final SelfPlusRepository repository;

    @Scheduled(fixedRate = 10_000)
    @Transactional
    public void incrementAll() {
        repository.findAll().forEach(entity -> {
            entity.plus(1L);
            repository.save(entity);
        });
    }
}