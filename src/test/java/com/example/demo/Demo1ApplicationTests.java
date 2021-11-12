package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@SpringBootTest
class Demo1ApplicationTests {

    @Autowired
    private AppProperties appProperties;

    @Test
    void contextLoads() {
        assertThat(appProperties).isNotNull().isEqualTo(new AppProperties("xxx", "prod"));
    }

}
