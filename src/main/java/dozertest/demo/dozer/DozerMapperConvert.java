package dozertest.demo.dozer;

import org.dozer.DozerBeanMapper;

import java.util.ArrayList;
import java.util.List;

public class DozerMapperConvert {
    private static volatile DozerMapperConvert mp = null;
    private DozerBeanMapper mapper = null;
    private static volatile DozerBeanMapper mp1 = null;

    public static DozerMapperConvert getInstance() {
        if (mp == null) {
            synchronized (DozerMapperConvert.class) {
                if (mp == null) {
                    mp = new DozerMapperConvert();
                }
            }
        }
        return mp;
    }
    /**
     * @author zhangdi
     * @date 2017/11/4 16:30
     * @Description:
     */
    public static DozerBeanMapper getInstance1() {
        if (mp1 == null) {
            synchronized (DozerMapperConvert.class) {
                if (mp1 == null) {
                    mp1 = new DozerBeanMapper();
                    List mapFiles = new ArrayList();
                    mapFiles.add("dozer/dozer-mapping.xml");
                    mp1.setMappingFiles(mapFiles);
                }
            }
        }
        return mp1;
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    private DozerMapperConvert() {

        List mapFiles = new ArrayList();
        //添加配置文件路径
        mapFiles.add("dozer/dozer-mapping.xml");

        mp1.setMappingFiles(mapFiles);
    }

    public void convert(Object source, Object destination) {
        mapper.map(source, destination);
    }

}