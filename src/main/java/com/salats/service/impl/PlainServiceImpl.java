package com.salats.service.impl;

import com.salats.model.Call;
import com.salats.repository.CallRepository;
import com.salats.service.PlainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by aleksandrpliskin on 19.04.16.
 */
@Service
public class PlainServiceImpl implements PlainService {

    @Autowired
    CallRepository callRepository;

    @Override
    public Call getCall(Long id) {
        return callRepository.findOne(id);
    }
}
