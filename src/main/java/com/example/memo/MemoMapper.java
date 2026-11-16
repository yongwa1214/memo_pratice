package com.example.memo;


import com.example.memo.model.MemoReq;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemoMapper {
    int save(MemoReq req);


}
