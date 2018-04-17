package dozertest.demo.entity;

import lombok.Data;
import org.dozer.Mapping;

@Data
public class Emp {

    private String name;

    private Integer age;

    private String date;

    public Emp(String name, Integer age, String date) {
        this.name = name;
        this.age = age;
        this.date = date;
    }

    public Emp() {
    }
}
