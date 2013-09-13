package edu.training.springjdbc;

import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcTemplateTest {
	
	private ApplicationContext ctx = null;
	private JdbcTemplate template = null;
	private DataSource datasource = null;
	
	public JdbcTemplateTest() {
		ctx = new ClassPathXmlApplicationContext("datasources-beans.xml");
		datasource = ctx.getBean("mySqlDataSource",DataSource.class);
		System.out.println("Datasource obtained:"+datasource);
		template = new JdbcTemplate(datasource);
	}
	
	public static void main(String[] args) {
		JdbcTemplateTest t = new JdbcTemplateTest();
		t.showDatabases();
	}
	
	public void showDatabases() {
		List<Map<String,Object>> databases = template.queryForList("show databases");
		
		System.out.println(databases);
	}

}
