package cn.zyj.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BeanFactory {

    /**
     * 存放beanDefinition的map，IOC 容器
     */
    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    /**
     * 根据bean名称获取bean
     * @param name
     * @return
     */
    public Object getBean(String name) {
        BeanDefinition beanDefinition = beanDefinitionMap.get(name);
        if (null == beanDefinition) throw new IllegalArgumentException("No bean named " + name + " is defined");
        return beanDefinition.getBean();
    }

    /**
     * 往工厂注册bean
     * @param name
     * @param beanDefinition
     */
    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }

}
