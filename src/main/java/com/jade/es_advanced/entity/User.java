package com.jade.es_advanced.entity;

import cn.easyes.annotation.IndexField;
import cn.easyes.common.enums.FieldType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;

/**
 * es 嵌套类型
 * <p>
 * Copyright © 2022 xpc1024 All Rights Reserved
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @IndexField("user_name")
    private String username;
    @IndexField(exist = false)
    private Integer age;
    /**
     * 多级嵌套
     */
    @IndexField(fieldType = FieldType.NESTED, nestedClass = Faq.class)
    private Set<Faq> faqs;
}
