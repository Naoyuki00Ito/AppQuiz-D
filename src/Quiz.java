import java.util.Scanner;

public class Quiz {


    public static void main(String[] args){
    //mainを置く
    	int situ1 = situmon1();
        int situmon2 = situmon2();
    	//質問内容
    	//
    }


	public static  int situmon1(){
		int answer = 0;
		//内容表示
		//回答(男性　女性)
		//ユーザー答え
		return answer;
	}

	public static int situmon2(){
		int answer = 0;
		//内容表示
		System.out.print("ヒデが飼っているワンちゃんの名前は？");
		//回答
		System.out.print("1.クッキー 2.ビスケット 3.クラッカー 4.ポチ");
		Scanner sc = new Scanner(System.in);
		answer = sc.nextInt();
		sc.close();
		//答え
		return answer;
	}


   public void situmon3(){


	}
   public void situmon4(){
	   System.out.println("中里の生涯のともは？");
	   System.out.println("1,香風智乃　2、天々座理世");


    }
    public void situmon5(){


    }

    public void situmon6(){


    }

}
