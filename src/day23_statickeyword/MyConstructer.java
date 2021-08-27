package day23_statickeyword;
public class MyConstructer {
    
        int x =3;
        int y =5;
        
        MyConstructer () {
            x+=1;
            System.out.println("-x"+x);       
        }
        
        MyConstructer (int i) {
            this();
            
            this.y=i;
            x+=y;
            System.out.println("-x"+x);
            }
        
        MyConstructer (int i, int i2) {
            this(3);
            
            this.x-=4;
            System.out.println("-x"+x);
        }
        public static void main(String[] args) {
            MyConstructer mc1 = new MyConstructer (4,3);
        }
    }
