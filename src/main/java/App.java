import entities.Diem;
import entities.TamGiac;

import java.util.Scanner;

public class App {
  public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.print("x,y = ");
    // String str = sc.nextLine();
    // Diem d1 = Diem.parseFromString(str);
    // System.out.println(d1);

    Diem d2 = new Diem();
    System.out.println(d2);

    d2.setX(4);
    d2.setY(3);
    System.out.println(d2);

    d2.setX(14);
    d2.setY(13);
    System.out.println(d2);

    Diem d3 = new Diem(2, 2);
    System.out.println(d3);

    Diem d4 = Diem.generate();
    System.out.println(d4);
    System.out.println(d4.detectQuadrant());
    System.out.println("------------------");

    double n = d2.distance(d3);
    System.out.println(n);

    System.out.println(d3.findCentralSymmetry());
    System.out.println(d3.findXAxisSymmetry());
    System.out.println(d3.findYAxisSymmetry());

    System.out.println("------------------");

    TamGiac tg1 = new TamGiac();
    System.out.println(tg1);

    System.out.format("P = %f\n", tg1.calculatePerimeter());
    System.out.format("S = %f\n", tg1.calculateArea());
  }
}
