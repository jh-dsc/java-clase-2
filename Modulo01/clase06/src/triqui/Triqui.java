package triqui;

public class Triqui {
  public static void startGame() {

    // 1. Identificar el primer jugador X o O
    // 2. Inicializar y mostrar el tablero
    // 3. Leer el movimiento del jugador
    // 4. Verificar si hizo 3 en linea
    // si lo hizo diga gano
    // sino
    // cambiar el jugador
    // volver a 3

    var player = 'X';
    var board = initializeBoard();

  }

  private static char[][] initializeBoard() {
    var board = new char[3][3];
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        board[i][j] = ' ';
      }
    }
    return board;
  }

}
