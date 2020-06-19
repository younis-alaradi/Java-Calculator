import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;

public class Calculator_showing extends JFrame
{
    private JTabbedPane tabbedPane1;
    private JPanel calcu;

    public  double num1=0.0;
    public  double num2=0.0;
    public  double Result=0.0;
    private JButton btn00;
    private JButton pointValue;
    private JButton Equal;
    private JButton Daivid;
    private JTextField textDisplay;
    private JButton Models;
    private JButton CE;
    private JButton C;
    private JButton btn7;
    private JButton btn8;
    private JButton btn9;
    private JButton btn4;
    private JButton btn5;
    private JButton btn6;
    private JButton btn3;
    private JButton btn2;
    private JButton btn1;
    private JButton Mines;
    private JButton plus;
    private JButton btnM;
    private JButton p_min;
    private JButton DeleteB;
    private JButton SinButton;
    private JButton CosButton;
    private JButton TanButton;
    private ImageIcon icon;

    private JButton equal_btn;
    private JButton point_btn;
    private JButton Zero_btn;
    private JButton Plus_mines_btn;
    private JButton F_button;
    private JButton X_button;
    private JButton Mines_btn;
    private JButton plus_btn;
    private JButton btn_3;
    private JButton btn_2;
    private JButton btn_1;
    private JButton E_btn;
    private JButton Divid_btn;
    private JButton Delete_btn;
    private JButton btn_6;
    private JButton btn_9;
    private JButton btn_5;
    private JButton btn_4;
    private JButton btn_D;
    private JButton btn_c;
    private JButton btn_7;
    private JButton btn_8;
    private JButton Models_btn;
    private JButton left_btn;
    private JButton right_btn;
    private JButton B_btn;
    private JButton A_btn;
    private JButton LSH_btn;
    private JButton RSH_btn;
    private JButton C_btn;
    private JTextField pr_textFild;
    private JButton HEXButton;
    private JButton BIN_button;
    private JButton OCT_button;
    private JButton DEC_button;
    private JButton AND_btn;
    private JButton OR_btn;
    private JButton NOT_btn;
    private JButton NAND_btn;
    private JButton NOR_btn;
    private JButton XOR_btn;
    private JRadioButton offRadioButton;
    private JRadioButton onRadioButton;
    private JPanel programming_panel;
    private JPanel Sincetfic;
    private String operation1;
    protected int n1,n2,rA;


    private void setAllnum (String num)
    {
        String allN = textDisplay.getText() + num;
        textDisplay.setText(allN);
    }

