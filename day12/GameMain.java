package kr.ac.kopo.day10.homework;

import java.util.Scanner;

public class GameMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int total_game = 0;
		int win = 0;
		int lose = 0;
		int tie = 0;
	
		
		while(true) {
			
			System.out.println("-------------------------");
			System.out.println("게임을 선택하세요");
			System.out.println("A. 가위바위보");
			System.out.println("B. 주사위 값 맞추기");
			System.out.println("C. 종료");
			System.out.println("-------------------------");
			System.out.print("> ");
			String input = sc.nextLine();
			
			int user_input = 0;
			
			if(input.equals("A")) {
				
				System.out.println("-------------------------");
				System.out.println("가위바위보 게임입니다.");
				System.out.println("가위바위보중 하나를 선택하세요.");
				System.out.println("1:가위, 2:바위, 3:보");
				System.out.println("-------------------------");
				System.out.print("> ");
				
				while(true) {
					
					user_input = sc.nextInt();
					
					if(user_input >= 1&& user_input <= 3) {
						
						Game g = new ScissorsRockPaper();
						int game_check = g.startGame(user_input);
						if(game_check == 2) tie++;
						else if(game_check == 0) lose++;
						else win++;
						
						break;
					}
					
					else System.out.print("다시 입력해주세요(1:가위, 2:바위, 3:보 ) : ");
					
				}
				
			}
			
			else if(input.equals("B")) {
				
				System.out.println("-------------------------");
				System.out.println("주사위 값 맞추기 게임입니다.");
				System.out.println("주사위를 선택하세요(1~6값 중 하나)");
				System.out.println("-------------------------");
				System.out.print("> ");
				
				while(true) {
				
					user_input = sc.nextInt();
					
					if(user_input >= 1 && user_input <= 6) {
						
						Game g = new Dice();
						int game_check = g.startGame(user_input);
						if(game_check == 0) lose++;
						else win++;
						break;
					}
					
					else System.out.print("다시 입력해주세요(1 ~ 6) : ");
					
				}
			}
			
			else if(input.equals("C")) {
				
				System.out.println("-------------------------");
				System.out.println("게임을 종료합니다.");
				System.out.println("당신의 게임 전적은 " + total_game + "전 " + win + "승 " + lose + "패 " + tie + "무입니다." );
				System.out.println("-------------------------");
				break;
				
			}
			
			else {
				System.out.println("다시 입력하세요(A~C) : ");
				input = sc.nextLine();
				continue; // continue 처리로 입력 다시받으면서 total_game값 조절 가능
			}
			
			sc.nextLine();
			
			total_game++;
		}
		
	}

}
