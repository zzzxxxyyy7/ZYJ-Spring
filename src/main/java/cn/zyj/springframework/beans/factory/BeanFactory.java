package cn.zyj.springframework.beans.factory;

/**
 * Bean 工厂接口，赋予了获取 Bean 的能力
 */
public interface BeanFactory {

    /**
     * 通过bean名称获取bean
     * @param name
     * @return
     * @throws Exception
     */
    Object getBean(String name) throws Exception;

}
