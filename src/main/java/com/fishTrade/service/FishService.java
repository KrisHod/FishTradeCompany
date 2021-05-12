package com.fishTrade.service;

import com.fishTrade.entity.Fish;
import com.fishTrade.repository.IFishRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


public class FishService implements IFishService{
    @Autowired
    private IFishRepository fishRepository;

    @Override
    public Optional<Fish> findById (long id){
        return fishRepository.findById(id);
    }

    @Transactional
    @Override
    public void save (Fish fish){
        fishRepository.save(fish);
    }
}
