package com.wescale;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.IntegrationTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest()
@ContextConfiguration
@ActiveProfiles("test")
public class ConsuldemoApplicationTests {

	@Test
	public void contextLoads() {
	}

}

/*
properties={
"spring.cloud.bus.enabled: false",
"spring.cloud.inetutils.preferred-networks: null",
"spring.cloud.consul.enabled: false",
"spring.cloud.consul.config.enabled: false",
"spring.cloud.consul.discovery.enabled: false"
}
*/