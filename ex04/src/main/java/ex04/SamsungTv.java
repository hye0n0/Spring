package ex04;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Component  //<bean id="">
@Log4j
public class SamsungTv implements TV {
	
//	@Setter(onMethod_ = {@Autowired})
	@Autowired
	Speaker speaker ;  //DI
	
	//Logger log = LogManager.getLogger(SamsungTv.class);
			
	@Override
	public void on() {
		log.info("samsung tv on");
		speaker.volumnup();
	}
}
