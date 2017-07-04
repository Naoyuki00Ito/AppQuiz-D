import java.util.Scanner;

public class Quiz {


    public static void main(String[] args){
    //mainを置く
    	int situ1 = situmon1();
    	int situmon6 = situmon6();
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

	public void situmon2(){


	}


   public void situmon3(){


	}
   public void situmon4(){
	   System.out.println("中里の生涯のともは？");
	   System.out.println("1,香風智乃　2、天々座理世");


    }
    public void situmon5(){


    }

    public static int situmon6(){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("キツツキはどっち");
    	System.out.println("1:woodpecker  2:hummingbird");
    	System.out.println("回答:　");
    	int ss,sss;
    	for(;;){
    		ss = sc.nextInt();
    		if(ss == 1 || ss == 2){
    			break;
    		}
    	}
    	if(ss == 1){
    		System.out.println("正解です！");
    		sss = 1;
    	}else{
    		System.out.println("不正解です！");
    		sss = 0;
    	}
    	return sss;
    }

}
