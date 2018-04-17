package dozertest.demo.test;

import dozertest.demo.dozer.DozerMapperConvert;
import dozertest.demo.entity.Emp;
import dozertest.demo.entity.EmpVo;

public class Test {
    public static void main(String[] args) {

        Emp emp = new Emp("zhangsan",2,"1991-10-10");
        EmpVo empVo = new EmpVo();
        DozerMapperConvert.getInstance1().map(emp,empVo);
        System.out.println(empVo);

    }
}
