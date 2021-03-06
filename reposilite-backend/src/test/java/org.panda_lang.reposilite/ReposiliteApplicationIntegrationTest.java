package org.panda_lang.reposilite;

import org.hamcrest.Matchers;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
class ReposiliteApplicationIntegrationTest {

    @Autowired
    private ReposiliteConfiguration reposiliteConfiguration;

    @Test
    void contextLoads() {
        Assert.assertThat(this.reposiliteConfiguration, Matchers.notNullValue());
    }

}
