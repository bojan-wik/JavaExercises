package hackerrank.methodoverriding;

public class Solution {

    public static void main(String[] args) {

        Sports sports = new Sports();
        Soccer soccer = new Soccer();

        System.out.println(sports.getName());
        sports.getNumberOfTeamMembers();
        System.out.println(soccer.getName());
        soccer.getNumberOfTeamMembers();
    }
}
