package lesson4;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Member member1 = new Member("Alex", "programmer", "+79992020909", 5000, 55);
        Member member2 = new Member("Peter", "tester", "+799148880999", 2000, 30);
        Member member3 = new Member("Sam", "support", "+76668907654", 1500, 25);
        Member member4 = new Member("John", "tester", "+79914855555", 2200, 45);
        Member member5 = new Member("Mike", "support", "+76668933333", 1600, 41);


        Member[] members = {member1, member2, member3, member4, member5};

        System.out.println("Выводим сотрудников старше 40 лет:\n");

        for (int i = 0; i < members.length; i++) {
            if (members[i].getAge() > 40) System.out.println(members[i].getMember());
        }

    }
}

