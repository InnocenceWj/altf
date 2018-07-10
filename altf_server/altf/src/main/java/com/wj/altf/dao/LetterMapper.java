package com.wj.altf.dao;

import com.wj.altf.entity.Letter;

public interface LetterMapper {
    int insert(Letter record);

    int insertSelective(Letter record);
}