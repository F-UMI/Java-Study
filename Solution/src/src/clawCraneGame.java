package src;

import java.util.Stack;
//뭐가 문제일까
class Solution {

  public int solution(int[][] board, int[] moves) {
    int answer = 0;
    Stack<Integer> basket = new Stack<>();
    basket.push(moves[0]);
    for (int i = 1; i < moves.length; i++) {
      if (moveToBasket(basket, peekPuppet(board, moves[i]))) {
        if (peekPuppet(board, moves[i]) == 0) {
          continue;
        }
        answer += 2;
      }

    }
    for (int i = 0; i < board.length; i++) {
      for (int j = 0; j < board.length; j++) {
        System.out.print(board[i][j]);
      }
      System.out.println();
    }
    while (!basket.empty()) {
      System.out.println(basket.pop());
    }
    return answer;
  }

  private int peekPuppet(int[][] board, int moves) {
    int puppet = 0;
    for (int i = 0; i < board.length; i++) {
      if (board[i][moves - 1] != 0) {
        puppet = board[i][moves - 1];
        board[i][moves - 1] = 0;

        break;
      }
    }
    return puppet;
  }

  private boolean moveToBasket(Stack<Integer> basket, int puppet) {
    if (basket.peek() == puppet) {
      basket.pop();
      return true;
    } else {
      basket.push(puppet);
      return false;
    }
  }


}