package com.ll.level0.p120830;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class Tests {
    @Test
    @DisplayName("10인분의 양꼬치와 음료 3개를 먹으면 음료1개가 추가되서 124000이다")
    void t1(){
        assertThat(new Solution().solution(10,3)).isEqualTo(124000);
    }
    @Test
    @DisplayName("64인분의 양꼬치와 음료 6개를 먹으면 음료6개가 서비스 추가되서 768000이다")
    void t2(){
        assertThat(new Solution().solution(64,6)).isEqualTo(768000);
    }
}
