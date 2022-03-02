package src;

import java.util.Stack;

class Solution {

  public int solution(int[][] board, int[] moves) {
    int answer = 0;
    Stack<Integer> basket = new Stack<>();
    for (int move : moves) {
      if (moveToBasket(basket, peekPuppet(board, move))) {
        answer++;
      }
    }
    return answer;
  }

  private int peekPuppet(int[][] board, int moves) {
    int puppet = 0;
    for (int i = 0; i <= board.length; i++) {
      if (board[i][moves] != 0) {
        puppet = board[i][moves];
        board[i][moves] = 0;
      }
    }
    return puppet;
  }

  private boolean moveToBasket(Stack<Integer> basket, int puppet) {
    IsEmpty(basket, puppet);
    if (basket.peek() == puppet) {
      basket.pop();
      return true;
    } else {
      basket.push(puppet);
      return false;
    }
  }

  private void IsEmpty(Stack<Integer> basket, int puppet) {
    if (basket.empty()) {
      basket.push(puppet);
    }
  }

}