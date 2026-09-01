// This software is released into the Public Domain.  See copying.txt for details.
package io.github.villseriol.osmosis.reports.v0_6.shared;

import org.openstreetmap.osmosis.core.domain.v0_6.Entity;


public interface HasEntityVisitor {
    void visit(Entity entity);
}
