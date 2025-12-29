package idcs.demo.repository;


import idcs.demo.model.SelfPlus;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SelfPlusRepository extends JpaRepository<SelfPlus, Long> {
}

