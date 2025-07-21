package indeedcoder.configclientdemo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientDemoController {

	@Value("${my.app.title}")
	private String value;

	@GetMapping("/config-info")
	public String getValueFromConfigServer() {
		return "From github:" + value;
	}
}
