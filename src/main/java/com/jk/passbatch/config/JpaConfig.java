package com.jk.passbatch.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing // JPA auditing 활성화 (entity 의 생성일시와 수정일시 자동화하는 용도)
@Configuration
public class JpaConfig {
}
