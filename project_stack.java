import java.util.*;

public class project_stack {


    public static void main(String[] args) {




        ArrayList<String> 스택 = new ArrayList<String>(); //ArrayList 를 사용해서 저장공간을 지정해줄 필요가 없다.
        String 값;


        while (true) {
            System.out.println("스택 프로그램 , 숫자를 통해 기능 선택. \n" + "1.삽입 2.삭제 3.읽기 4.종료\n" + "숫자 입력해주세요.");
            Scanner scanner = new Scanner(System.in);
            int 숫자 = scanner.nextInt();
            switch (숫자) {
                case 1:
                    while (true) {
                        System.out.println("삽입할 단어 : ");
                        값 = scanner.next();
                        스택.add(값);
                        System.out.println("삽입이 더 필요한가요?\n" + "1.있다 2.없다");
                        int 선택지 = scanner.nextInt();
                        if (선택지 == 2) {
                            System.out.println("스택 내용" + 스택 + "\n=====================================");
                            break;
                        } else if (선택지 == 1) {
                            continue;
                        }
                    }
                    continue;


                case 2:

                    System.out.println(스택);
                    System.out.println("삭제하기");
                    스택.remove(스택.get(스택.size()-1));


//                    while (it.hasNext()) {
//                        String 삭제할값 = it.next();
//                        it.remove();
//                    }

//                    for (String 삭제할값: 스택){
//                        System.out.println("삭제할값:" + 삭제할값);
//                        스택.remove(삭제할값);
//                    }

                    System.out.println("현재 스택값" + 스택 + "\n=====================================");
                    System.out.println("다른 기능이 필요한가요?\n" + "1.있다 2.없다");
                    int 선택지 = scanner.nextInt();
                    if (선택지 == 2) {

                        break;
                    } else if (선택지 == 1) {
                        continue;
                    }
                    continue;

                case 3:
                    System.out.println("1.스택전체읽기 2.top인덱스 읽기 3.종료하기");

                        int 선택지1 = scanner.nextInt();

                        if (선택지1 == 1) {
                            System.out.println(스택);
                            continue;
                        } else if (선택지1 == 2) {

                            System.out.println(스택.get(스택.size() - 1));
                            continue;
                        }


                case 4:
                    System.out.println("프로그램 종료합니다.");
                    break;
            }
            break;


        }
    }
}