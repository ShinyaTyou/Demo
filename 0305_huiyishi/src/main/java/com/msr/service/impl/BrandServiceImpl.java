package com.msr.service.impl;

import com.msr.bean.Brand;
import com.msr.mapper.BrandMapper;
import com.msr.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BrandServiceImpl implements BrandService {

    @Autowired
    private BrandMapper brandMapper;

    @Override
    public List<Brand> selectAll() {
        return brandMapper.selectAll();
    }

    @Override
    public List<String> selectName() {
        return brandMapper.selectName();
    }

    @Override
    public Integer add(Brand brand) {
        return brandMapper.add(brand);
    }
}
