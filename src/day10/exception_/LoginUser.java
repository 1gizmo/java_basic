package day10.exception_;

public class LoginUser {

    // throw 에러를 발생시킴 (경고)

    String userAccount; // 가입된 계정명
    String userPassword; // 가입시 설정한 패스워드

    public LoginUser(String userAccount, String userPassword) {
        this.userAccount = userAccount;
        this.userPassword = userPassword;
    }
    // 로그인 검증
    public String loginValidate(String inputAccount, String inputPassword)
            throws LoginValidateException{

        // 회원 게정이 존재하는가  ?
        if(userAccount.equals(inputAccount)){
            // 패스워드가 일치하는가 ?
            if(userPassword.equals(inputPassword)){
                //로그인성공
                return "SUCCESS";
            }else {
                //패스워드가 틀림
                throw new LoginValidateException(" 야 임마 ! 비밀번호 똑바로 쳐라 !");
            }
        }else {
            // 계정 정보가 틀림
            throw new LoginValidateException(" 회원가입을 쳐 하세요 ~ ! ");
        }



    }


}
