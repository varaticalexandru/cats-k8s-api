package org.alexv.catsapi.service;

import lombok.RequiredArgsConstructor;
import org.alexv.catsapi.dto.CatDto;
import org.alexv.catsapi.entity.Cat;
import org.alexv.catsapi.repository.CatRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class CatService {
    private final CatRepository catRepository;

    public List<Cat> getAll() {
        return catRepository.findAll();
    }

    public Cat saveCat(CatDto catDto) {
        Cat cat = new Cat()
                .setId(UUID.randomUUID().toString())
                .setName(catDto.getName())
                .setBirthday(catDto.getBirthday())
                .setCreatedAt(LocalDateTime.now());

        return catRepository.save(cat);
    }

}
