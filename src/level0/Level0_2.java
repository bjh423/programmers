package level0;

import java.util.Arrays;

class Solution21 { // 점의 위치 구하기
	public int solution(int[] dot) {
		int answer = 0;

		if (dot[0] > 0) {
			if (dot[1] > 0) {
				answer = 1;
			} else {
				answer = 4;
			}
		} else {
			if (dot[1] > 0) {
				answer = 2;
			} else {
				answer = 3;
			}
		}

		return answer;
	}
}

class Solution22 { // 순서쌍의 개수
	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i < n + 1; i++) {
			if ((n / i) * i == n) {
				answer++;
			}
		}

		return answer;
	}
}

class Solution23 { // 삼각형의 완성조건 (1)
	public int solution(int[] sides) {
		int answer = 0;

		if (sides[0] + sides[1] <= sides[2] || sides[0] + sides[2] <= sides[1] || sides[2] + sides[1] <= sides[0]) {
			answer = 2;
		} else {
			answer = 1;
		}

		return answer;
	}
}

class Solution24 { // 배열 원소의 길이
	public int[] solution(String[] strlist) {
		int[] answer = new int[strlist.length];
		for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}
		return answer;
	}
}

class Solution25 { // 문자열 뒤집기
	public String solution(String my_string) {
		String answer = "";
		int x = -1;
		for (int i = 0; i < my_string.length(); i++) {
			answer = answer.concat(my_string.charAt(my_string.length() - i - 1) + "");
		}
		return answer;
	}
}

class Solution25_2 { // 문자열 뒤집기
	public String solution(String my_string) {
		String answer = "";
		int x = -1;
		for (int i = 0; i < my_string.length(); i++) {
			answer = answer.concat(my_string.charAt(my_string.length() - i - 1) + "");
		}
		return answer;
	}
}

class Solution26 { // 중앙값 구하기
	public int solution(int[] array) {
		int answer = 0;
		Arrays.sort(array);
		answer = array[(array.length - 1) / 2];
		return answer;
	}
}

class Solution27 { // 배열 자르기
	public int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = new int[num2 - num1 + 1];
		for (int i = 0; i < num2 - num1 + 1; i++) {
			answer[i] = numbers[i + num1];
		}
		return answer;
	}
}

class Solution27_2 { // 배열 자르기_다른풀이
	public int[] solution(int[] numbers, int num1, int num2) {
		int[] answer = Arrays.copyOfRange(numbers, num1, num2);
		return answer;
	}
}

class Solution28 { // 문자 반복 출력하기
	public String solution(String my_string, int n) {
		String answer = "";
		for (int i = 0; i < my_string.length(); i++) {
			for (int j = 0; j < n; j++) {
				answer = answer + my_string.charAt(i);
			}
		}
		return answer;
	}
}

class Solutio29 { // 짝수는 싫어요
	public int[] solution(int n) {
		int x = 0;
		if (n % 2 == 0) {
			x = n / 2;
		} else {
			x = n / 2 + 1;
		}
		int[] answer = new int[x];
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0) {
				answer[(i - 1) / 2] = i;
			}
		}
		return answer;
	}
}

class Solution30 { // 최대값 만들기 (1)
	public int solution(int[] numbers) {
		int answer = 0;
		int max = 0;
		int max2 = 0;
		int temp = 0;

		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] > max2) {
				max2 = numbers[i];
				if (max2 > max) {
					temp = max;
					max = max2;
					max2 = temp;
				}
			}
		}
		answer = max2 * max;

		return answer;
	}
}

class Solution31 { // 배열 두배 만들기
	public int[] solution(int[] numbers) {
		int[] answer = new int[numbers.length];
		for (int i = 0; i < answer.length; i++) {
			answer[i] = numbers[i] * 2;
		}
		return answer;
	}
}

class Solution32 { // 아이스 아메리카노
	public int[] solution(int money) {
		int[] answer = { 0, 0 };
		answer[0] = money / 5500;
		answer[1] = money - 5500 * answer[0];
		return answer;
	}
}

class Solution33 { // 모음 제거
	public String solution(String my_string) {
		String answer = "";
		my_string = my_string.replace("a", "");
		my_string = my_string.replace("i", "");
		my_string = my_string.replace("o", "");
		my_string = my_string.replace("u", "");
		my_string = my_string.replace("e", "");
		answer = my_string;
		return answer;
	}
}

class Solution34 { // 배열의 유사도
	public int solution(String[] s1, String[] s2) {
		int answer = 0;
		for (int i = 0; i < s1.length; i++) {
			for (int j = 0; j < s2.length; j++) {
				if (s1[i].equals(s2[j])) {
					answer++;
				}
			}

		}
		return answer;
	}
}

class Solution35 { // 편지
	public int solution(String message) {
		int answer = 0;
		answer = message.length() * 2;
		return answer;
	}
}

class Solution36 { // 자릿수 더하기
	public int solution(int n) {
		int answer = 0;
		while (n / 10 != 0) {
			answer += n - ((n / 10) * 10);
			n = n / 10;
		}
		answer += n - ((n / 10) * 10);
		return answer;
	}
}

class Solution36_2 { // 자릿수 더하기
	public int solution(int n) {
		int answer = 0;
		String x = String.valueOf(n);
		for (int i = 0; i < x.length(); i++) {
			answer += Integer.parseInt(String.valueOf(x.charAt(i)));
		}
		return answer;
	}
}

class Solution37 { // 숨어있는 숫자의 덧셈 (1)
	public int solution(String my_string) {
		int answer = 0;
		my_string = my_string.toLowerCase();
		my_string = my_string.replaceAll("[qwertyuiopasdfghjklzxcvbnm]", "");
		System.out.println("my_string : " + my_string);
		for (int i = 0; i < my_string.length(); i++) {
			answer += (int) my_string.charAt(i) - 48;
		}
		return answer;
	}
}

class Solution38 { // 머쓱이보다 키 큰 사람
	public int solution(int[] array, int height) {
		int answer = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > height) {
				answer++;
			}
		}

		return answer;
	}
}

class Solution39 { // 분수의 덧셈
	public int[] solution(int numer1, int denom1, int numer2, int denom2) {
		int[] answer = new int[2];
		int x = denom1 * numer2 + numer1 * denom2;
		int y = denom1 * denom2;
		int z = 0;
		int max = 1;
		if (x > y) {
			z = y;
		} else {
			z = x;
		}

		for (int i = 1; i <= z; i++) {
			if (x % i == 0 && y % i == 0) {
				max = i;
			}
		}
		answer[0] = x / max;
		answer[1] = y / max;

		return answer;
	}
}

class Solution40 { // 개미 군단
	public int solution(int hp) {
		int answer = hp / 5 + (hp % 5) / 3 + (hp % 5) % 3;
		return answer;
	}
}