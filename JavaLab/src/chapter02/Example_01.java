package chapter02;

public class Example_01 {
    public static void main(String[] args) {
        // 534개의 책(books)을 학생(students) 30명에게 똑같은 갯수로 나눠줄 때,
		// 학생당 몇개씩 가지고, 최종적으로 몇개 남는지 구해보기

		int books = 534;
		int students = 30;

		// 학생당 한 명이 가지는 책의 수
        int booksPerStudent= (books / students);
        System.out.println(booksPerStudent);

        //남의 책의 수 (a%b)
        int bookLeft = (books % students);
        System.out.println(bookLeft);
        System.out.println("한명당" + booksPerStudent +"권씩," + bookLeft + "권씩 남습니다." );

        String status = (bookLeft == 0) ? "모두 나눠짐" : "재고 발생";
        System.out.println(status);


        System.out.println("------------------------------");

        //피자 47조각을 친구 6명에게 똑같이 나눠줄 때
        //한 명당 몇 조각을 가지고, 몇 조각 남는지 구해보기

        int slices = 47;
        int friends = 6;

        //한명당 가지는 조각 수 
        int slicePerFriend = (slices / friends);
        System.out.println(slicePerFriend);
        
        //남는 조각 수 
        int slicesLeft = (slices % friends);
        System.out.println(slicesLeft);
        System.out.println("한 명당" + slicePerFriend + "조각씩," + slicesLeft + "조각 남습니다.");

        String situation = (slicesLeft ==0) ? "딱 나누어떨어짐" : "조각이 남음";
        System.out.println(situation);



    }
}
