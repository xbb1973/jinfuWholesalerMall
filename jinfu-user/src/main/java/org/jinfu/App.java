package org.jinfu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author ：xbb
 * @date ：Created in 2020/4/10 10:48 上午
 * @description：stater
 * @modifiedBy：
 * @version:
 */
@SpringBootApplication
@MapperScan("org/jinfu/user/mapper")
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
