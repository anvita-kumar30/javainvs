import java.awt.*;
public class Checkbox {
    Checkbox(){
        Frame f=new Frame("Checkbox Example");
        Checkbox c1=new Checkbox("Drawing");
        c1.setBounds(100,100,50,50);
        Checkbox c2=new Checkbox("Sketching",true);
        c2.setBounds(100,150,50,50);
        f.add(c1);
        f.add(c2);
        f.setSize(400,400);
        f.setVisible(true);
        f.setLayout(null);
    }
    public static void main(String args[]){
        new Checkbox();
    }
}
