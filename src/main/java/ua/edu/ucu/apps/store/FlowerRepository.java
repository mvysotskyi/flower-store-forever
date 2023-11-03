package ua.edu.ucu.apps.store;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.edu.ucu.apps.store.flower.Flower;

public interface FlowerRepository extends JpaRepository<Flower, Integer> {
    
}