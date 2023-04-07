package day10.generic;

import java.util.Arrays;
import java.util.Map;

// 배열을 제어하는 설계도
public class MyList<V> {

    // 필드
    private Object[] sArr;

    // 생성자
    public MyList() {
//        System.out.println("StringList 생성자 끌려옴");
        sArr = new Object[0];
    }

    public MyList(V... initData) {
        sArr = new Object[initData.length];
        for (int i = 0; i < sArr.length; i++) {
            sArr[i] = initData[i];
        }
    }


    // 메서드
    // 배열에 저장된 데이터 수를 알려주는 기능
    public int size() {
        return sArr.length;
    }

    // 배열에 맨 끝에 데이터를 추가하는 기능
    public void push(V newData) {
        Object[] temp = new Object[sArr.length + 1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        temp[temp.length - 1] = newData;
        sArr = temp;
    }
    // 배열 맨 끝 데이터 삭제하는 기능
    public V pop() {
        Object deleteTarget = sArr[sArr.length - 1];
        Object[] temp = new Object[sArr.length - 1];
        for (int i = 0; i < temp.length; i++) {
            temp[i] = sArr[i];
        }
        sArr = temp;
        return (V) deleteTarget;
    }

    // 배열 내부데이터 출력
    public String toString() {
        return Arrays.toString(sArr);
    }

    // 배열이 텅텅비었는지 확인
    public boolean isEmpty() {
        return sArr.length == 0;
    }
    // 배열 데이터 전체삭제
    public void clear() {
        sArr = new Object[0];
    }

    // 인덱스 탐색 (indexOf)
    public int indexOf(V target) {
        for (int i = 0; i < sArr.length; i++) {
            if (target.equals(sArr[i])) {
                return i;
            }
        }
        return -1;
    }

    // 자료 유무 확인 (includes)
    public boolean includes(V target) {
        return indexOf(target) != -1;
    }

    // 중간 삭제 (remove) : 인덱스로 삭제
    public V remove(int index) {
        if (index < 0 || index > sArr.length - 1) return null;

        Object targetData = sArr[index];
        for (int i = index; i < sArr.length - 1; i++) {
            sArr[i] = sArr[i + 1];
        }
        pop();
        return (V) targetData;
    }
    // 중간 삭제 (remove) : 값으로 삭제
    public V remove(V target) {
        return remove(indexOf(target));
    }

    // 중간 삽입 (insert)
    public void insert(int index, V newData) {

        if (index < 0 || index > sArr.length - 1) return;
        if (index == sArr.length - 1) push(newData);

        Object[] temp = new Object[sArr.length + 1];
        for (int i = 0; i < sArr.length; i++) {
            temp[i] = sArr[i];
        }
        for (int i = temp.length - 1; i > index; i--) {
            temp[i] = temp[i-1];
        }
        temp[index] = newData;
        sArr = temp;
    }

    public Object[] getsArr() {
        return sArr;
    }
}