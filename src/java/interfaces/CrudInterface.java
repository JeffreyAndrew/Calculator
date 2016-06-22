package interfaces;

import java.util.ArrayList;

/**
 *
 * @author Andrew
 */
public interface CrudInterface <Entity>{
    
    public boolean add(Entity e);
    public boolean edit(Entity e);
    public boolean delete(Object key);
    public ArrayList<Entity> toList();
    public Entity search(Object key);
}
