package kr.ac.kopo.day10.homework;

import java.util.Random;

//지면 0 return
//이기면 1 return
//비기면 2 return

public class ScissorsRockPaper implements Game{
	
	final static int SCISSOR = 1; // 가위
	final static int ROCK = 2; // 바위
	final static int PAPER = 3; // 보
	
	public int startGame(int you) {

		int me = 0;
		Random r = new Random();
		me = r.nextInt(3) + 1;
		
		//비긴거 먼저 처리
		if(me == you) {
			System.out.println("비겼습니다.");
			return 2;
			
		}
		//이긴경우 1 return
		//컴퓨터 가위
		else if(me == 1) {
			
			if(you == 3) System.out.println("You lose");

	
			
			else  {
				System.out.println("You win");
				return 1;
			}
			
		}
		//컴퓨터 바위
		else if(me == 2) {
			
			if(you == 1) {
				System.out.println("You lose");
			}
			
			else {
				System.out.println("You win");
				return 1;
			}
			
		}
		//컴퓨터 보
		else {
			if(you == 2) System.out.println("You lose");
			
			else {
				System.out.println("You win");
				return 1;
			}
			
		}
		
		
		return 0; // 진 경우
	}
	
}
