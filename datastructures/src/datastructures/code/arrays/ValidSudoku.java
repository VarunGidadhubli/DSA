package datastructures.code.arrays;

import java.util.HashSet;

public class ValidSudoku {

	public static void main(String[] args) {

		char[][] board = {
			    {'5','3','4','6','7','8','9','1','2'},
			    {'6','7','2','1','9','5','3','4','8'},
			    {'1','9','8','3','4','2','5','6','7'},
			    {'8','5','9','7','6','1','4','2','3'},
			    {'4','2','6','8','5','3','7','9','1'},
			    {'7','1','3','9','2','4','8','5','6'},
			    {'9','6','1','5','3','7','2','8','4'},
			    {'2','8','7','4','1','9','6','3','5'},
			    {'3','4','5','2','8','6','1','7','9'}
			};
		
		System.out.println(isRowUnique(board));
		System.out.println(isColumnUnique(board));
		System.out.println(is3x3Unique(board));
	}
	
	private static boolean isRowUnique(char[][] board) {
		
		for(int i=0;i<board.length;i++) {
			
			HashSet<Integer> set=new HashSet<Integer>();
			
			for(int j=0;j<board[i].length;j++) {
				
				if(!set.contains(Character.getNumericValue(board[i][j]))) {
					set.add(Character.getNumericValue(board[i][j]));
				}else {
					return false;
				}
			}
		}
		
		return true;
	}
	
	private static boolean isColumnUnique(char[][] board) {

		for(int i=0;i<board.length;i++) {

			HashSet<Integer> set=new HashSet<Integer>();

			for(int j=0;j<board[i].length;j++) {

				if(!set.contains(Character.getNumericValue(board[j][i]))) {
					set.add(Character.getNumericValue(board[j][i]));
				}else {
					return false;
				}
			}
		}

		return true;
	}
	
	private static boolean is3x3Unique(char[][] board) {

	    for (int row = 0; row < 9; row += 3) {

	        for (int col = 0; col < 9; col += 3) {

	            HashSet<Integer> set = new HashSet<>();

	            for (int i = row; i < row + 3; i++) {

	                for (int j = col; j < col + 3; j++) {

	                    int value = Character.getNumericValue(board[i][j]);

	                    if (set.contains(value)) {
	                        return false;
	                    }

	                    set.add(value);
	                }
	            }
	        }
	    }

	    return true;
	}
}