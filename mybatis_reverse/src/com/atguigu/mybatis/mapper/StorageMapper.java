package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.domain.Storage;
import java.util.List;

public interface StorageMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Storage record);

    Storage selectByPrimaryKey(Integer id);

    List<Storage> selectAll();

    int updateByPrimaryKey(Storage record);
}