import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt(); // 테스트 케이스 수 입력 받기

        for (int tc = 1; tc <= T; tc++) { // 각 테스트 케이스 반복
            int n = sc.nextInt(); // 현재 테스트 케이스에서 의상 수 입력
            Map<String, Integer> map = new HashMap<>(); // 종류와 수를 저장할 HashMap 생성

            for (int i = 0; i < n; i++) { // n개의 의상 입력 반복
                String name = sc.next(); // 의상이름 입력, 사용되지는 않음
                String type = sc.next(); // 의상종류 입력
                map.put(type, map.getOrDefault(type, 0) + 1); // 의상 종류를 키로, 해당 종류 의상 수를 값으로 HashMap에 저장. 
                // defaultValue 는 0으로 해당 의상 종류가 처음 등장하면 0+1로 1, 기존에 해당 종류가 이미 있으면 해당값 + 1 로 업데이트
            }

            int result = 1; // 최종 조합수를 계산할 변수 초기화
            for (int val : map.values()) // HashMap에 저장된 각 의상의 종류별 의상 수를 반복 조회
                result *= val + 1; // 각 의상 종류별로 그 종류의 의상을 입지 않는 경우를 포함하여 경우의 수를 계산
            System.out.println(result - 1); // 모든 조합의 수에서 아무 것도 입지 않는 경우를 제외하기 위해 -1, 결과 출력
        }
    }
}
