/*
 * 
 * NOTE: THE ORIGINAL PLANS CALLED FOR TWO END USER STORIES, ONE OF A GAME OVER WIN AND A GAME OVER LOSE
 *       I COMBINED THE VIEWS IN FAVOR OF A SUBSTITUTE IF ELSE STATEMENT:
 *       IF(WIN == TRUE) THEN ... ELSE LOSE, TRY AGAIN
 */
package byui.cit260.projectSNIPE.view;

/**
 *
 * @author Jade
 */
public class GameOverView {

    public GameOverView() {
        this.displayBannerWon();
    }

    private void displayBannerWon() {
        System.out.println("\n==============================================="
                + "\n***************CONGRATULATIONS!****************"
                + "\n==============================================="
                + "\nYou've completed your mission and are now an   "
                + "\nofficial Secret Agent! It wasn't an easy task,"
                + "\nbut here you are."
                + "\nPress Q to return to the Main Menu");
    }
}