    public void enable()
    {
        onRadioButton.setEnabled(false);
        offRadioButton.setEnabled(true);
        Zero_btn.setEnabled(true);
        equal_btn.setEnabled(true);
        point_btn.setEnabled(true);
        X_button.setEnabled(true);
        Plus_mines_btn.setEnabled(true);
        F_button.setEnabled(false);
        Mines_btn.setEnabled(true);
        plus_btn.setEnabled(true);
        btn_3.setEnabled(true);
        btn_2.setEnabled(true);
        btn_1.setEnabled(true);
        E_btn.setEnabled(false);
        Divid_btn.setEnabled(true);
        Delete_btn.setEnabled(true);
        btn_6.setEnabled(true);
        btn_9.setEnabled(true);
        btn_5.setEnabled(true);
        btn_4.setEnabled(true);
        btn_D.setEnabled(false);
        btn_c.setEnabled(false);
        btn_7.setEnabled(true);
        btn_8.setEnabled(true);
        Models_btn.setEnabled(true);
        left_btn.setEnabled(true);
        right_btn.setEnabled(true);
        B_btn.setEnabled(false);
        A_btn.setEnabled(false);
        LSH_btn.setEnabled(true);
        RSH_btn.setEnabled(true);
        btn_c.setEnabled(false);
        pr_textFild.setEnabled(true);
        HEXButton.setEnabled(true);
        BIN_button.setEnabled(true);
        OCT_button.setEnabled(true);
        DEC_button.setEnabled(true);
        AND_btn.setEnabled(true);
        OR_btn.setEnabled(true);
        NOT_btn.setEnabled(true);
        NAND_btn.setEnabled(true);
        NOR_btn.setEnabled(true);
        XOR_btn.setEnabled(true);

    }
    public void disable()
    {
        onRadioButton.setEnabled(true);
        offRadioButton.setEnabled(false);
        Zero_btn.setEnabled(false);
        equal_btn.setEnabled(false);
        point_btn.setEnabled(false);
        X_button.setEnabled(false);
        Plus_mines_btn.setEnabled(false);
        F_button.setEnabled(false);
        Mines_btn.setEnabled(false);
        plus_btn.setEnabled(false);
        btn_3.setEnabled(false);
        btn_2.setEnabled(false);
        btn_1.setEnabled(false);
        E_btn.setEnabled(false);
        Divid_btn.setEnabled(false);
        Delete_btn.setEnabled(false);
        btn_6.setEnabled(false);
        btn_9.setEnabled(false);
        btn_5.setEnabled(false);
        btn_4.setEnabled(false);
        btn_D.setEnabled(false);
        btn_c.setEnabled(false);
        btn_7.setEnabled(false);
        btn_8.setEnabled(false);
        Models_btn.setEnabled(false);
        left_btn.setEnabled(false);
        right_btn.setEnabled(false);
        B_btn.setEnabled(false);
        A_btn.setEnabled(false);
        LSH_btn.setEnabled(false);
        RSH_btn.setEnabled(false);
        C_btn.setEnabled(false);
        btn_c.setVisible(false);

        pr_textFild.setEnabled(false);
        pr_textFild.setText(" ");
        HEXButton.setEnabled(false);
        BIN_button.setEnabled(false);
        OCT_button.setEnabled(false);
        DEC_button.setEnabled(false);
        AND_btn.setEnabled(false);
        OR_btn.setEnabled(false);
        NOT_btn.setEnabled(false);
        NAND_btn.setEnabled(false);
        NOR_btn.setEnabled(false);
        XOR_btn.setEnabled(false);
        A_btn.setVisible(false);
        B_btn.setVisible(false);
        C_btn.setVisible(true);
        btn_D.setVisible(false);
        E_btn.setVisible(false);
        F_button.setVisible(false);

    }
    protected void HEX_Enable()
    {      A_btn.setVisible(true);
        A_btn.setEnabled(true);
        B_btn.setVisible(true);
        B_btn.setEnabled(true);
        btn_c.setVisible(true);
        btn_c.setEnabled(true);
        btn_D.setVisible(true);
        btn_D.setEnabled(true);
        E_btn.setVisible(true);
        E_btn.setEnabled(true);
        F_button.setVisible(true);
        F_button.setEnabled(true);


    }

