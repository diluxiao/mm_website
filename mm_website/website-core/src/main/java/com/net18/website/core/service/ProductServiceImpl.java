package com.net18.website.core.service;

import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.net18.website.core.dao.ProductDao;
import com.net18.website.core.entity.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl extends ServiceImpl<ProductDao, Product> implements ProductService {
}
