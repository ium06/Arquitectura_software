package org.sisoftware.service;

import java.util.List;
import org.sisoftware.entity.Entity;

public interface FindName<T extends Entity> {

    List<T> findByName(String name);
}
