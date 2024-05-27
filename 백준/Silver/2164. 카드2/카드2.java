import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
 
public class Main {
 	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);		
		Queue<Integer> q = new LinkedList<>(); 
        // 자료형을 표기하면 해당 자료형만 삽입,삭제 가능 / 자료형을 표기하지 않으면 다른 타입도 가능
		
		int N = in.nextInt();
		
		for(int i = 1; i <= N; i++) {
			q.offer(i); // 값 삽입, 반환 값(boolean) true / false 반환
		}
		
		while(q.size() > 1) {
			q.poll(); // 맨앞 원소 버림 / 반환 값(삭제value자료형): 삭제value / 공백 큐이면 null반환
			q.offer(q.poll()); // 맨 앞 원소를 버리고 버려진 원소를 맨 뒤에 삽입 
		}
		
		System.out.println(q.poll()); // 마지막 원소 출력 
	}
}