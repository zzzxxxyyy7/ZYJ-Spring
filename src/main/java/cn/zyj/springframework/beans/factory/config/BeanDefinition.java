package cn.zyj.springframework.beans.factory.config;

public class BeanDefinition {

    /**
     * 实际上的 Bean 类
     */
    private Class bean;

    public BeanDefinition(Class bean) {
        this.bean = bean;
    }

    public Class getBean() {
        return bean;
    }

    public void setBean(Class bean) {
        this.bean = bean;
    }

}
