package idcs.demo.controller;

import idcs.demo.model.SelfPlus;
import idcs.demo.service.SelfPlusService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/self-plus")
@RequiredArgsConstructor
public class SelfPlusController {

    private final SelfPlusService service;

    @PostMapping
    public SelfPlus create() {
        return service.create();
    }

    @GetMapping
    public List<SelfPlus> findAll() {
        return service.findAll();
    }

    @PostMapping("/{id}/plus")
    public SelfPlus plus(
            @PathVariable Long id,
            @RequestBody Long value
    ) {
        return service.plus(id, value);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }
}

