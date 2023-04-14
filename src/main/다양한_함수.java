package main;

public class 다양한_함수 {

}


//char[] two = new char[2];
//sno.getChars(4, 6, two, 0); 
//원본인 String인 sno에서 4~5을 추출해서
//char[]인 two에 인덱스 0부터 넣어주세요.

//  분리하는 방법?? 
//    1)String배열-split()
//		String[] stringArray = sno.split("");
//		int count = 0;
//		for (String s : stringArray) { //{"2","0","5","6","5","2","1"}
//			if(s.equals("5")) { 
//				count++;
//			}
//		}
//		System.out.println(count);
//		

//    2)charAt(i)
//		String sno = "2056521";
//		int count2 = 0;
//		for (int i = 0; i < sno.length(); i++) {
//			char c = sno.charAt(i);
//			if (c == '5') {
//				count2++;
//			}
//		}
//  인덱스를 빨리 찾는 방법(함수)
//		System.out.println(Arrays.binarySearch(stringArray, "5"));
//		
//  배열에 특정한 값을 한꺼번에 변경할 수 있는 함수
//		Arrays.fill(stringArray, 0, 3, "hoho");
//		System.out.println(Arrays.toString(stringArray));
//		
//  배열의 순서를 다 뒤집는 방법(함수) 
//		Arrays.sort(stringArray); //정렬(오름차순)
//		//Arrays로 내림차순을 할 수는 있으나 너무 복잡
//		//==>컬렉션으로 변환해서 하면 더 간단.
//		System.out.println(Arrays.toString(stringArray));
//		
//		List<String> list = Arrays.asList(stringArray);
//		Collections.sort(list); //정렬(오름차순)
//		Collections.reverse(list); //정렬(내림차순)
//		System.out.println(list);
//		
//  배열안에 데이터의 빈도수(횟수)구하는 방법(함수) 
//		int count3 = Collections.frequency(list, "hoho");
//		System.out.println(count3);