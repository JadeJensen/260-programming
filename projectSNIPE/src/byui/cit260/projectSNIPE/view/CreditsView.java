/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.projectSNIPE.view;

/**
 *
 * @author Jade
 */
public class CreditsView {

    public CreditsView() {
        this.displayBanner();

    }

    private void displayBanner() {
        System.out.println("/n===================================================================================="
                + "/n*********************************END OF GAME CREDITS*********************************"
                + "/n===================================================================================="
                + "/nThis game was inspired by various spy movies and stories."
                + "/nNo spies were physically injured or killed in the testing of this game.  Except one."
                + "/nInitial Development by Kristin Newill, Densie Goetz, Dana Hudrlik"
                + "/nImplementation and coding by Jade Jensen and Ruben Gonzalez Flores");
    }
}
