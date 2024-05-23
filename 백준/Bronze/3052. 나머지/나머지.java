import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList arrlist = new ArrayList();
        int count = 10;

        // ArrayList 에 값 넣기 & 나머지 값으로 변경 저장
        for (int i = 0; i < count; i++) {
            arrlist.add(sc.nextInt());
            int result = (int) arrlist.get(i) % 42;
            arrlist.set(i, result);
            // System.out.println(arrlist);
        }

        // 반복문을 통해 ArrayList 값을 다른 값들과 비교하기
        for (int i = 0; i < arrlist.size() - 1; i++) {
            for (int j = i + 1; j < arrlist.size(); j++) {
                if (arrlist.get(j) == arrlist.get(i)) {
                    count--;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}

