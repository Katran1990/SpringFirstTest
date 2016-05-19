package com.spring.test;

import org.springframework.aop.RawTargetAccess;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.util.ReflectionUtils;

import java.lang.reflect.Field;
import java.util.Random;

/**
 * Created by Boris on 19.05.2016.
 */
public class InjectRandomIntAnnotationBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object bean, String beanName){
        Field[] fields = bean.getClass().getDeclaredFields();
        for (Field field : fields){
            InjectRandomInt annotation = field.getAnnotation(InjectRandomInt.class);
            if (annotation!=null){
                int min = annotation.min();
                int max = annotation.max();
                Random random = new Random();
                int i = min+random.nextInt(max-min);
                field.setAccessible(true);
                ReflectionUtils.setField(field, bean, i);
            }
        }
        return bean;
    }

    public Object postProcessAfterInitialization(Object bean, String beanName){
        return bean;
    }
}
