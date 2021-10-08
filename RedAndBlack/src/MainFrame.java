/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manasvi
 */
public class MainFrame extends java.awt.Frame {

    boolean colorflag = false;
    int activate[] = new int[9];

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();

        Arrays.fill(activate, 0);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bt0 = new java.awt.Button();
        bt1 = new java.awt.Button();
        bt2 = new java.awt.Button();
        bt3 = new java.awt.Button();
        bt4 = new java.awt.Button();
        bt5 = new java.awt.Button();
        bt6 = new java.awt.Button();
        bt7 = new java.awt.Button();
        bt8 = new java.awt.Button();

        setLocation(new java.awt.Point(500, 300));
        setMinimumSize(new java.awt.Dimension(500, 500));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });
        setLayout(new java.awt.GridLayout(3, 3, 1, 1));

        bt0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt0ActionPerformed(evt);
            }
        });
        add(bt0);

        bt1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt1ActionPerformed(evt);
            }
        });
        add(bt1);

        bt2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        bt2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt2ActionPerformed(evt);
            }
        });
        add(bt2);

        bt3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt3ActionPerformed(evt);
            }
        });
        add(bt3);

        bt4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt4ActionPerformed(evt);
            }
        });
        add(bt4);

        bt5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt5ActionPerformed(evt);
            }
        });
        add(bt5);

        bt6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt6ActionPerformed(evt);
            }
        });
        add(bt6);

        bt7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt7ActionPerformed(evt);
            }
        });
        add(bt7);

        bt8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt8ActionPerformed(evt);
            }
        });
        add(bt8);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * Exit the Application
     */
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void bt2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt2ActionPerformed
        // TODO add your handling code here:
        if (checkFlag()) {
            bt2.setBackground(Color.BLACK);
            bt2.setEnabled(false);
            colorflag = false;
            activate[2] = 100;
        } else {
            bt2.setBackground(Color.RED);
            bt2.setEnabled(false);
            colorflag = true;
            activate[2] = 200;
        }
        whoWon(activate[2]);


    }//GEN-LAST:event_bt2ActionPerformed

    private void bt0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt0ActionPerformed
        // TODO add your handling code here:

        if (checkFlag()) {
            activate[0] = 100;
        } else {
            activate[0] = 200;
        }

        doSomething(bt0, activate[0]);


    }//GEN-LAST:event_bt0ActionPerformed

    private void bt1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt1ActionPerformed
        // TODO add your handling code here:
        if (checkFlag()) {
            activate[1] = 100;
        } else {
            activate[1] = 200;
        }

        doSomething(bt1, activate[1]);


    }//GEN-LAST:event_bt1ActionPerformed

    private void bt3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt3ActionPerformed
        // TODO add your handling code here:
        if (checkFlag()) {
            activate[3] = 100;
        } else {
            activate[3] = 200;
        }

        doSomething(bt3, activate[3]);
    }//GEN-LAST:event_bt3ActionPerformed

    private void bt7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt7ActionPerformed
        // TODO add your handling code here:
        if (checkFlag()) {
            activate[7] = 100;
        } else {
            activate[7] = 200;
        }

        doSomething(bt7, activate[7]);
    }//GEN-LAST:event_bt7ActionPerformed

    private void bt8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt8ActionPerformed
        // TODO add your handling code here:
        if (checkFlag()) {
            activate[8] = 100;
        } else {
            activate[8] = 200;
        }

        doSomething(bt8, activate[8]);
    }//GEN-LAST:event_bt8ActionPerformed

    private void bt4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt4ActionPerformed
        // TODO add your handling code here:
        if (checkFlag()) {
            activate[4] = 100;
        } else {
            activate[4] = 200;
        }

        doSomething(bt4, activate[4]);
    }//GEN-LAST:event_bt4ActionPerformed

    private void bt5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt5ActionPerformed
        // TODO add your handling code here:
        if (checkFlag()) {
            activate[5] = 100;
        } else {
            activate[5] = 200;
        }

        doSomething(bt5, activate[5]);
    }//GEN-LAST:event_bt5ActionPerformed

    private void bt6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt6ActionPerformed
        // TODO add your handling code here:
        if (checkFlag()) {
            activate[6] = 100;
        } else {
            activate[6] = 200;
        }

        doSomething(bt6, activate[6]);
    }//GEN-LAST:event_bt6ActionPerformed

    void doSomething(Button b, int check) {

        if (checkFlag()) {
            b.setBackground(Color.BLACK);

            colorflag = false;

        } else {
            b.setBackground(Color.RED);

            colorflag = true;

        }
        b.setEnabled(false);

        whoWon(check);
    }

    boolean checkFlag() {

        return colorflag == true;
    }

    void winCheck(int check) {

        if (check == 100) {
            System.out.println("Black Won");
            new Dialog(this,"Black Won").show();

        } else {
            System.out.println("Red Won");
            new Dialog(this,"Red Won").show();

        }
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.exit(0);

    }

    void whoWon(int check) {

        if (activate[0] == check && activate[1] == check && activate[2] == check
                || activate[1] == check && activate[2] == check && activate[0] == check
                || activate[2] == check && activate[0] == check && activate[1] == check) {
            winCheck(check);

        } else if (activate[3] == check && activate[4] == check && activate[5] == check
                || activate[4] == check && activate[5] == check && activate[3] == check
                || activate[5] == check && activate[3] == check && activate[4] == check) {
            winCheck(check);

        } else if (activate[6] == check && activate[7] == check && activate[8] == check
                || activate[7] == check && activate[8] == check && activate[6] == check
                || activate[8] == check && activate[6] == check && activate[7] == check) {
            winCheck(check);
        } else if (activate[0] == check && activate[4] == check && activate[8] == check
                || activate[4] == check && activate[8] == check && activate[0] == check
                || activate[8] == check && activate[0] == check && activate[4] == check) {
            winCheck(check);
        } else if (activate[2] == check && activate[4] == check && activate[6] == check
                || activate[4] == check && activate[6] == check && activate[2] == check
                || activate[6] == check && activate[2] == check && activate[4] == check) {
            winCheck(check);
        } else if (activate[0] == check && activate[3] == check && activate[6] == check
                || activate[3] == check && activate[6] == check && activate[0] == check
                || activate[6] == check && activate[0] == check && activate[3] == check) {

            winCheck(check);
        } else if (activate[1] == check && activate[4] == check && activate[7] == check
                || activate[4] == check && activate[7] == check && activate[1] == check
                || activate[7] == check && activate[1] == check && activate[4] == check) {

            winCheck(check);
        } else if (activate[2] == check && activate[5] == check && activate[8] == check
                || activate[5] == check && activate[8] == check && activate[2] == check
                || activate[8] == check && activate[2] == check && activate[5] == check) {
            winCheck(check);
        }

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button bt0;
    private java.awt.Button bt1;
    private java.awt.Button bt2;
    private java.awt.Button bt3;
    private java.awt.Button bt4;
    private java.awt.Button bt5;
    private java.awt.Button bt6;
    private java.awt.Button bt7;
    private java.awt.Button bt8;
    // End of variables declaration//GEN-END:variables
}
