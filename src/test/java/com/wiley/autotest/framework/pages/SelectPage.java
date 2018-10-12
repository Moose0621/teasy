package com.wiley.autotest.framework.pages;

import com.wiley.autotest.selenium.context.AbstractPage;
import com.wiley.autotest.selenium.elements.upgrade.TeasyElement;
import com.wiley.autotest.selenium.extensions.internal.Select;
import org.assertj.core.api.Assertions;
import org.openqa.selenium.By;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class SelectPage extends AbstractPage {

    public SelectPage checkOptionsText() {
        List<TeasyElement> options = new Select(element(By.tagName("select"))).getOptions();
        Assertions.assertThat(options.size()).isEqualTo(4);
        options.get(0).should().haveText("Volvo");
        options.get(1).should().haveText("Saab");
        options.get(2).should().haveText("Mercedes");
        options.get(3).should().haveText("Audi");
        return this;
    }
}