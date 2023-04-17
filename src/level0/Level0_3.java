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

class Solution44 { // 숫자 찾기
	public int solution(int num, int k) {
		String num2 = String.valueOf(num);
		String k2 = String.valueOf(k);

		if (num2.contains(k2)) {
			return num2.indexOf(k2) + 1;
		}
		return -1;
	}
}

class Solution44_2 { // 숫자 찾기
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

class Solution45 { // 대문자와 소문자
	public String solution(String my_string) {
		String answer = "";
		String[] answer1 = my_string.split("");
		String[] lower = my_string.toLowerCase().split("");
		String[] upper = my_string.toUpperCase().split("");
		for (int i = 0; i < answer1.length; i++) {
			if (answer1[i].equals(lower[i])) {
				answer = answer.concat(upper[i]);
			} else {
				answer = answer.concat(lower[i]);
			}
		}

		return answer;
	}
}

class Solution46 { // 암호해독
	public String solution(String cipher, int code) {
		String answer = "";
		String[] x = cipher.split("");
		StringBuilder y = new StringBuilder();
		for (int i = code - 1; i < x.length; i += code) {
			y.append(x[i]);
		}
		answer = y.toString();
		return answer;
	}
}

class Solution47 { // 가위 바위 보
	public String solution(String rsp) {
		String answer = "";
		for (int i = 0; i < rsp.length(); i++) {
			System.out.println(rsp.charAt(i));
			switch (rsp.charAt(i)) {
			case '0':
				answer += "5";
				break;
			case '2':
				answer += "0";
				break;
			case '5':
				answer += "2";
				break;
			}
		}
		System.out.println(answer);
		return answer;
	}
}

class Solution48 { // 세균 증식
	public int solution(int n, int t) {
		for (int i = 1; i <= t; i++) {
			n = n * 2;
		}
		return n;
	}
}

class Solution49 { // 주사위의 개수
	public int solution(int[] box, int n) {
		int answer = 0;
		answer = (box[0] / n) * (box[1] / n) * (box[2] / n);
		return answer;
	}
}

class Solution50 { // 문자열 정렬하기 (1)
	public int[] solution(String my_string) {
		String a = "";
		String[] x = my_string.split("");
		Arrays.sort(x);
		for (int i = 0; i < x.length; i++) {
			switch (x[i]) {
			case "0":
			case "1":
			case "2":
			case "3":
			case "4":
			case "5":
			case "6":
			case "7":
			case "8":
			case "9":
				a += x[i];
				break;
			default:
				break;
			}
		}
		String[] b = a.split("");
		
		int[] answer = new int[b.length];
		
		for (int i = 0; i < b.length; i++) {
			answer[i] = Integer.parseInt(b[i]);
		}
		
		return answer;
	}
}


class Solution51 { //직각삼각형 출력하기
	public void solution() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
			for (int j = 0; j < i+1; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
    }
}

class Solution52 { //피자 나눠 먹기 (2)
    public int solution(int n) {
        int answer = 0;
        int x = n%3;
        int y = n%2;

        if(x==0 &&y==0){
            answer = n/6;
        }else if(x!=0 && y==0){
            answer = n/2;
        }else if(x==0 && y!=0){
            answer = n/3;
        }else {answer = n;}
        
        return answer;
    }
}

class Solution53 { // n의 배수 고르기
    public int[] solution(int n, int[] numlist) {
    	List list = new ArrayList();
    	
        for (int i = 0; i < numlist.length; i++) {
			if (numlist[i]%n==0) {
				list.add(numlist[i]);
			}
		}
        
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
			answer[i] = (int)list.get(i);
		}

        return answer;
    }
}

class Solution54 { //A를 B로 만들기
    public int solution(String before, String after) {
        int answer = 0;
        char[] x = before.toCharArray();
        char[] y = after.toCharArray();
        Arrays.sort(x);
        Arrays.sort(y);
        if (Arrays.equals(x, y)) {
			answer = 1;
		}
        return answer;
    }
}