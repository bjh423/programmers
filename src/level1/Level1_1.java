package level1;

import java.util.Arrays;

class Solution1 { // 나누어 떨어지는 숫자배열
	public int[] solution(int[] arr, int divisor) {
		int x = 0;
		int y = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % divisor == 0) {
				x++;
			}
		}
		if (x == 0) {
			x = 1;
			y = 1;
		}
		int[] answer = new int[x];
		if (y == 1) {
			answer[0] = -1;
		} else {
			x = 0;
			for (int i = 0; i < arr.length; i++) {
				if (arr[i] % divisor == 0) {
					answer[x] = arr[i];
					x++;
				}
			}

		}
		Arrays.sort(answer);
		return answer;
	}
}