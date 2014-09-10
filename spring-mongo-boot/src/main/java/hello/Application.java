package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;

import java.util.Arrays;

@Configuration
@EnableAutoConfiguration()
@ComponentScan
@EnableMongoRepositories
@Import(RepositoryRestMvcConfiguration.class)
public class Application implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);

        System.out.println("Let's inspect the beans provided by Spring Boot:");

        String[] beanNames = ctx.getBeanDefinitionNames();
        Arrays.sort(beanNames);
        for (String beanName : beanNames) {
            System.out.println(beanName);
        }
    }

    @Override
    public void run(String... args) throws Exception {
        customerRepository.deleteAll();

        customerRepository.save(new Customer("John", "Smith"));
        customerRepository.save(new Customer("Alice", "Smith"));

        System.out.println("Customers found so far:");
        for(Customer customer: customerRepository.findAll()){
            System.out.println(customer);
        }
    }
}