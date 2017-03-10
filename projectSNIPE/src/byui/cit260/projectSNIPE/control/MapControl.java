/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.control;

import byui.cit260.projectSNIPE.model.Map;

/**
 *
 * @author JadeJ
 */
public class MapControl {
    public static Map createMap(){
        Map map = new Map(3,9);
        Scene[] scenes = createScenes();
        GameControl.assignScenesToLocations(map, scenes);
        return map;
    }
}
