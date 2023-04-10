package day10.Account;

import day07.protec.Util.Utility;

import static day07.protec.Util.Utility.*;

public class AccountView {

   public static AccountRepository repository;


   static {
       new AccountRepository();
   }

   public static void start() {

       while (true){
           System.out.println("\n*******계좌 관리 프로그램********");
           System.out.println("1.계좌 개설하기");
           System.out.println("2.입금 하기");
           System.out.println("3.출금 하기");
           System.out.println("4.현재 잔액확인하기");
           System.out.println("5.전체 계좌확인하기");
           System.out.println("6.종료하기");
           makeLine();

           String menuNum = input(">>");

           switch (menuNum){
               case "1":
                   insertAccount();
                   break;
               case "2":
                   break;
               case "3":
                   break;
               case "4":
                   break;
               case "5":
                   break;
               case "6":
                   System.out.println("시스템을 종료합니다");
                   System.exit(0);
                   break;
               default:
                   System.out.println("# 메뉴를 잘못 입력했습니다");
           }




       }


   }

    private static void insertAccount() {
        System.out.println("\n계좌 등록을 시작합니다");
        String accountId = input("아이디를 입력해주세요 : ");
        String accountPw = input("비밀번호를 입력해주세요 : ");
        String accountName = input("이름을 입력해주세요 : ");
        int accountbalance = 0;
        // 신규계좌인 경우
        if(!repository.isRegistered(accountId)){
            repository.addNewAccount(accountId, accountPw, accountName, accountbalance);
            System.out.println("신규 계좌가 등록되었습니다");
        }else {  // 기존 Id인 경우
            boolean flag = repository.addInputBalnace(accountId, Integer.parseInt(accountName));

        }
        }
}
