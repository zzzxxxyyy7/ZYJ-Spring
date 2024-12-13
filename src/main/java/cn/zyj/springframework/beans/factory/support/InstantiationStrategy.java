package cn.zyj.springframework.beans.factory.support;

import cn.zyj.springframework.beans.BeansException;
import cn.zyj.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * 带参构造函数策略化接口
 */
public interface InstantiationStrategy {

    /**
     * Constructor 包含了一些必要的类信息
     * @param beanDefinition
     * @param beanName
     * @param ctor
     * @param args
     * @return
     * @throws BeansException
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;

}
