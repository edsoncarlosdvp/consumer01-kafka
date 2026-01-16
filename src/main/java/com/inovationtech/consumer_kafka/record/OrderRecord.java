package com.inovationtech.consumer_kafka.record;

import java.math.BigDecimal;

public record OrderRecord(Long id, String name, String description, BigDecimal amount) {
  
}
