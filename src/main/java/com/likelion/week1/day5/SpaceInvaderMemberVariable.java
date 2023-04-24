package com.likelion.week1.day5;

public class SpaceInvaderMemberVariable {

    int location;
    public void moveLeft() {
        location = location - 1;
    }

    public void moveRight() {
        location = location + 1;
    }

    public static void main(String[] args) {
        SpaceInvaderMemberVariable sp = new SpaceInvaderMemberVariable();
        sp.moveLeft();
        sp.moveLeft();
        sp.moveRight();
        sp.moveRight();
        sp.moveRight();
        sp.moveRight();
        sp.moveRight();

        System.out.println("최종 위치 = " + sp.location);
        sp.moveRight();
        System.out.println("최종 위치 = " + sp.location);
    }
}
