package org.example.Service;

import org.example.Entity.Promotion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromotionService extends JpaRepository<Promotion, Long> {
    Promotion findByProductId(Long productId);
}
