package day05.member;

public class Test {

    public static void main(String[] args) {

        MemberRepository mr = new MemberRepository();


        Member thief = new Member(4, "uuu@eee.com",
                "3243", "밥도둑",
                Gender.MALE, 22);

        mr.addMember(thief);
        mr.addMember(thief);

        mr.showMembers();

        boolean flag = mr.isDuplicateEmail("uuu@eee.com");
        System.out.println("flag = " + flag);

        // 수정 테스트
        String targetEmail = "hhh@qwe.com";
        boolean updateFlag
                = mr.changePassword(targetEmail, "8888");

        if (updateFlag) {
            Member updateMember = mr.findByEmail(targetEmail);
            System.out.println("updateMember = " + updateMember.password);
        } else {
            System.out.println("이메일이 잘못됨!");
        }

        System.out.println("==================");

        mr.showMembers();
        mr.removeMember("abc@def.com");
        mr.removeMember("hhh@qwe.com");

        mr.showMembers();

    }
}
