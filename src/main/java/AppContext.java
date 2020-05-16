import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//фабричный метод, без использования файла ApplicationContext.xml

//Работа с аннотациями - фарбричный метод
@Configuration //загружаем класс
public class AppContext {

    @Bean //загружаем бин
    public PersonBean person(){
        return new PersonBean("Sergey", 41);
    }
}
