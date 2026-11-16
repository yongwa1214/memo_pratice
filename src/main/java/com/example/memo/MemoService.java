package com.example.memo;

import com.example.memo.model.MemoReq;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemoService {
    private final MemoMapper memoMapper;

    public int save (MemoReq req){
        int result = memoMapper.save(req);
        return result;
    }
}
