package spring_introduction.annotationComp;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Pet tigerBean() {
        return new Tiger();
    }

    @Bean
    public Person3 person3Bean(){
        return new Person3(tigerBean());
    }
}
