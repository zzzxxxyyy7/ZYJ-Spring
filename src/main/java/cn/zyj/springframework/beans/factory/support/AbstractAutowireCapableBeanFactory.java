package cn.zyj.springframework.beans.factory.support;

import cn.zyj.springframework.beans.BeansException;
import cn.zyj.springframework.beans.factory.config.BeanDefinition;

/**
 * 支持自动注入的 Bean 工厂实现
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {

    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException {
        Object bean = null;
        try {
            bean = beanDefinition.getBean().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new BeansException("Instantiation of bean failed", e);
        }

        addSingleton(beanName, bean);
        return bean;
    }

}
