package Ex01;

import queue23ystudent.SingleLinkedQueue23Y;

public class Ex01 {
    public static void main(String[] args) {
        SingleLinkedQueue23Y<String> fuck = new SingleLinkedQueue23Y<>();
        fuck.add("Shit");
        fuck.add("Fuck");
        fuck.add("Cunt");
        System.out.println("(1) " + fuck.element());
        System.out.println("(2) " + fuck.isEmpty());
        System.out.println("(3) Size = " + fuck.size());
        System.out.println("(4) " + fuck.remove());
        System.out.println("(5) New size = " + fuck.size());
        fuck.clear();
        System.out.println("(6) Newer size = " + fuck.size());
    }
}
