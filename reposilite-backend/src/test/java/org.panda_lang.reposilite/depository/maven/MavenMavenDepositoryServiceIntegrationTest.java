package org.panda_lang.reposilite.depository.maven;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.panda_lang.reposilite.depository.DepositoryEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@RunWith(SpringRunner.class)
class MavenMavenDepositoryServiceIntegrationTest {

    @Autowired
    private MavenDepositoryServiceImpl depositoryService;

    @Test
    void getDepositoryTest() {
        Assert.assertNotNull(this.depositoryService.getDepository("releases"));
    }

    @Test
    void getDepositoryEntityTest() {
        MavenDepository mavenDepository = this.depositoryService.getDepository("releases");
        DepositoryEntity depositoryEntity = this.depositoryService.getDepositoryEntity(mavenDepository, "org/panda-lang/panda-utilities");

        assertNotNull(depositoryEntity);
    }
}
