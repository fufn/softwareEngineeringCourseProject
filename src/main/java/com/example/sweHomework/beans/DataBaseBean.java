package com.example.sweHomework.beans;

import com.example.sweHomework.entities.Hotels;
import com.example.sweHomework.entities.PhoneNumber;
import com.example.sweHomework.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class DataBaseBean{

    @Autowired
    private HotelsRepository hotelsRepository;

    @Autowired
    private RoomRepository roomRepository;

    @Autowired
    private RoomTypeRepository roomTypeRepository;

    @Autowired
    private FeaturesRepository featuresRepository;

    @Autowired
    private PhoneNumbersRepository phoneNumbersRepository;

    public List<Hotels> getAllHotels(){
        return hotelsRepository.findAll();
    }


}
