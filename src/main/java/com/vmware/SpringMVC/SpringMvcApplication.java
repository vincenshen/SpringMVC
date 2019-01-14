package com.vmware.SpringMVC;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * @MapperScan() 表示扫描MyBatis的Mapper接口所在的包，找出所有加了@Mapper或@Repository注解的接口。
 */
@SpringBootApplication
@MapperScan("com.vmware.SpringMVC.domain")
public class SpringMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMvcApplication.class, args);
	}

}

