package collection;

public class IntQueue {
    private int max; // queue의 용량
    private int front;  // 첫 번째 요소 커서
    private int rear;   // 마지막 요소 커서
    private int num;    // 현재 데이터 수
    private int[] que;  // 큐 본체

    // 큐가 비어 있을 때 예외 발생
    class EmptyIntQueueException extends RuntimeException{
        public EmptyIntQueueException(){};
    }
    // 큐가 가득 찼을 때 예외 발생
    class OverFlowIntQueueException extends RuntimeException{
        public OverFlowIntQueueException(){};
    }
    // 생성자
    public IntQueue(int capacity){
        num = 0; front = 0; rear = 0;
        max = capacity;
        try {
            que = new int[max]; // queue 본체용 배열 생성.
        }catch (OutOfMemoryError e){
            e.printStackTrace();
            max = 0;    // OutOfMemoryError 발생시 생성 할 수 없음/
        }
    }
    // queue에 데이터 enque (넣기)
    public int enque(int x) throws OverFlowIntQueueException{
        if (num >= max) throw new OverFlowIntQueueException();  // queue가 가득 참
        que[rear++] = x;
        num ++;
        if (rear == max) rear = 0; // rear가  max와 같아지면 실제 배열에는 없는 공간인 que[max]를 가리킴.
        return x;
    }
    public int deque() throws EmptyIntQueueException{
        if (num <= 0) throw new EmptyIntQueueException();   // 큐가 비어있음.
        int x = que[front++]; // 첫번째 요소부터 하나씩 뺌. 
        num--;  // 데이터 수 하나 감소.
        if (front == max) front = 0;
        return x;
    }
    public int peek() throws EmptyIntQueueException{
        if (num <= 0) throw new EmptyIntQueueException();
        return que[front];
    }
    public int indexOf(int x){
        for (int i = 0; i < num; i++) { // 데이터 개수 만큼 돈다.
            // rear쪽으로 선형 검색.
            int idx = (i + front) % max;
            if (que[idx] == x) return idx;      // 검색 성공
        }
        return -1;      //검색 실패
    }
}
