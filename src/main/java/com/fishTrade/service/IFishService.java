package com.fishTrade.service;

import com.fishTrade.entity.Fish;

import java.util.Optional;

public interface IFishService {
    Optional<Fish> findById(long id);

    void save(Fish fish);
}
