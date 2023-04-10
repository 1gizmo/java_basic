package day10.Account;

import java.util.HashSet;
import java.util.Set;

public class Account {

    private String name; // 사용자 이름
    private Set<String> id; // 사용자 계정 ID
    private String pw; // 사용자 계정 비밀번호\
    private int balance; // 계좌 잔고

    public Account(String name, Set<String> id, String pw, int balance) {
        this.name = name;
        this.id = id;
        this.pw = pw;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<String> getId() {
        return id;
    }

    public void setId(Set<String> id) {
        this.id = id;
    }

    public String getPw() {
        return pw;
    }

    public void setPw(String pw) {
        this.pw = pw;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }
}