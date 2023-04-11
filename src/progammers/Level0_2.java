package progammers;

import java.util.Arrays;

class Solution21 { //점의 위치 구하기
    public int solution(int[] dot) {
        int answer = 0;
        
        if(dot[0]>0){
            if(dot[1]>0){answer=1;}
            else{answer=4;}
        }
        else{
            if(dot[1]>0){answer=2;}
            else{answer=3;}
        }
        
        return answer;
    }
}

class Solution22 { //순서쌍의 개수
    public int solution(int n) {
        int answer = 0;
        
        for (int i = 1; i < n+1; i++) {
			if ((n/i) *i == n) {
				answer++;
			}
		}
        
        return answer;
    }
}

class Solution23 { //삼각형의 완성조건 (1)
    public int solution(int[] sides) {
        int answer = 0;
        
        if(sides[0]+sides[1]<=sides[2] || sides[0]+sides[2]<=sides[1] || sides[2]+sides[1]<=sides[0]){
            answer = 2;
        }else{answer = 1;}
        
        return answer;
    }
}

class Solution24 { //배열 원소의 길이
    public int[] solution(String[] strlist) {
        int[] answer = new int[strlist.length];
        for (int i = 0; i < strlist.length; i++) {
			answer[i] = strlist[i].length();
		}
        return answer;
    }
}

class Solution25 { //문자열 뒤집기
    public String solution(String my_string) {
        String answer = "";
        int x = -1;
        for(int i=0;i<my_string.length();i++){
            answer = answer.concat(my_string.charAt(my_string.length()-i-1)+"");
        }
        return answer;
    }
}

class Solution26 { //중앙값 구하기
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        answer = array[(array.length-1)/2];
        return answer;
    }
}

class Solution27 { //배열 자르기
    public int[] solution(int[] numbers, int num1, int num2) {
    	int[] answer = new int[num2-num1+1];
        for(int i = 0;i<num2-num1+1;i++){answer[i]=numbers[i+num1];}
        return answer;
    }
}