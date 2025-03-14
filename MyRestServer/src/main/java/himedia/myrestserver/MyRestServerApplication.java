package himedia.myrestserver;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@MapperScan(basePackages =
		{"learnbyteaching.shoplist.mappers"})
@ComponentScan(basePackages= {"himedia.myrestserver",
														"learnbyteaching.todos",
														"learnbyteaching.shoplist"})
public class MyRestServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyRestServerApplication.class, args);
	}

}
