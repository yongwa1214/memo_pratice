package com.example.memo;


import com.example.memo.model.MemoReq;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class MemoController {

    private final MemoService memoService;

    @PostMapping("api/v1/memo/save")
    public ResponseEntity<?> save (@RequestBody MemoReq memoReq) {
        int result = memoService.save(memoReq);
        return ResponseEntity.ok(result);
    }

}
