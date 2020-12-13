package person.me.handle;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;
import person.me.parser.CompanyBeanDefinitionParser;
import person.me.parser.UserBeanDefinitionParser;

public class MyUserNamespaceHandler extends NamespaceHandlerSupport{

    @Override
    public void init() {
        registerBeanDefinitionParser("user",new UserBeanDefinitionParser());
        registerBeanDefinitionParser("company",new CompanyBeanDefinitionParser());
    }
}