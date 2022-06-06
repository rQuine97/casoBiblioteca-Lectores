
package com.app.web.service;

import com.app.web.entity.Lector;
import java.util.List;


public interface LectorService {
    public List<Lector> readAll();
    public Lector create(Lector lector);
    public Lector update(Lector lector);
    public Lector read(int idlector);
    public void delete(int idlector);
}
