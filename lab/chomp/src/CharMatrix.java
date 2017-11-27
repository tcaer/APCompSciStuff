/**
 * Implements a 2-D array of characters
 */

public class CharMatrix
{
  // Fields:
  private char[][] grid;
  private final char space = ' ';

  /**
   * Constructor: creates a grid with dimensions rows, cols,
   * and fills it with spaces
   */
  public CharMatrix(int rows, int cols)
  {
    grid = new char[rows][cols];

      for (int x = 0; x < grid.length; x++) {
          for (int y = 0; y < grid[x].length; y++) {
              grid[x][y] = space;
          }
      }
  }

  /**
   * Constructor: creates a grid with dimensions rows , cols ,
   * and fills it with the fill character
   */
  public CharMatrix(int rows, int cols, char fill)
  {
    grid = new char[rows][cols];

    for (int x = 0; x < grid.length; x++) {
        for (int y = 0; y < grid[x].length; y++) {
            grid[x][y] = fill;
        }
    }
  }

  /**
   * Returns the number of rows in grid
   */
  public int numRows()
  {
   return grid.length;
  }

  /**
   * Returns the number of columns in grid
   */
  public int numCols()
  {
    return grid[0].length;
  }

  /**
   * Returns the character at row, col location
   */
  public char charAt(int row, int col)
  {
    return grid[row][col];
  }

  /**
   * Sets the character at row, col location to ch
   */
  public void setCharAt(int row, int col, char ch)
  {
   grid[row][col] = ch;
  }

  /**
   * Returns true if the character at row, col is a SPACE,
   * false otherwise
   */
  public boolean isEmpty(int row, int col)
  {
      char var = grid[row][col];

      if (var == ' ') {
        return true;
      }

    return false;
     // return charAt(row,col) == ' ';
  }

  /**
   * Fills the given rectangle with the fill characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void fillRect(int row0, int col0, int row1, int col1, char fill)
  {
      for (int x = row0; x < row1; x++) {
          for (int y = col0; y < col1; y++) {
              grid[x][y] = fill;
          }
      }
  }

  /**
   * Fills the given rectangle with the SPACE characters.
   * row0, col0 is the upper left corner and row1, col1 is the
   * lower right corner of the rectangle.
   */
  public void clearRect(int row0, int col0, int row1, int col1)
  {
      System.out.println("Foo");
      for (int x = row0; x < row1; x++) {
          for (int y = col0; y < col1; y++) {
              grid[x][y] = ' ';
          }
      }
  }

  /**
   * Returns the count of all non-SPACE characters in row.
   */
  public int countInRow(int row)
  {
      int count = 0;

      for (int y = 0; y < grid[row].length; y++) {
          if (grid[row][y] != ' ') {
              count++;
          }
      }

      return count;
  }

  /**
   * Returns the count of all non-SPACE characters in col.
   */
  public int countInCol(int col)
  {
      int count = 0;

      for (int x = 0; x < grid.length; x++) {
          for (int y = 0; y < grid[x].length; y++) {
              if (y == col) {
                  if (grid[x][y] == ' ') {
                      count++;
                  }
              }
          }
      }

      return count;
  }
}
