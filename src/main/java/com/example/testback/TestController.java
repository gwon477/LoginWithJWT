package com.example.testback;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class TestController {
    @Autowired
    private  OauthService oauthService;

    @GetMapping("/oauth/kakao")
    public String ReceiveString(@RequestParam("code") String code) {
        System.out.println("받은 인가코드 = " + code);

        String accessToken = oauthService.getKakaoAccessToken(code);
        KakaoInfo userinfo = oauthService.getKakaoUserInfo(accessToken);

        //OauthToken oauthToken = userService.getAccessToken(code);
        System.out.println("accesToken = " + accessToken);
        System.out.println("userinfo = " + userinfo);
        return "인가코드를 성공적으로 받았습니다.";
    }
}
