package progammers;

class Solution1 { //두 수의 차
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 - num2;
        return answer;
    }
}

class Solution2 { //몫 구하기
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1/num2;
        return answer;
    }
}

class Solution3 { //두 수의 곱
    public int solution(int num1, int num2) {
        int answer = 0;
        answer = num1 * num2 ;
        return answer;
    }
}

class Solution4 { //나이 출력
    public int solution(int age) {
        int answer = 0;
        answer = 2022 - age+1;
        return answer;
    }
}

class Solution5 { //나머지 구하기
    public int solution(int num1, int num2) {
        int answer = -1;
        
        answer = num1%num2;
        
        return answer;
    }
}

class Solution6 { //숫자 비교하기
    public int solution(int num1, int num2) {
        int answer = 0;
        if(num1==num2){answer = 1;}
        else{answer = -1;}
        return answer;
    }
}

class Solution7 { //두 수의 합
    public int solution(int num1, int num2) {
        int answer = -1;
        answer = num1 + num2;
        return answer;
    }
}

class Solution8 { //두 수의 나눗셈
    public int solution(int num1, int num2) {
        int answer = 0;
        double x = num1/(double)num2;
        answer = (int)(x*1000);
        return answer;
    }
}

class Solution9 { //각도기
    public int solution(int angle) {
        int answer = 0;
        
        if(0<angle && angle<90){answer = 1;}
        else if(angle==90){answer = 2;}
        else if(90<angle && angle<180){answer = 3;}
        else {answer = 4;}
        
        return answer;
    }
}

class Solution10 { //짝수의 합
    public int solution(int n) {
        int answer = 0;
        
        for(int i = 0;i<=n;i++){
            if(i%2 == 0){
                answer += i;
            }
        }   
        return answer;
    }
}

class Solution11 { //배열의 평균값
    public double solution(int[] numbers) {
        double answer = 0;
        
        for(int i=0;i<numbers.length;i++){
            answer += numbers[i];
        }
        answer = answer / numbers.length;
        
        return answer;
    }
}

class Solution12 { //양꼬치
    public int solution(int n, int k) {
        int answer = 0;
        
        //무료음료수 x
        int x = n / 10;
        
        answer = n*12000 + k*2000 - x*2000;
        
        
        return answer;
    }
}

class Solution13 { //중복된 숫자 개수
    public int solution(int[] array, int n) {
        int answer = 0;
        
        for (int i = 0;i<array.length;i++){
            if(array[i]==n){answer++;}
        }
        
        return answer;
    }
}

class Solution14 { //머쓱이보다 키 큰 사람
    public int solution(int[] array, int height) {
        int answer = 0;
        
        for(int i = 0; i<array.length ; i++){
            if(array[i] > height){answer++;}
        }
        
        return answer;
    }
}

class Solution15 { //짝수 홀수 개수
    public int[] solution(int[] num_list) {
        int x = 0; //짝
        int y = 0; //홀
        int[] answer = {x,y};
        
        for(int i = 0;i<num_list.length;i++){
            if(num_list[i]%2 ==0){x++;}
            else{y++;}
        }
        
        answer[0] = x;
        answer[1] = y;
        
        return answer;
    }
}

class Solution16 { //피자 나눠 먹기 (1)
    public int solution(int n) {
        int answer = 0;
        
        if(n%7==0){answer = n/7;}
        else{answer = n/7+1;}
        
        return answer;
    }
}

class Solution17 { //피자 나눠 먹기 (3)
    public int solution(int slice, int n) {
        int answer = 0;
        
        if(n%slice==0){answer = n/slice;}
        else {answer = n/slice+1;}
        
        return answer;
    }
}

class Solution18 { //특정 문자 제거하기
    public String solution(String my_string, String letter) {
        String answer = "";
        
        answer = my_string.replace(letter,"");
        
        return answer;
    }
}

class Solution19 { //배열 뒤집기
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];
        
        for(int i = 0;i<num_list.length;i++){
            answer[num_list.length-1-i] = num_list[i];
        }
        return answer;
    }
}

class Solution20 { //옷가게 할인받기
    public int solution(int price) {
        int answer = 0;
        
        if(price>=500000){answer = price*8/10;}
        else if(price>=300000){answer = price*9/10;}
        else if(price>=100000){answer = price*95/100;}
        else {answer = price;}
        
        return answer;
    }
}