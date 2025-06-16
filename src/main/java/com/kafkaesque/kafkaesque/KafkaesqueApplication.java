package com.kafkaesque.kafkaesque;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KafkaesqueApplication {

	public static void main(String[] args) {
		SpringApplication.run(KafkaesqueApplication.class, args);
	}
	/*
	 * Commands to start Kafka server
	 * Start the kafka server
	 * 1.
	 * KAFKA_CLUSTER_ID="$(bin/kafka-storage.sh random-uuid)"
	 * 2.
	 * bin/kafka-storage.sh format --standalone -t $KAFKA_CLUSTER_ID -c
	 * config/server.properties
	 * 3.
	 * bin/kafka-server-start.sh config/server.properties
	 * 
	 * Display messages on the terminal
	 * bin/kafka-console-consumer.sh --topic kafkaesque_json --from-beginning
	 * --bootstrap-server localhost:9092
	 */
}
