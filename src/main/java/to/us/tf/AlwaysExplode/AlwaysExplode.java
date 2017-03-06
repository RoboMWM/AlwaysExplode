package to.us.tf.AlwaysExplode;

import org.bukkit.event.EventHandler;
import org.bukkit.event.EventPriority;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityExplodeEvent;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * Created on 3/6/2017.
 *
 * @author RoboMWM
 */
public class AlwaysExplode extends JavaPlugin implements Listener
{
    public void onEnable()
    {
        getServer().getPluginManager().registerEvents(this, this);
    }

    @EventHandler(priority = EventPriority.LOWEST)
    void onExplodeB4PlogenzGetIt(EntityExplodeEvent event)
    {
        event.setCancelled(true); //fake 'em out
    }

    @EventHandler(priority = EventPriority.LOW) //Other plugins can undo this if they so desire
    void onExplode(EntityExplodeEvent event)
    {
        event.setCancelled(false);
    }
}
