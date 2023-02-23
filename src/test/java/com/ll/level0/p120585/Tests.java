package com.ll.level0.p120585;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class Tests {
    @Test
    @DisplayName("149 180 192 170 중 167 보다 큰사람은 세명이다")
    void t1(){
        assertThat(new Solution().solution(new int[]{149,180,192,172},167)).isEqualTo(3);

    }
    @Test
    @DisplayName("[180, 120, 140] 중 190 보다 큰사람은 0명이다")
    void t2(){
        assertThat(new Solution().solution(new int[]{180,120,140},190)).isEqualTo(0);

    }
}
