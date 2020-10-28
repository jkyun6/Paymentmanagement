package pizza;
import org.springframework.beans.factory.annotation.Value;
import pizza.config.kafka.KafkaProcessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableBinding(KafkaProcessor.class)
@EnableFeignClients
public class PaymentmanagementApplication {
    protected static ApplicationContext applicationContext;
    @Value("${app.text.msg}")
    private static String test;

    public static void main(String[] args) {
        applicationContext = SpringApplication.run(PaymentmanagementApplication.class, args);
        System.out.println("${app.text.msg} : " + test);
        System.out.println("${spring.profiles}");
    }
}
