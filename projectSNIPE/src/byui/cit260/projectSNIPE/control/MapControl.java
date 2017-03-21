/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.control;

import byui.cit260.projectSNIPE.exceptions.MapControlException;
import byui.cit260.projectSNIPE.model.Map;
import byui.cit260.projectSNIPE.model.Player;
import byui.cit260.projectSNIPE.model.Scene;
import projectsnipe.ProjectSNIPE;
import java.awt.Point;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author JadeJ
 */
public class MapControl {
    public static Map createMap(){
        Map map = new Map(3,9);
        Scene[] scenes = Scene.createScenes();
        GameControl.assignScenesToLocations(map, scenes);
        return map;
    }

    public static void movePlayerToLocation(Player player, Point coordinates) throws MapControlException{
        Map map = ProjectSNIPE.getCurrentGame().getMap();
        int newRow = coordinates.x-1;
        int newColumn = coordinates.y-1;
        if (newRow < 0 || newRow >= map.getNoOfRows() || newColumn <0 || newColumn >= map.getNoOfColumns()){
            throw new MapControlException("Cannot move player to location "
                    + coordinates.x + ", " + coordinates.y
                            +" because that location is outside "
                            + "the bounds of the map.");
        }
    }
    public static void movePlayerToStartingLocation (Map map, Player player) {
        player.setLocation(map.getLocations()[0][0]);
    }
}
