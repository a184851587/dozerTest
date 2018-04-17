package dozertest.demo.entity;

import lombok.Data;
import org.dozer.Mapping;

import java.util.Date;

@Data
public class EmpVo {
    @Mapping("name")
    private String xm;

    private Integer age;

    private Date date;
}
