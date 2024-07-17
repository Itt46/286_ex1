/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package footshape;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class FootShape {
    private Foot foot;
    public void drawAsEllipse() {
        foot = new Ellipse();
        System.out.println(foot.draw());
    }
    public void drawAsRectangle() {
        foot = new Rectangle();
        System.out.println(foot.draw());
    }
    public static void main(String[]args){
        FootShape shape = new FootShape();
        Scanner inp = new Scanner(System.in);
        System.out.print("What to draw? 1.Ellipse, 2.Rectangle ");
        int type = inp.nextInt();
        switch(type) {
            case 1:
                shape.drawAsEllipse();
                break;
            case 2:
                shape.drawAsRectangle();
                break;
        }
        
    }
}

