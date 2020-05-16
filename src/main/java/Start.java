import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Start {

    public static void main(String[] args) {

        //Загружаем и зарегистрируем фабричный метод (работа с аннотациями)
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppContext.class);

        //указываем класс для работы с аннотациями
        PersonBean person = context.getBean(PersonBean.class);
        System.out.printf("%s - %d", person.getName(), person.getAge());
    }
}