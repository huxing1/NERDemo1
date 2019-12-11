package cn.hyzs.TextSearchIntoHBase;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
@SpringBootApplication
@MapperScan("cn.hyzs.TextSearchIntoHBase.db.mapper")
public class NerDemo1Application {

	public static void main(String[] args) {
		SpringApplication.run(NerDemo1Application.class, args);
	}

}
