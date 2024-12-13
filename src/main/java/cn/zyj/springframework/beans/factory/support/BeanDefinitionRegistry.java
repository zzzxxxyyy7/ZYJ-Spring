package cn.zyj.springframework.beans.factory.support;

import cn.zyj.springframework.beans.factory.config.BeanDefinition;

/**
 * 提供注册 BeanDefinition 的能力
 */
public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册 BeanDefinition
     *
     * @param beanName
     * @param beanDefinition
     */
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

}
