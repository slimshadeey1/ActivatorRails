package org.poweredrails.world;

import com.flowpowered.math.vector.Vector2i;
import com.google.common.base.Optional;
import org.poweredrails.api.world.Chunk;
import org.poweredrails.api.world.World;
import org.poweredrails.api.world.dimension.Dimension;
import org.poweredrails.gridmap.GridMap;

import java.util.UUID;

public class RailsWorld implements World {

    String name;
    UUID uuid;
    Chunk[] chunks;
    Dimension d;

    public RailsWorld(String name, Chunk[] chunks) {
        this(name, chunks, Dimension.OVERWORLD);
    }

    public RailsWorld(String name, Chunk[] chunks, Dimension d) {
        this.name = name;
        this.uuid = UUID.randomUUID();
        this.chunks = chunks;
        this.d = d;
    }

    @Override public UUID getUniqueId() {
        return uuid;
    }

    @Override public String getName() {
        return name;
    }

    @Override public Dimension getDimension() {
        return d;
    }

    @Override public Optional<Chunk> getChunk(Vector2i location) {
        for (Chunk c : chunks) {
            if (c.getChunkPosition().getX() == location.getX()
                && c.getChunkPosition().getZ() == location.getY()) {
                return Optional.of(c);
            }
        }
        return null;
    }

    @Override public Optional<Chunk> generateChunk(Vector2i location, GridMap customChunk) {
        // TODO Generate Chunk Method
        return null;
    }

    @Override public Chunk generateChunk(Vector2i location) {
        // TODO Generate Chunk Method
        return null;
    }

}
