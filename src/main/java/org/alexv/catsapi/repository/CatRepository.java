package org.alexv.catsapi.repository;

import org.alexv.catsapi.entity.Cat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CatRepository extends JpaRepository<Cat, String> {
}
