package Spring.Cloud.RabbitMQ.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;

@Configurable
public class RabbitMQConfig {

    @Value("${rabbitMQ.queue.name}")
    private String queue;

    @Value("${rabbitMQ.exchange.name}")
    private String exchange;

    @Value("${rabbitMQ.routing.key.name}")
    private String key;

    @Bean
    public Queue queue(){
        return new Queue(queue);
    }

    @Bean
    public TopicExchange topicExchange(){
        return new TopicExchange(exchange);
    }
    public Binding binding(){
        return BindingBuilder.bind(queue()).to(topicExchange()).with(key);
    }
}
