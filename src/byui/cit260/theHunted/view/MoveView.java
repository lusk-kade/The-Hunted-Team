/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.theHunted.view;

import byui.cit1260.theHunted.model.Game;
import byui.cit1260.theHunted.model.Location;
import byui.cit1260.theHunted.model.Map;
import buyi.cit260.theHunted.control.MapControl;
import byui.cit260.theHunted.exceptions.MapControlException;
import thehunted.TheHunted;

/**
 *
 * @author palme
 */
public class MoveView extends View {

public MoveView() {
     super("\n"
     + "\n------------------------------------------"
     + "\n Enter your desired location "
     + "\n------------------------------------------");
}
  @Override
  public boolean doAction(String mapOption) {
     mapOption = mapOption.toUpperCase();
     Game game = TheHunted.getCurrentGame(); // retreive the game
     Map map = game.getMap(); // retreive the map from game
     Location[][] locations = map.getLocations(); // retreive the locations from map
     for (int row = 0; row < locations.length; row++) {
          for (int column = 0; column < locations[row].length; column++) {
               if (locations[row][column].getScene() != null) {               
                    if (mapOption.equals(locations[row][column].getScene().getSymbol())) {
                         try {
                             MapControl.movePlayer(map, row, column);
                         }
                         catch(MapControlException me){
                             this.console.println(me.getMessage());
                             return false;
                         }
                         return true;
                    }
                 }
            }
     }
     ErrorView.display(this.getClass().getName(),
             "\n*** Invalid selection *** Try Again later");
     return false;
   }
}