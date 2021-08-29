package za.ac.cput.psmanager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author FrancielSebastiao
 */
public class JailCellManager extends JFrame implements ActionListener{
    private JFrame mainFrame;
    private JButton btnCheckCellAvailability;
    private JButton btnAddPrisoner;
    private JButton btnRemovePrisoner;
    private JButton btnAddVisitor;
    private JButton btnRemoveVisitor;
    private JButton btnSearch;
    
    private JPanel panelCenter;
    
    private Font font1;

    Insets btnInsets = new Insets(5,5,5,5);
    
        public void JailCell(){
        JButton btnRegisterCell = new JButton ("Register Cell");
        btnRegisterCell.setForeground(Color.BLACK);
        
        JButton btnCheckCellAvailability = new JButton ("Check Cell Availability");
        btnCheckCellAvailability.setForeground(Color.BLACK);

        JButton btnAddPrisoner = new JButton ("Add Prisoner");
        btnAddPrisoner.setForeground(Color.BLACK);

        JButton btnRemovePrisoner = new JButton ("Remove Prisoner");
        btnRemovePrisoner.setForeground(Color.BLACK);

        JButton btnAddVisitor = new JButton ("Add Visitor");
        btnAddVisitor.setForeground(Color.BLACK);

        JButton btnRemoveVisitor = new JButton ("Remove Visitor"); 
        btnRemoveVisitor.setForeground(Color.BLACK);

        JButton btnSearch = new JButton ("Search"); 
        btnSearch.setForeground(Color.BLACK);
        
        panelCenter.add(btnRegisterCell);
        panelCenter.add(btnCheckCellAvailability);
        panelCenter.add(btnAddPrisoner);
        panelCenter.add(btnRemovePrisoner);
        panelCenter.add(btnAddVisitor);
        panelCenter.add(btnRemoveVisitor);
        panelCenter.add(btnSearch);
        panelCenter.validate();
                                
    }
    
    public void runJailCellManager(){

        panelCenter.add(btnCheckCellAvailability);
        panelCenter.add(btnAddPrisoner);
        panelCenter.add(btnRemovePrisoner);
        panelCenter.add(btnAddVisitor);
        panelCenter.add(btnRemoveVisitor);
        panelCenter.add(btnSearch);
        panelCenter.validate();
        mainFrame.add(panelCenter);

        btnAddPrisoner.addActionListener(new ActionListener(){
        @Override
        public void actionPerformed(ActionEvent click) {
            if(click.getSource()== btnAddPrisoner){
                JLabel newBooking = new JLabel("New Booking");
            
                JLabel lastName = new JLabel("Last Name");
                JTextField inputLastName = new JTextField();

                JLabel firstName = new JLabel("Fisrt Name");           
                JTextField inputFirstName = new JTextField();

                JLabel middleName = new JLabel("Middle Name");
                JTextField inputMiddleName = new JTextField();

                JLabel title = new JLabel("Title");
                JTextField inputTitle = new JTextField();

                JLabel idNumber = new JLabel("ID Number");
                JTextField inputIdNumber = new JTextField();

                JLabel cellphoneNumber = new JLabel("Cellphone Number");
                JTextField inputCellphoneNumber = new JTextField();

                JLabel hairColour  = new JLabel("Hair Colour");
                JTextField inputHairColour = new JTextField();
                
                JLabel eyeColour  = new JLabel("Eyes");
                JTextField inputEyeColour = new JTextField();
                
                JLabel dateOfBirth  = new JLabel("DOB");
                JTextField inputDOB = new JTextField();
                
                JLabel race  = new JLabel("Race");
                JTextField inputRace = new JTextField();
                
                JLabel sex  = new JLabel("Sex");
                JTextField inputSex = new JTextField();
                
                JLabel height  = new JLabel("Height");
                JTextField inputHeight = new JTextField();
                
                JLabel age  = new JLabel("Age");
                JTextField inputAge = new JTextField();
                
                panelCenter.add(lastName);
                panelCenter.add(inputLastName);
                
                panelCenter.add(firstName);
                panelCenter.add(inputFirstName);
                
                panelCenter.add(middleName);
                panelCenter.add(inputMiddleName);
                
                panelCenter.add(title);
                panelCenter.add(inputTitle);
                
                panelCenter.add(idNumber);
                panelCenter.add(inputIdNumber);
                
                panelCenter.add(cellphoneNumber);
                panelCenter.add(inputCellphoneNumber);
                
                panelCenter.add(hairColour);
                panelCenter.add(inputHairColour);
                
                panelCenter.add(eyeColour);
                panelCenter.add(inputEyeColour);
                
                panelCenter.add(dateOfBirth);
                panelCenter.add(inputDOB);
                
                panelCenter.add(race);
                panelCenter.add(inputRace);
                
                panelCenter.add(sex);
                panelCenter.add(inputSex);
                        
                panelCenter.add(height);
                panelCenter.add(inputHeight);
                
                panelCenter.add(age);
                panelCenter.add(inputAge);
                
                btnCheckCellAvailability.setVisible(false);
                btnAddPrisoner.setVisible(false);
                btnRemovePrisoner.setVisible(false);
                btnAddVisitor.setVisible(false);
                btnRemoveVisitor.setVisible(false);
                
                panelCenter.validate();
                mainFrame.add(panelCenter);
            }
            else {
            
            }
        }   
    });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
   
    }
}