package Spring.Cloud.RabbitMQ.publisher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
public class RabbitMQProducer {
    private static Logger LOGGER = LoggerFactory.getLogger(RabbitMQProducer.class);
    @Value("${rabbitMQ.exchange.name}")
    private String exchange;

    @Value("${rabbitMQ.routing.key.name}")
    private String key;


    private RabbitTemplate rabbitTemplate;

    public RabbitMQProducer(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    public void sendMessage(String message){
        LOGGER.info("Message Sent -> "+message);
        rabbitTemplate.convertAndSend(exchange, key, message);
    }

}
