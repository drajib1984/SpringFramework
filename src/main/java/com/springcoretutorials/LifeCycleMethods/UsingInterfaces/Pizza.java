package com.springcoretutorials.LifeCycleMethods.UsingInterfaces;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Pizza implements InitializingBean, DisposableBean //initializing bean call init method
// disposable bean call destroy method
{
    private double pizzaPrice;

    @Override
    public void destroy() throws Exception {
        System.out.println("In destroy method");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("inside in-it method");
    }
}
