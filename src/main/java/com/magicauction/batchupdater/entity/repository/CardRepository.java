package com.magicauction.batchupdater.entity.repository;

import com.magicauction.batchupdater.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CardRepository extends JpaRepository<Card, Long> {
    Optional<Card> findByMultiverseId(String multiverseId);
}
