package cn.zyj.springframework.beans.factory.support;

import cn.zyj.springframework.beans.BeansException;
import cn.zyj.springframework.beans.factory.BeanFactory;
import cn.zyj.springframework.beans.factory.config.BeanDefinition;

/**
 * 首先继承 DefaultSingletonBeanRegistry，具备使用单例注册类方法
 * 实现了 BeanFactory 接口，对单例 Bean 对象的获取以及在获取不到时需要拿到 Bean 的定义做相应 Bean 实例化操作
 * 但是没有自身的去实现这些方法，而是只定义了调用过程以及提供了抽象方法，由实现此抽象类的其他类做相应实现
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {

    @Override
    public Object getBean(String name) throws BeansException {
        Object bean = getSingleton(name);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(name);
        return createBean(name, beanDefinition);
    }

    /**
     * 获取bean定 - 交给实现类来实现
     * @param beanName
     * @return
     * @throws BeansException
     */
    protected abstract BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    /**
     * 创建bean - 交给实现类来实现
     * @param beanName
     * @param beanDefinition
     * @return
     * @throws BeansException
     */
    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition) throws BeansException;

}
