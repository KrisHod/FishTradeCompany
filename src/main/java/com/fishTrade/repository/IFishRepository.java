package com.fishTrade.repository;

import com.fishTrade.entity.Fish;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFishRepository extends JpaRepository<Fish, Long> {
}
