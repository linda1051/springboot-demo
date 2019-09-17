package com.example.demo;

import com.example.demo.entity.Area;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
		Area area=new Area();
		//这里可以有get方法证明就ok 可以使用了
		Integer type = area.getType();
		System.out.println("---------------------------------------------------type:>>>>>>>>>>>>>>>>>>>>>>"+type);
	}

}
