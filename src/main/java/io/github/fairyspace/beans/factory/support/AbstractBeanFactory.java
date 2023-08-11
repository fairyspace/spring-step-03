package io.github.fairyspace.beans.factory.support;

import io.github.fairyspace.beans.factory.config.BeanDefinition;
import io.github.fairyspace.beans.BeanFactory;

public abstract class AbstractBeanFactory extends DefaultSingletonRegistry implements BeanFactory {
    @Override
    public Object getBean(String name)  {
        return getBean(name, null);
    }

    @Override
    public Object getBean(String name,Object... args) {
        Object singleton = getSingleton(name);
        if(singleton!=null){
            return singleton;
        }

        BeanDefinition beanDefinition= getBeanDefinition(name);
        return createBean(name,beanDefinition,args);
    }

    protected abstract Object createBean(String name, BeanDefinition beanDefinition,Object[] args);

    protected abstract BeanDefinition getBeanDefinition(String name);


}
