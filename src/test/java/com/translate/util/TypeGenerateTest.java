package com.translate.util;

import com.translate.entity.User;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by KingsWong on 2019/8/25.
 */
public class TypeGenerateTest {
    @Test
    public void should_return_TypeGenerateObject_id_string_name_string_age_int_when_given_user_has_properties_id_and_name_and_age() throws Exception {
        User user = new User("1", "dean", 18);
        List<TypeGenerate> typeGenerate = TypeGenerate.generate(user);
        Assert.assertEquals(typeGenerate.get(0).getType(), "java.lang.String");
        Assert.assertEquals(typeGenerate.get(0).getName(), "id");
        Assert.assertEquals(typeGenerate.get(2).getType(), "int");
        Assert.assertEquals(typeGenerate.get(2).getName(), "age");
    }
}
