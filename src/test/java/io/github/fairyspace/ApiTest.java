package io.github.fairyspace;

import io.github.fairyspace.beans.factory.config.BeanDefinition;
import io.github.fairyspace.beans.factory.support.DefaultListenableBeanFactory;
import io.github.fairyspace.service.UserService;
import org.junit.Test;

public class ApiTest {
   @Test
    public void test(){
       DefaultListenableBeanFactory defaultListenableBeanFactory=new DefaultListenableBeanFactory();

       BeanDefinition beanDefinition=new BeanDefinition(UserService.class);
       defaultListenableBeanFactory.registerBeanDefinition("userService", beanDefinition);

       UserService bean = (UserService) defaultListenableBeanFactory.getBean("userService", "gaga");
       bean.queryUserInfo();

   }
}
