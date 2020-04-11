package banxia.org;

import banxia.org.utils.ResultUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tk.mybatis.spring.annotation.MapperScan;

import java.util.HashMap;

@SpringBootApplication
@RestController
@MapperScan(basePackages="banxia.org.mapper")
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@GetMapping("/ping")
	public ResultUtils testApi() {
		HashMap<String, String> res = new HashMap<>();
		res.put("message", "pong");
		return ResultUtils.ok(res);
	}

	
}
