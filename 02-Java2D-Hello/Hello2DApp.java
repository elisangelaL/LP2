//ARQUIVO MODIFICADO

public static class Hello2DApp {
        public static void main (String[] args) {
            Hello2DFrame frame = new Hello2DFrame();
        }
    }


    static class Hello2DFrame extends JFrame {
        public Hello2DFrame () {
            this.addWindowListener (
                    new WindowAdapter() {
                        public void windowClosing (WindowEvent e) {
                            System.exit(0);
                        }
                    }
            );
            this.setTitle("Java2D - Hello World!");
            this.getContentPane().setBackground(Color.RED);//mudando cor de background
            this.setSize(450, 150);//mudando o tamanho do frame
            this.setVisible(true);//torna o frame visivel
        }

        public void paint (Graphics g) {
            super.paint(g);

            g.setColor( Color.BLUE );
            g.drawRect( 5, 40, 90, 55 );
            g.drawRect( 5, 40, 90, 55 );

            Graphics2D g2d = (Graphics2D) g;

            g2d.setPaint(Color.yellow);

            int w = getWidth();
            int h = getHeight();
            g2d.drawLine(0,0, w,h);
            g2d.drawLine(0,h, w,0);

        }
    }
}
