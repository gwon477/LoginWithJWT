package com.example.testback;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Builder
public class KakaoInfo {
    private Long id;
    private String profileImgUrl;
    private String email;


}
