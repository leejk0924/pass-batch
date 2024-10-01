package com.jk.passbatch.config;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.context.annotation.Configuration;

/**
 * @EnableBatchProcessing
 * Spring Batch 기능을 활성화하고 배치 작업을 설정하기 위한 기본 구성 제공
 * JobBuilderFactory, StepBuilderFactory 를 빈으로 등록하여 Job Step 구현 시 사용할 수 있음
 */
@EnableBatchProcessing
@Configuration
public class BatchConfig {
}
