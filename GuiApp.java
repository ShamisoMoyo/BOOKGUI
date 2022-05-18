/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.cput.BookGUI;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Shamiso
 */
public class GuiApp extends JFrame implements ActionListener {

 
    JPanel panel1, panel2, panel3;
    JLabel heading, lblTitle, lblSub, lblAuth, lblDesc, lblRat, lblCom, lblISBN, lblPrice;
    JTextField txtTitle, txtSub, txtAuth, txtDesc, txtRat, txtCom, txtISBN, txtPrice;
    JButton btnUpdate, btnCancel;
    
    public GuiApp() {
        super("Update Book");
        
        
        heading = new JLabel("Please enter the required information to add a book to your collection");
        // center
        lblTitle = new JLabel("Title:");
        lblSub = new JLabel("Subtitle:");
        lblAuth = new JLabel("Author:");
        lblDesc = new JLabel("Description:");
        lblRat = new JLabel("Rating:");
        lblCom = new JLabel("Comment:");
        lblISBN = new JLabel("ISBN:");
        lblPrice = new JLabel("Price:");
        
        lblTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lblSub.setHorizontalAlignment(SwingConstants.CENTER);
        lblAuth.setHorizontalAlignment(SwingConstants.CENTER);
        lblDesc.setHorizontalAlignment(SwingConstants.CENTER);
        lblRat.setHorizontalAlignment(SwingConstants.CENTER);
        lblCom.setHorizontalAlignment(SwingConstants.CENTER);
        lblISBN.setHorizontalAlignment(SwingConstants.CENTER);
        lblPrice.setHorizontalAlignment(SwingConstants.CENTER);
        
        txtTitle = new JTextField("");
        txtSub = new JTextField("");
        txtAuth = new JTextField("");
        txtDesc = new JTextField("");
        txtRat = new JTextField("");
        txtCom = new JTextField("");
        txtISBN = new JTextField("");
        txtPrice = new JTextField("");
        
        btnUpdate = new JButton("Update");
        btnCancel = new JButton("Cancel");
        
        panel1 = new JPanel();
        panel2 = new JPanel();
        panel3 = new JPanel();
        panel2.setLayout(new GridLayout(8, 2));
        
        
        panel1.add(heading);
        
        panel2.add(lblTitle);
        panel2.add(txtTitle);
        
        panel2.add(lblSub);
        panel2.add(txtSub);
        
        panel2.add(lblAuth);
        panel2.add(txtAuth);
        
        panel2.add(lblDesc);
        panel2.add(txtDesc);
        
        panel2.add(lblRat);
        panel2.add(txtRat);
        
        panel2.add(lblCom);
        panel2.add(txtCom);
        
        panel2.add(lblISBN);
        panel2.add(txtISBN);
        
        panel2.add(lblPrice);
        panel2.add(txtPrice);
        
        // panel 3 add btn
        panel3.add(btnUpdate);
        panel3.add(btnCancel);

        this.add(panel1, BorderLayout.NORTH);
        this.add(panel2, BorderLayout.CENTER);
        this.add(panel3, BorderLayout.SOUTH);
        
        this.setVisible(true);
        this.setSize(800, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public void setGUI (){
        setVisible(true);
    }
    
    public static void main(String[] args) {
        
        new GuiApp();
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

