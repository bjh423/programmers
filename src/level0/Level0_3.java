package level0;

import java.util.*;

class Solution41 { // 중복된 숫자 개수
	public int solution(int[] array, int n) {
		int answer = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] == n) {
				answer++;
			}
		}
		return answer;
	}
}

class Solution42 { // 문자열 안에 문자열
	public int solution(String str1, String str2) {
		int answer = 0;
		if (str1.contains(str2)) {
			answer = 1;
		} else {
			answer = 2;
		}
		return answer;
	}
}

class Solution43 { // 제곱수 판별하기
	public int solution(int n) {
		for (int i = 1; i * i <= n; i++) {
			if (i * i == n) {
				return 1;
			}
		}
		return 2;
	}
}

class Solution44 { // 숫자찾기
	public int solution(int num, int k) {
		String num2 = String.valueOf(num);
		String k2 = String.valueOf(k);

		if (num2.contains(k2)) {
			return num2.indexOf(k2) + 1;
		}
		return -1;
	}
}

class Solution44_2 { // 숫자찾기
	public int solution(int num, int k) {
		int count = 0;// 총 자리수
		int count2 = 0;// k와 동일한 수의 자릿수(뒤에서부터 n번째)
		int answer = 0;// 가장 왼쪽에 있는 k의 위치저장

		while (num > 0) {
			count2++;
			count++;
			if (num % 10 == k) {
				answer = count;
			}
			num = num / 10;
		}

		if (answer == 0) {
			return -1;
		} else {
			return count2 - answer + 1;
		}
	}
}