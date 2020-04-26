package banxia.org.controller;

import banxia.org.service.RecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiexin
 * @create 2020-04-20 5:27 下午
 * @description
 */
@RestController
public class RecordController {

    @Autowired
    private RecordService recordService;
}
