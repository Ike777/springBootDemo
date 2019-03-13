package com.ikeapp.entity.dto;

import com.ikeapp.systems.DemoField;
import lombok.Data;

import java.util.Date;

/**
 * @author: wei.shen
 * @date: 2018/10/17
 */
@Data
public class DemoDto {

    private Long id;
    private String name;
    @DemoField
    private Date curDate;

}
