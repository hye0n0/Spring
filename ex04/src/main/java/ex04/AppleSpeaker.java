package ex04;

import org.springframework.stereotype.Component;

import lombok.extern.log4j.Log4j;

@Component  //<bean id="">
@Log4j
public class AppleSpeaker implements Speaker{
	
	public void volumnup() {
		log.info("apple up");
	}
}
