package dozertest.demo.test;

import com.sun.org.apache.bcel.internal.generic.NEW;
import dozertest.demo.dozer.DozerMapperConvert;
import dozertest.demo.entity.Emp;
import dozertest.demo.entity.EmpVo;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        Emp emp = new Emp("zhangsan",2,"1991-10-10");
        Emp emp1 =new  Emp("lisi",3,"1991-03-10");
        EmpVo empVo = new EmpVo();
        DozerMapperConvert.getInstance1().map(emp,empVo);
        System.out.println("-----------------------------------------------------------");
        System.out.println(empVo);
        List<Emp> emps = new ArrayList<>();
        emps.add(emp);
        emps.add(emp1);

        List<Emp> emps1 = new ArrayList<>();
        //list 转换

        DozerMapperConvert.getInstance1().map(emps,emps1);
        for (Emp emp2 : emps1) {
            System.out.println(emp2);

        }
    }
}
