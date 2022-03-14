package collection;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Ex11_4 {
    static Queue q = new LinkedList();
    static final int MAX_SIZE = 5;	// Queue에 최대 5개까지만 저장되도록 한다.

    public static void main(String[] args) {
        System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");

        while(true) {
            System.out.print(">>");
            try {
                // 화면으로부터 라인단위로 입력받는다.
                Scanner s = new Scanner(System.in);
                String input = s.nextLine().trim();

                if("".equals(input)) continue;

                if(input.equalsIgnoreCase("q")) {
                    System.exit(0); // 프로그램 종료.
                } else if(input.equalsIgnoreCase("help")) {
                    System.out.println(" help - 도움말을 보여줍니다.");
                    System.out.println(" q 또는 Q - 프로그램을 종료합니다.");
                    System.out.println(" history - 최근에 입력한 명령어를 "
                            + MAX_SIZE +"개 보여줍니다.");
                } else if(input.equalsIgnoreCase("history")) {
//                    int i=0;
                    // 입력받은 명령어를 저장하고,
                    save(input);

                    // LinkedList의 내용을 보여준다.
                    // queue에는 메소드가 별로 없기 때문에 이걸로는 queue에 있는 내용을 보여주기 어렵다.
                    LinkedList tmp = (LinkedList)q;
//                    ListIterator it = tmp.listIterator();// 잘안슴
//                    while(it.hasNext())
//                        System.out.println(++i+"."+it.next());
                    final int SIZE = tmp.size();
                    for (int i = 0; i<SIZE; i++){
                        System.out.println((i+1)+ "." + tmp.get(i));
                    }
                } else {
                    save(input);
                    System.out.println(input);
                } // if(input.equalsIgnoreCase("q")) {
            } catch(Exception e) {
                System.out.println("입력오류입니다.");
            }
        } // while(true)
    } //  main()
    public static void save(String input) { // Queue에 명령어를 저장하는 메소드
        // queue에 저장한다.
        if(!"".equals(input))
            q.offer(input); // 큐에 명령어를 저장. input이 null일수 있기 때문에 이렇게 쓰는 것임.
        // if(input!=null && !input.equal("")
        // queue의 최대크기를 넘으면 제일 처음 입력된 것을 삭제한다.
        if(q.size() > MAX_SIZE)  // size()는 Collection인터페이스에 정의
            q.poll();
    }
} // end of class