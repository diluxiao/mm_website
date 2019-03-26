package com.net18.website.web.controller;

import com.net18.website.core.common.ResponseMessage;
import com.net18.website.core.entity.Product;
import com.net18.website.core.service.ProductService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Api(value = "product", description = "WEB產品接口")
@RequestMapping("/web")
public class ProductController {
    @Resource
    private ProductService productService;

    @ApiOperation(value = "贷款申请数据分页")
    @PostMapping("/product/add")
    public ResponseMessage<String> addProduct(@RequestBody Product product) {

        productService.insert(product);

        return new ResponseMessage<>(true, "添加成功");
    }
}