    public Calculator_showing() {
        setSize(500,520);
        setTitle("Calculator");
        add(calcu);
        icon = new ImageIcon("Calcu.png");
        setIconImage(icon.getImage());







        btn00.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ////////////Button for number 0 //////////////
                String bt0 = textDisplay.getText() ;
                textDisplay.setText(bt0);
                setAllnum("0");

            }
        });

        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//////Button for number 1 ////////
                String btone = textDisplay.getText() ;
                textDisplay.setText(btone);
                setAllnum("1");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {/////button for number 2 /////////
                setAllnum("2");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//////////Button fot number 3 ////////////
                setAllnum("3");
            }
        });

        pointValue.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {////////////point///////////
                setAllnum(".");
            }
        });
        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {////////number 4 ///////////
                setAllnum("4");

            }
        });
        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {////////number 5//////////
                setAllnum("5");
            }
        });
        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//////number6//////
                setAllnum("6");

            }
        });
        btn7.addActionListener(new ActionListener() {////////number 7/////////
            @Override
            public void actionPerformed(ActionEvent e) {

                setAllnum("7");
            }
        });
        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//////////number 8/////////
                setAllnum("8");

            }
        });
        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {//////////NUMBER 9 ///////////////

                setAllnum("9");
            }
        });


        C.addActionListener(new ActionListener() {///////clear number/////
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText("");
            }
        });
        CE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num2 = 0;
                textDisplay.setText("");
            }
        });
        plus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textDisplay.getText());
                textDisplay.setText(" ");
                operation1 = "+";

            }
        });

        Mines.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {////////plus///////
                num1 = Double.parseDouble(textDisplay.getText());
                textDisplay.setText(" ");
                operation1 = "-";

            }
        });
        btnM.addActionListener(new ActionListener() {///////////multiply/////
            @Override
            public void actionPerformed(ActionEvent e) {////////plus///////
                num1 = Double.parseDouble(textDisplay.getText());
                textDisplay.setText(" ");
                operation1 = "*";


            }
        });
        Models.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textDisplay.getText());
                textDisplay.setText(" ");
                operation1 = "%";

            }
        });
        Daivid.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(textDisplay.getText());
                textDisplay.setText(" ");
                operation1 = "/";
            }
        });
        p_min.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num = Double.parseDouble(textDisplay.getText());
                num = num * (-1);
                textDisplay.setText(String.valueOf(num));
            }
        });
        SinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num = Double.parseDouble(textDisplay.getText());
                textDisplay.setText("Sin(" + num + ")");
                num = Math.toRadians(num);
                num = Math.sin(num);
                textDisplay.setText("\n" + num);
                JOptionPane.showMessageDialog(SinButton, "The number automatic converted to radians");

            }
        });
        CosButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num = Double.parseDouble(textDisplay.getText());
                num = Math.toRadians(num);
                num = Math.cos(num);
                textDisplay.setText(String.valueOf(num));
                JOptionPane.showMessageDialog(CosButton,"The number automatic converted to radians " );

            }
        });
        TanButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num = Double.parseDouble(textDisplay.getText());
                num = Math.toRadians(num);
                num = Math.tan(num);
                textDisplay.setText(String.valueOf(num));
                JOptionPane.showMessageDialog(TanButton, "The number automatic converted to radians ");

            }
        });

        Equal.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                num2 = Double.parseDouble(textDisplay.getText());
                if (operation1 == "+") {
                    Result = num1 + num2;
                    textDisplay.setText(String.valueOf(Result));
                }
                if (operation1 == "-") {
                    Result = num1 - num2;
                    textDisplay.setText(String.valueOf(Result));
                }
                if (operation1 == "/") {
                    Result = num1 / num2;
                    textDisplay.setText(String.valueOf(Result));
                }
                if (operation1 == "*") {
                    Result = num1 * num2;
                    textDisplay.setText(String.valueOf(Result));
                }
                if (operation1 == "%") {
                    Result = num1 % num2;
                    textDisplay.setText(String.valueOf(Result));
                }
            }
        });

        DeleteB.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(" ");
            }

        });
        Zero_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt0 = pr_textFild.getText() + Zero_btn.getText();
                setAllnum("0");
                pr_textFild.setText(bt0);

            }
        });
        btn_1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt = pr_textFild.getText() + btn_1.getText();
                setAllnum("1");
                pr_textFild.setText(bt);

            }
        });
        btn_2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt = pr_textFild.getText() + btn_2.getText();
                setAllnum("2");
                pr_textFild.setText(bt);


            }
        });
        btn_3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt = pr_textFild.getText() + btn_3.getText();
                setAllnum("3");
                pr_textFild.setText(bt);

            }
        });
        btn_4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt = pr_textFild.getText() + btn_4.getText();
                setAllnum("4");
                pr_textFild.setText(bt);

            }
        });
        btn_5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt = pr_textFild.getText() + btn_5.getText();
                setAllnum("5");
                pr_textFild.setText(bt);

            }
        });
        btn_6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt = pr_textFild.getText() + btn_6.getText();
                setAllnum("6");
                pr_textFild.setText(bt);


            }
        });
        btn_7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt = pr_textFild.getText() + btn_7.getText();
                setAllnum("7");
                pr_textFild.setText(bt);

            }
        });
        btn_8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt = pr_textFild.getText() + btn_8.getText();
                setAllnum("8");
                pr_textFild.setText(bt);

            }
        });
        btn_9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt = pr_textFild.getText() + btn_9.getText();
                setAllnum("9");
                pr_textFild.setText(bt);

            }
        });
        Mines_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(pr_textFild.getText());
                pr_textFild.setText(" ");
                operation1 = "-";
            }
        });
        plus_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(pr_textFild.getText());
                pr_textFild.setText(" ");
                operation1 = "+";
            }
        });
        X_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(pr_textFild.getText());
                pr_textFild.setText(" ");
                operation1 = "*";
            }
        });
        Divid_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(pr_textFild.getText());
                pr_textFild.setText(" ");
                operation1 = "/";
            }
        });
        Models_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 = Double.parseDouble(pr_textFild.getText());
                pr_textFild.setText(" ");
                operation1 = "%";
            }
        });
        point_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt = pr_textFild.getText() + btn_1.getText();
                pr_textFild.setText(bt);
                setAllnum(".");

            }
        });
        Plus_mines_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num = Double.parseDouble(pr_textFild.getText());
                num = num * (-1);
                pr_textFild.setText(String.valueOf(num));
            }
        });
        C_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pr_textFild.setText(" ");
            }
        });
        Delete_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                pr_textFild.setText("");


            }
        });

        A_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String bt = pr_textFild.getText();
                A_btn.setText("A");
                pr_textFild.setText("10");


            }
        });
        B_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                A_btn.setText("B");
                pr_textFild.setText("11");

            }
        });
        btn_c.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                A_btn.setText("C");
                pr_textFild.setText("12");
            }
        });
        btn_D.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                A_btn.setText("D");
                pr_textFild.setText("13");
            }
        });
        E_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                A_btn.setText("E");
                pr_textFild.setText("14");

            }
        });
        F_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                A_btn.setText("F");
                pr_textFild.setText("15");
            }
        });


        offRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disable();

            }
        });
        onRadioButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enable();

            }
        });
        BIN_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = pr_textFild.getText();
                int i = Integer.parseInt(s);
                String si = Integer.toBinaryString(i);
                pr_textFild.setText(si);
            }
        });
        OCT_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String s = pr_textFild.getText();
                int i = Integer.parseInt(s);
                String si = Integer.toOctalString(i);
                pr_textFild.setText(si);
            }
        });
        DEC_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = Integer.parseInt(pr_textFild.getText());
                pr_textFild.setText(String.valueOf(i));
            }
        });
        HEXButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                HEX_Enable();
                String s = pr_textFild.getText();
                int i = Integer.parseInt(s);
                String si = Integer.toHexString(i);
                pr_textFild.setText(si);


            }
        });
        AND_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Integer.parseInt(pr_textFild.getText());
                pr_textFild.setText("");
                operation1 = "&";

            }
        });
        OR_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Integer.parseInt(pr_textFild.getText());
                pr_textFild.setText("");
                operation1 = "OR";

            }
        });
        XOR_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Integer.parseInt(pr_textFild.getText());
                pr_textFild.setText("");
                operation1 = "^";

            }
        });
        RSH_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Integer.parseInt(pr_textFild.getText());
                pr_textFild.setText("");
                operation1 = ">>";

            }
        });
        LSH_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Integer.parseInt(pr_textFild.getText());
                pr_textFild.setText("");
                operation1 = "<<";

            }
        });
        NOT_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Integer.parseInt(pr_textFild.getText());
                pr_textFild.setText("");
                operation1 = "~";

            }
        });
        NOR_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Integer.parseInt(pr_textFild.getText());
                pr_textFild.setText("");
                operation1 = "M>";

            }
        });
        NAND_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                n1 = Integer.parseInt(pr_textFild.getText());
                pr_textFild.setText("");
                operation1 = "l.";

            }
        });
        equal_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                num2 = Double.parseDouble(pr_textFild.getText());
                n2 = Integer.parseInt(pr_textFild.getText());

                if (operation1 == "+") {
                    Result = num1 + num2;
                    pr_textFild.setText(String.valueOf(Result));
                }
                if (operation1 == "-") {
                    Result = num1 - num2;
                    pr_textFild.setText(String.valueOf(Result));
                }
                if (operation1 == "/") {
                    Result = num1 / num2;
                    pr_textFild.setText(String.valueOf(Result));
                }
                if (operation1 == "*") {
                    Result = num1 * num2;
                    pr_textFild.setText(String.valueOf(Result));
                }
                if (operation1 == "%") {
                    Result = num1 % num2;
                    pr_textFild.setText(String.valueOf(Result));
                }
                if (operation1 == "&") {
                    rA = n1 & n2;
                    pr_textFild.setText(String.valueOf(rA));
                }
                if (operation1 == "OR") {
                    rA = n1 | n2;
                    pr_textFild.setText(String.valueOf(rA));
                }
                if (operation1 == "^") {
                    rA = n1 ^ n2;
                    pr_textFild.setText(String.valueOf(rA));
                }
                if (operation1 == ">>") {
                    rA = n1 >> n2;
                    pr_textFild.setText(String.valueOf(rA));
                }
                if (operation1 == "<<") {
                    rA = n1 << n2;
                    pr_textFild.setText(String.valueOf(rA));
                }
                if (operation1 == "~") {

                    rA = ~n1;
                    pr_textFild.setText(String.valueOf(rA));
                }
                if (operation1 == "M>") {
                    rA = ~(n1 | n2);
                    pr_textFild.setText(String.valueOf(rA));
                }
                if (operation1 == "l.") {
                    rA = ~(n1 & n2);
                    pr_textFild.setText(String.valueOf(rA));
                }

            }
        });



    }

}






