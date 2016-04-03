package algorithms;
import org.gamelink.game.Kalah;
import org.gamelink.game.Algo;

public class TalhaZia extends Algo{ // Replace TeamName
    private static String teamName = "TalhaZia"; // Replace TeamName

    public static String getTeamName(){
        return teamName;
    }

    public static void main(String[] args){
        Kalah game = new Kalah(false);
        game.startGame(TalhaZia.class); // Replace TeamName
    }

    public static String algorithm(Kalah game){

   /************************************************
    ************  PLACE ALGORITHM HERE  ************
    ************************************************/
      int[][] gameBoard = game.getBoard();

      if(gameBoard[1][4] == 3){
        return "4";
      }

      if(checkEmpty(1, gameBoard[1][1])[0] == 1){
        if(gameBoard[1][checkEmpty(1, gameBoard[1][1])[1]] == 0 && gameBoard[1][1] != 0){
          return "1";
        }
      }

      if(checkEmpty(2, gameBoard[1][2])[0] == 1){
        if(gameBoard[1][checkEmpty(1, gameBoard[1][2])[1]] == 0 && gameBoard[1][2] != 0){
          return "2";
        }
      }

      if(checkEmpty(3, gameBoard[1][3])[0] == 1){
        if(gameBoard[1][checkEmpty(1, gameBoard[1][3])[1]] == 0 && gameBoard[1][3] != 0){
          return "3";
        }
      }

      if(checkEmpty(4, gameBoard[1][4])[0] == 1){
        if(gameBoard[1][checkEmpty(1, gameBoard[1][4])[1]] == 0 && gameBoard[1][4] != 0){
          return "4";
        }
      }

      if(checkEmpty(5, gameBoard[1][5])[0] == 1){
        if(gameBoard[1][checkEmpty(1, gameBoard[1][5])[1]] == 0 && gameBoard[1][5] != 0){
          return "5";
        }
      }

      if(checkEmpty(6, gameBoard[1][6])[0] == 1){
        if(gameBoard[1][checkEmpty(1, gameBoard[1][6])[1]] == 0 && gameBoard[1][6] != 0){
          return "6";
        }
      }

      int highest = 0;
      int trackHouse =0;
      if(gameBoard[1][1] > highest && gameBoard[1][1] != 0){
        highest = gameBoard[1][1];
        trackHouse = 1;
      }

      if(gameBoard[1][2] > highest && gameBoard[1][2] != 0){
        highest = gameBoard[1][2];
        trackHouse = 2;
      }

      if(gameBoard[1][3] > highest && gameBoard[1][3] != 0){
        highest = gameBoard[1][3];
        trackHouse = 3;
      }

      if(gameBoard[1][4] > highest && gameBoard[1][4] != 0){
        highest = gameBoard[1][4];
        trackHouse = 4;
      }

      if(gameBoard[1][5] > highest && gameBoard[1][5] != 0){
        highest = gameBoard[1][5];
        trackHouse = 5;
      }

      if(gameBoard[1][6] > highest && gameBoard[1][6] != 0){
        highest = gameBoard[1][6];
        trackHouse = 6;
      }

      return String.valueOf(trackHouse);

     }

     public static int[] checkEmpty(int houseNum, int seeds){
       int nextHouse = houseNum + seeds;
       int[] landHouse = new int[2];

       if(nextHouse > 6){
         nextHouse -= 6;
         landHouse[0] = 0;
         landHouse[1] = nextHouse;
       }
       if(nextHouse > 6){
         nextHouse -= 6;
         landHouse[0] = 1;
         landHouse[1] = nextHouse;
       }
       landHouse[0] = 1;
       landHouse[1] = nextHouse;
       return landHouse;
     }

}
