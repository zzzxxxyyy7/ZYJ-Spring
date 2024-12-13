package cn.zyj.springframework.beans.factory;

/**
 * Bean 工厂接口，赋予了获取 Bean 的能力
 */
public interface BeanFactory {

    /**
     * 通过Bean名称获取Bean
     * @param name
     * @return
     * @throws Exception
     */
    Object getBean(String name) throws Exception;

    /**
     * 支持构造函数传参创建Bean
     * @param name
     * @param args
     * @return
     * @throws Exception
     */
    Object getBean(String name, Object... args) throws Exception;

}
