package org.panda_lang.reposilite.depository.maven.build;

import org.panda_lang.reposilite.depository.AbstractDepositoryEntity;

import java.io.File;

public class Data extends AbstractDepositoryEntity {

    private final File file;

    Data(File file) {
        super(file.getName());
        this.file = file;
    }

    public File getFile() {
        return file;
    }

}
