package io.github.fairyspace.beans;

public interface BeanFactory {
    Object getBean(String name);
    Object getBean(String name, Object... args);
}
