/*
 * Copyright 2010 Kevin Pollet
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.my.container.test.factory;

import com.my.container.binding.provider.BindingProvider;
import com.my.container.context.ApplicationContext;
import com.my.container.context.Context;
import com.my.container.test.factory.services.HelloService;
import org.junit.Assert;
import org.junit.Test;

/**
 * @author Kevin Pollet
 */
public class BindingTest {
    
    @Test
    public void testClassBinding() {
        Context context = new ApplicationContext(new BindingProvider() {
            @Override
            public void configureBindings() {
                bindClass(HelloService.class);
            }
        });
        HelloService service = context.getBean(HelloService.class);

        Assert.assertNotNull(service);
        Assert.assertEquals("Hello Container", service.sayHello("Container"));
    }

}
