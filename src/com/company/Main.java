package com.company;

public class Main {

    public static void main(String[] args) {
	ComputerScience cs = new ComputerScience(17, "Dima Fedoruk" , "Комп'ютерні науки" );
    cs.info();
    cs.semester(1);
   Management m = new Management(18, "Oleg Kozhuzhko","gfgf");
   System.out.println("___________________________________________________________________________");
   System.out.println("                          Наступний студент");
   Ecology e = new Ecology(20,"Vlad", "Екологія");
   e.info();
   e.well(1);
   cs.sum(m,e);
   System.out.println(" fdg " +cs.sum(m,e));
    }
}
