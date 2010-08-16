package com.my.container.exceptions.beanfactory;


/**
 * This exception is thrown when the
 * bean factory cannot instantiate the bean.
 *
 * @author kevinpollet
 */
public class BeanInstantiationException extends BeanFactoryException {

    public BeanInstantiationException(String message) {
        super(message);
    }

    public BeanInstantiationException(final String message, final Throwable cause) {
        super(message, cause);
    }

    public BeanInstantiationException(final Throwable cause) {
        super(cause);
    }
}
