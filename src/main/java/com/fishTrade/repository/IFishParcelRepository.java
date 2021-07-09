package com.fishTrade.repository;

import com.fishTrade.entity.FishParcel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFishParcelRepository extends JpaRepository<FishParcel, Long> {
}
