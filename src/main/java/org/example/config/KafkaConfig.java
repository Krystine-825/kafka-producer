package org.example.config;
import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaConfig {
    @Bean
    public NewTopic createTopic() {
        return TopicBuilder.name("json-topic")
                .partitions(3)  // Tăng lên 3 partitions
                .replicas(3)    // Replication factor là 3
                .build();
    }
}