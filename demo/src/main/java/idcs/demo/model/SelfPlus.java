package idcs.demo.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "self_plus")
@Getter
@NoArgsConstructor
public class SelfPlus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long value = 0L;

    public void plus(Long delta) {
        this.value += delta;
    }
}
