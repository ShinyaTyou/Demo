package com.msr.mapper;

import com.msr.bean.Brand;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

@Mapper
public interface BrandMapper {

    List<Brand> selectAll();

    List<String> selectName();

    Integer add(Brand brand);
}
