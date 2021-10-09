//Lv1_부족한 금액 계산하기 (9) 21.10.09 // https://programmers.co.kr/learn/courses/30/lessons/82612
class CalculateLackMoney {
    private static int tmp;
	public long solution(int price, int money, int count) {
        long answer = -1;
        tmp = price;
        long total = 0L;
        for (int i = 1; i <= count; i++) {
        price = tmp * i;
        total += price;
//        System.out.println(price + "=" + tmp +"*" + count + "//" + total);
        }
        if (total < money || total == money) {
			return 0;
		}
        if (total > money) {
			answer = total - money;
		}
        return answer;
    }
} 