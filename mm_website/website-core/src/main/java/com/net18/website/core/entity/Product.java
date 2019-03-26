package com.net18.website.core.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import java.io.Serializable;

@ApiModel(description = "產品")
public class Product implements Serializable {

    @TableId
    private Long id;

    @ApiModelProperty(value = "名稱")
    private String name;

    @ApiModelProperty(value = "標記")
    private String markNote;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarkNote() {
        return markNote;
    }

    public void setMarkNote(String markNote) {
        this.markNote = markNote;
    }
}
