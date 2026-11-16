package com.example.memo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class MemoReq {
    private String title;
    private String content;
}
