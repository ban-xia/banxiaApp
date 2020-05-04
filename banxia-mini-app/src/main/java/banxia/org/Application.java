package banxia.org;

import banxia.org.utils.ResultUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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

	@GetMapping("/time")
	public ResultUtils time() {
		HashMap<String, String> res = new HashMap<>();
		res.put("time", String.valueOf(System.currentTimeMillis()));
		return ResultUtils.ok(res);
	}

	
}
