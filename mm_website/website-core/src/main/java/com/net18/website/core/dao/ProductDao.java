package com.net18.website.core.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.net18.website.core.entity.Product;
import org.mapstruct.Mapper;

@Mapper
public interface ProductDao extends BaseMapper<Product> {
}
