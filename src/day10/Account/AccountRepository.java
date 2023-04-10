package day10.Account;

import day04.array.StringList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class AccountRepository {

    public static Map<String, Account> accountList;

    static {
        accountList = new HashMap<>();
    }

    // 신규 계좌를 개설하는 기능
    public void addNewAccount(String name, String id, String pw, int balnace){
        Account account = new Account(id, new HashSet<>(), pw, balnace);
        account.getId().add(id);

        // account Map에 해당 Id 객체 추가
        accountList.put(account.getName(),account);
        accountList.put(account.getPw(),account);
        accountList.put(String.valueOf(account.getBalance()),account);
    }
    // 아이디 명을 받아서 해당 아이디가 등록된 아이디 인지 확인하는 기능
    public boolean isRegistered(String id){
        return accountList.containsKey(id);
    }
    // 아이디명을 통해 아이디 객체 정보를 반환하는 기능
    public Account findAccountById(String id){
        return accountList.get(id);
    }

    // 기존 아이디에 잔액을 추가하는 기능
    // 입금하는 기능
    public boolean addInputBalnace(String id, int balnace){
        Account account = findAccountById(id);
        boolean flag = account.getId().add(String.valueOf(balnace));
    return flag;
    }

    // 출금하는 기능
    public boolean addOutputBalnace(String id, int balnace){
        Account account = findAccountById(id);
        boolean flag = account.getId().add(String.valueOf(balnace));
        return flag;
    }
    // 현재잔액을 조회하는 기능
    public void nowAccountBalnace(String id){
        Account  account = findAccountById(id);
        account.getBalance();
    }
    // 등록된 전체 계좌를 조회하는 기능
    public void allAccount(){
        for (String key : accountList.keySet()) {
            System.out.println(accountList);
        }
    }



}
