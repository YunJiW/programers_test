package com.ll.level0.p120807;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    @DisplayName("2,3 => -1")
    void t1(){
        assertThat(new Solution().solution(2,3)).isEqualTo(-1);
    }

}