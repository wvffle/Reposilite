package net.dzikoysk.reposilite.domain.depository.entities.group;

import net.dzikoysk.reposilite.domain.depository.DepositoryEntity;
import net.dzikoysk.reposilite.domain.depository.entities.artifact.Artifact;
import org.springframework.lang.Nullable;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Group implements DepositoryEntity {

    private final String groupName;
    private final Map<String, Artifact> artifacts;

    Group(String groupName) {
        this.groupName = groupName;
        this.artifacts = new HashMap<>();
    }

    public void addArtifact(Artifact artifact) {
        artifacts.put(artifact.getName(), artifact);
    }

    public @Nullable Artifact getArtifact(String artifactName) {
        return artifacts.get(artifactName);
    }

    public Collection<? extends Artifact> getArtifacts() {
        return artifacts.values();
    }

    public String getName() {
        return groupName;
    }

}