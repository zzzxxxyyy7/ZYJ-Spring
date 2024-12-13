package cn.zyj.springframework.beans.factory.config;

/**
 * 单例Bean注册接口，赋予注册单例Bean的能力
 */
public interface SingletonBeanRegistry {

    /**
     * 定义一个获取单例对象的接口
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);

}
