package example;

public class Arrexam01 {
    public static void main(String[] args) {
     // for문을 이용하여 다음 배열 점수의 총점과 평균을 줄단위로 출력하시오.
		int[][] array = { { 95, 86 }, { 83, 92, 96 }, { 78, 83, 93, 87, 88 } };

		double avg = 0;
		int count = 0; // 평균에서 사용하는 수
		int sum[] = new int[3];
     
	        for(int i=0;i<array.length;i++){ //행
            for(int j=0;j<array[i].length;j++){ //열
                sum[i]+=array[i][j];
                count++;
            }//for
            System.out.println("각 행의 합: "+ sum[i]);
            avg=sum[i] / (double)count;
            System.out.printf("각행의 평균: %.3f\n",avg);
            System.out.println("------------------");
            count=0;
    // for문을 이용 -> 각 행을 가져와서 / 각행의 열을 읽어서
    // sum에 누적하고(count++) 평균까지 구하여 출력           


        }

    }//main
}//class
