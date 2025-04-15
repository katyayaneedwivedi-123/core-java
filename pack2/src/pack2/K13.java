package pack2;
import java.util.ArrayList;

public class K13 extends ArrayList{
        public static void main(String[] args) {
                K13 list1 = new K13();
                list1.add(90);
                list1.add(190);
                list1.add(910);
                list1.add(901);
                list1.add(290);
                System.out.println(list1);
                list1.removeRange(1, 3);
                System.out.println(list1);
        }
}
