/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.control;

import byui.cit260.projectSNIPE.exceptions.MapControlException;
import byui.cit260.projectSNIPE.model.Location;
import byui.cit260.projectSNIPE.model.Map;
import byui.cit260.projectSNIPE.model.Player;
import byui.cit260.projectSNIPE.model.Scene;
import projectsnipe.ProjectSNIPE;
import java.awt.Point;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author JadeJ
 */
public class MapControl {

    public static Map createMap() {
        Map map = new Map(9, 3);
        Scene[] scenes = Scene.createScenes();
        MapControl.assignScenesToLocations(map, scenes);
        return map;
    }

    public static void movePlayerToLocation(Player player, Point coordinates) throws MapControlException {
        Map map = ProjectSNIPE.getCurrentGame().getMap();
        int newRow = coordinates.x;
        int newColumn = coordinates.y;
        if (newRow < 0 || newRow >= map.getNoOfRows() || newColumn < 0 || newColumn >= map.getNoOfColumns()) {
            throw new MapControlException("Cannot move player to location "
                    + coordinates.x + ", " + coordinates.y
                    + " because that location is outside "
                    + "the bounds of the map.");
        }
    }

    public static void movePlayerToStartingLocation(Map map, Player player) {
        player.setLocation(map.getLocations()[0][0]);
    }

    public static void printMap(String filePath) throws MapControlException {
        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);
            output.writeObject(Scene.createScenes());
        } catch (Exception e) {
            throw new MapControlException(e.getMessage());
        }
    }

    public void changeLocation(Player[] player, Point coordinates) throws MapControlException {
        Map map = ProjectSNIPE.getCurrentGame().getMap();
        int newRow = coordinates.x;
        int newColumn = coordinates.y;

        if (newRow > 9 || newColumn > 4 || newRow < 0 || newColumn < 0) {
            throw new MapControlException("Cannot move to this location. This"
                    + "\nlocation is put of bounds.");
        } else {
            ProjectSNIPE.getCurrentGame().getPlayer().setCoordinates(coordinates);
            map.getLocations()[newRow][newColumn].setVisited(true);
        }

    }

    static void assignScenesToLocations(Map map, Scene[] scenes) {
        Location[][] locations = map.getLocations();
        locations[0][0].setScene(scenes[Scene.SceneType.usaAcademy.ordinal()]);
        locations[0][1].setScene(scenes[Scene.SceneType.usaLibrary.ordinal()]);
        locations[0][2].setScene(scenes[Scene.SceneType.usaArch.ordinal()]);
        locations[1][0].setScene(scenes[Scene.SceneType.germanyWall.ordinal()]);
        locations[1][1].setScene(scenes[Scene.SceneType.germanyCathedral.ordinal()]);
        locations[1][2].setScene(scenes[Scene.SceneType.germanyRiver.ordinal()]);
        locations[2][0].setScene(scenes[Scene.SceneType.englandBigBen.ordinal()]);
        locations[2][1].setScene(scenes[Scene.SceneType.englandWestminster.ordinal()]);
        locations[2][2].setScene(scenes[Scene.SceneType.englandPalace.ordinal()]);
        locations[3][0].setScene(scenes[Scene.SceneType.spainTarragona.ordinal()]);
        locations[3][1].setScene(scenes[Scene.SceneType.spainCathedral.ordinal()]);
        locations[3][2].setScene(scenes[Scene.SceneType.spainValencia.ordinal()]);
        locations[4][0].setScene(scenes[Scene.SceneType.franceEiffelTower.ordinal()]);
        locations[4][1].setScene(scenes[Scene.SceneType.franceLouvre.ordinal()]);
        locations[4][2].setScene(scenes[Scene.SceneType.franceSidewalkCafe.ordinal()]);
        locations[5][0].setScene(scenes[Scene.SceneType.canadaStadium.ordinal()]);
        locations[5][1].setScene(scenes[Scene.SceneType.canadaLibrary.ordinal()]);
        locations[5][2].setScene(scenes[Scene.SceneType.canadaCNTower.ordinal()]);
        locations[6][0].setScene(scenes[Scene.SceneType.brazilBeach.ordinal()]);
        locations[6][1].setScene(scenes[Scene.SceneType.brazilForest.ordinal()]);
        locations[6][2].setScene(scenes[Scene.SceneType.brazilSaoPaolo.ordinal()]);
        locations[7][0].setScene(scenes[Scene.SceneType.australiaOperaHouse.ordinal()]);
        locations[7][1].setScene(scenes[Scene.SceneType.australiaJail.ordinal()]);
        locations[7][2].setScene(scenes[Scene.SceneType.australiaBridge.ordinal()]);
        locations[8][0].setScene(scenes[Scene.SceneType.russiaSquare.ordinal()]);
        locations[8][1].setScene(scenes[Scene.SceneType.russiaLenin.ordinal()]);
        locations[8][2].setScene(scenes[Scene.SceneType.russiaCathedral.ordinal()]);
        System.out.println(locations[0][0]);
    }
}
