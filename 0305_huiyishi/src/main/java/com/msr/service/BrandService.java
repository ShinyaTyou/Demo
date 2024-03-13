package com.msr.service;

import com.msr.bean.Brand;

import java.util.List;

public interface BrandService {

    List<Brand> selectAll();

    List<String> selectName();

    Integer add(Brand brand);
}
