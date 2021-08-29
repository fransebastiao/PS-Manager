/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.psmanager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import za.ac.cput.psmanager.data.Prisoner;
import za.ac.cput.psmanager.dao.PrisonerDAO;
/**
 *
 * @author jodykearns
 */
public class InventoryManager extends JFrame implements ActionListener{
    private JFrame mainFrame;
    private JPanel panelNorth, panelWest,panelCenter;
    
    private JLabel lblPicture;
    
    private JLabel lblCompanyName;
    
    private JButton btnInventory;
    private JButton btnPersonnel;
    private JButton btnSchedule;
    private JButton btnCriminal;
    private JButton btnJailCell;
    
    private JPanel panelBlank1,panelBlank2,panelBlank3,panelBlank4,panelBlank5;
    
    private Font font1;
    
    
    Insets btnInsets = new Insets(5,5,5,5);
    
    Prisoner prisoner;
    PrisonerDAO dao;
    

    public InventoryManager(){
        
        mainFrame = new JFrame("PS Manager");
        panelNorth = new JPanel();
        panelNorth.setBackground(new Color(27,78,164));
        panelWest = new JPanel();
        panelWest.setBackground(new Color(27,78,164));
        panelCenter = new JPanel();
        panelCenter.setBackground(Color.WHITE);
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int height = screenSize.height * 2 / 3;
        int width = screenSize.width * 2 / 3;
        mainFrame.setPreferredSize(new Dimension(width, height));
        
        font1 = new Font("Impact", Font.PLAIN,40);
        
        lblPicture = new JLabel(new ImageIcon("SAPS Logo.png"),SwingConstants.LEFT);
        lblPicture.setPreferredSize(new Dimension(100,100));
        lblPicture.setOpaque(false);
        
        
        lblCompanyName = new JLabel("PS MANAGER     ");
        lblCompanyName.setFont(font1);
        lblCompanyName.setForeground(new Color(253,245,104));
        
        btnInventory = new JButton("INVENTORY");
        btnInventory.setForeground(Color.BLACK);
        btnInventory.setMargin(btnInsets);


        btnPersonnel = new JButton("PERSONNEL");
        btnPersonnel.setForeground(Color.BLACK);
        btnPersonnel.setMargin(btnInsets);
        
        btnSchedule = new JButton("SCHEDULE");
        btnSchedule.setForeground(Color.BLACK);
        btnSchedule.setMargin(btnInsets);

        btnCriminal = new JButton("CRIMINAL");
        btnCriminal.setForeground(Color.BLACK);
        btnCriminal.setMargin(btnInsets);

        btnJailCell = new JButton("JAIL CELL");
        btnJailCell.setForeground(Color.BLACK);
        btnJailCell.setMargin(btnInsets);
        
        panelBlank1 = new JPanel();
        panelBlank1.setBackground(new Color(27,78,164));
        panelBlank2 = new JPanel();
        panelBlank2.setBackground(new Color(27,78,164));
        panelBlank3 = new JPanel();
        panelBlank3.setBackground(new Color(27,78,164));
        panelBlank4 = new JPanel();
        panelBlank4.setBackground(new Color(27,78,164));
        panelBlank5 = new JPanel();
        panelBlank5.setBackground(new Color(27,78,164));
        
        
    }
    
    public void runInventoryManager(){
        
        panelNorth.setLayout(new GridLayout(1,2));
        panelWest.setLayout(new GridLayout(10, 1));
        panelCenter.setLayout(new GridLayout(6, 6));
        
        
        mainFrame.add(panelNorth, BorderLayout.NORTH);
        mainFrame.add(panelWest, BorderLayout.WEST);
        mainFrame.add(panelCenter, BorderLayout.CENTER);
        
        panelNorth.add(lblPicture);
        panelNorth.add(lblCompanyName);
        
        panelWest.add(panelBlank1);
        panelWest.add(btnInventory);
        panelWest.add(panelBlank2);
        panelWest.add(btnCriminal);
        panelWest.add(panelBlank3);
        panelWest.add(btnJailCell);
        panelWest.add(panelBlank4);
        panelWest.add(btnPersonnel);
        panelWest.add(panelBlank5);
        panelWest.add(btnSchedule);
        

      
        mainFrame.addWindowListener(new WindowAdapter(){
        @Override
        public void windowClosing(WindowEvent e){
            System.exit(0);
        }
    });
        
        mainFrame.pack();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
        
        btnJailCell.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent click) {
                    if(click.getSource()== btnJailCell){
                        JButton btnRegisterCell = new JButton ("Register Cell");
                        JButton btnCheckCellAvailability = new JButton ("Check Cell Availability");
                        JButton btnSearch = new JButton ("Search");
                        JButton btnAddPrisoner = new JButton ("Add Prisoner");
                        JButton btnViewPrisoner = new JButton ("View Prisoner's Information");
                        JButton btnAddVisitor = new JButton ("Add Visitor");
                        JButton btnRemoveVisitor = new JButton ("Remove Visitor");

                        panelCenter.setLayout(new GridLayout(7, 1, 0, 0));

                        panelCenter.add(btnRegisterCell);
                        panelCenter.add(btnCheckCellAvailability);
                        panelCenter.add(btnSearch);
                        panelCenter.add(btnAddPrisoner);
                        panelCenter.add(btnViewPrisoner);
                        panelCenter.add(btnAddVisitor);
                        panelCenter.add(btnRemoveVisitor);           
                        panelCenter.validate();
                     
            btnRegisterCell.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent click) {        
                    if (click.getSource()== btnRegisterCell){
                        JLabel register = new JLabel("Register Cell");
                        
                        btnRegisterCell.setVisible(false);
                        btnCheckCellAvailability.setVisible(false);
                        btnSearch.setVisible(false);
                        btnAddPrisoner.setVisible(false);
                        btnViewPrisoner.setVisible(false);
                        btnAddVisitor.setVisible(false);
                        btnRemoveVisitor.setVisible(false);
                            
                        panelCenter.setLayout(new FlowLayout());
                            
                        panelCenter.add(register);
                        panelCenter.validate();
                    }
                }                   
            });
            btnAddPrisoner.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent click) {        
                    if (click.getSource()== btnAddPrisoner){
                                                
                        btnRegisterCell.setVisible(false);
                        btnCheckCellAvailability.setVisible(false);
                        btnSearch.setVisible(false);
                        btnAddPrisoner.setVisible(false);
                        btnViewPrisoner.setVisible(false);
                        btnAddVisitor.setVisible(false);
                        btnRemoveVisitor.setVisible(false);
                        
                        JLabel header = new JLabel("New Booking");
                        
                        JLabel lastName = new JLabel("Last Name");
                        JTextField inputLastName = new JTextField();

                        JLabel firstName = new JLabel("Fisrt Name");           
                        JTextField inputFirstName = new JTextField();

                        JLabel middleName = new JLabel("Middle Name");
                        JTextField inputMiddleName = new JTextField();
                                               
                        JLabel title = new JLabel("Title");
                        JComboBox inputTitle = new JComboBox();
                        inputTitle.addItem("MR");
                        inputTitle.addItem("MRS");
                        inputTitle.addItem("MS");
                        inputTitle.addItem("MISS");
                        inputTitle.addItem("DR");
                        inputTitle.addItem("PROFESSOR");

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

                        JLabel gender  = new JLabel("Gender");
                        JComboBox inputGender = new JComboBox();
                        inputGender.addItem("F");
                        inputGender.addItem("M");
                        

                        JLabel height  = new JLabel("Height");
                        JTextField inputHeight = new JTextField();
                        
                        JLabel weight  = new JLabel("Weight");
                        JTextField inputWeight = new JTextField();

                        JLabel age  = new JLabel("Age");
                        JTextField inputAge = new JTextField();
                        
                        JLabel bookDate  = new JLabel("Book Date");
                        JTextField inputBookDate = new JTextField();
                        
                        JLabel religion  = new JLabel("Religion");
                        JTextField inputReligion = new JTextField();
                        
                        JLabel citizenship  = new JLabel("Citizenship");
                        JTextField inputCitizenship = new JTextField();
                        
                        JLabel city  = new JLabel("City");
                        JTextField inputCity = new JTextField();
                        
                        JLabel address  = new JLabel("Address");
                        JTextField inputAddress = new JTextField();
                        
                        JLabel zip  = new JLabel("ZIP");
                        JTextField inputZip = new JTextField();
                        
                        JLabel registerToCellNo  = new JLabel("Register to cell No.");
                        JTextField inputRegisterToCellNo = new JTextField();
                        
                        JLabel maritalStatus  = new JLabel("Marital Status");
                        JTextField inputMaritalStatus = new JTextField();
                        
                        JLabel bookedBy = new JLabel("Booked by");
                        JTextField inputBookedBy = new JTextField();
                        
                        JLabel facility = new JLabel("Facility");
                        JTextField inputFacility = new JTextField();
                        
                        JLabel prisonerNumber = new JLabel("Prisoner Number");
                        JTextField inputPrisonerNumber = new JTextField();
                         
                        JButton back = new JButton("Back");
                        JButton submit = new JButton("Submit");
                        
                        JPanel panelCenter1 = new JPanel();
                        panelCenter1.setBackground(Color.WHITE);
                        JPanel panelCenter2 = new JPanel();
                        panelCenter2.setBackground(Color.WHITE);
                        JPanel panelCenter3 = new JPanel();
                        panelCenter3.setBackground(Color.WHITE);
                        JPanel panelCenter4 = new JPanel();
                        panelCenter4.setBackground(Color.WHITE);
                        JPanel panelCenter5 = new JPanel();
                        panelCenter5.setBackground(Color.WHITE);
                        JPanel panelCenter6 = new JPanel();
                        panelCenter6.setBackground(Color.WHITE);
                        JPanel panelCenter7 = new JPanel();
                        panelCenter7.setBackground(Color.WHITE);
                        
                        panelCenter.setLayout(null);
                        panelCenter1.setLayout(new FlowLayout(FlowLayout.CENTER));
                        panelCenter1.setLocation(400, 5);
                        panelCenter1.setSize(80, 50);
                        panelCenter2.setLayout(new GridLayout(2, 3, 70, 10));
                        panelCenter2.setLocation(60, 35);
                        panelCenter2.setSize(700, 50);
                        panelCenter3.setLayout(new GridLayout(2, 4, 10, 10));
                        panelCenter3.setLocation(60, 90);
                        panelCenter3.setSize(700, 50);
                        panelCenter4.setLayout(new GridLayout(2, 7, 10, 10));
                        panelCenter4.setLocation(60, 145);
                        panelCenter4.setSize(700, 50);
                        panelCenter5.setLayout(new GridLayout(2, 6, 10, 10));
                        panelCenter5.setLocation(60, 205);
                        panelCenter5.setSize(700, 50);
                        panelCenter6.setLayout(new GridLayout(2, 5, 10, 10));
                        panelCenter6.setLocation(60, 265);
                        panelCenter6.setSize(700, 50);
                        panelCenter7.setLayout(new GridLayout(1, 2, 200, 0));  
                        panelCenter7.setLocation(60, 325);
                        panelCenter7.setSize(700, 30);
                        
                        panelCenter1.add(header); 
                        panelCenter.add(panelCenter1);
                        panelCenter2.add(lastName); 
                        panelCenter2.add(firstName);
                        panelCenter2.add(middleName); 
                        panelCenter2.add(inputLastName);    
                        panelCenter2.add(inputFirstName);                   
                        panelCenter2.add(inputMiddleName);
                        panelCenter.add(panelCenter2);
                        panelCenter3.add(title);
                        panelCenter3.add(idNumber);
                        panelCenter3.add(cellphoneNumber);
                        panelCenter3.add(hairColour);
                        panelCenter3.add(inputTitle);                
                        panelCenter3.add(inputIdNumber);                        
                        panelCenter3.add(inputCellphoneNumber);                        
                        panelCenter3.add(inputHairColour);
                        panelCenter.add(panelCenter3);
                        panelCenter4.add(eyeColour);
                        panelCenter4.add(dateOfBirth);
                        panelCenter4.add(race);
                        panelCenter4.add(gender);
                        panelCenter4.add(height);
                        panelCenter4.add(weight);
                        panelCenter4.add(age);
                        panelCenter4.add(inputDOB);
                        panelCenter4.add(inputEyeColour);
                        panelCenter4.add(inputRace);                   
                        panelCenter4.add(inputGender);                        
                        panelCenter4.add(inputHeight);                        
                        panelCenter4.add(inputWeight);                       
                        panelCenter4.add(inputAge);
                        panelCenter.add(panelCenter4);
                        panelCenter5.add(bookDate);
                        panelCenter5.add(religion);
                        panelCenter5.add(citizenship);
                        panelCenter5.add(city);
                        panelCenter5.add(address);
                        panelCenter5.add(zip);
                        panelCenter5.add(inputBookDate);
                        panelCenter5.add(inputReligion);
                        panelCenter5.add(inputCitizenship);                       
                        panelCenter5.add(inputCity);                      
                        panelCenter5.add(inputAddress);                        
                        panelCenter5.add(inputZip);
                        panelCenter.add(panelCenter5);
                        panelCenter6.add(registerToCellNo);
                        panelCenter6.add(maritalStatus);
                        panelCenter6.add(bookedBy);
                        panelCenter6.add(facility);
                        panelCenter6.add(prisonerNumber);
                        panelCenter6.add(inputRegisterToCellNo);  
                        panelCenter6.add(inputMaritalStatus);                 
                        panelCenter6.add(inputBookedBy);                       
                        panelCenter6.add(inputFacility);     
                        panelCenter6.add(inputPrisonerNumber);
                        panelCenter.add(panelCenter6);
                        panelCenter7.add(back);
                        panelCenter7.add(submit);
                        panelCenter.add(panelCenter7);
                        panelCenter.revalidate();
                        panelCenter.setVisible(true);
                        
                        submit.addActionListener(new ActionListener(){
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                if (e.getSource()==submit){
                                    String lastName = inputLastName.getText();
                                    String firstName = inputFirstName.getText();
                                    String middleName = inputMiddleName.getText();
                                    String title = (String)inputTitle.getSelectedItem();
                                    int idNumber = Integer.parseInt(inputIdNumber.getText());
                                    int cellphoneNumber = Integer.parseInt(inputCellphoneNumber.getText());
                                    String hairColour = inputHairColour.getText();
                                    String eyeColour = inputEyeColour.getText();
                                    String dateOfBirth = inputDOB.getText();
                                    String race = inputRace.getText();
                                    String gender = (String) inputGender.getSelectedItem();
                                    String height = inputHeight.getText();
                                    String weight = inputWeight.getText();
                                    int age = Integer.parseInt(inputAge.getText());
                                    String bookDate = inputBookDate.getText();
                                    String religion = inputReligion.getText();
                                    String citizenship = inputCitizenship.getText();
                                    String city = inputCity.getText();
                                    String address = inputAddress.getText();
                                    int zip = Integer.parseInt(inputZip.getText());
                                    int registerToCellNo = Integer.parseInt(inputRegisterToCellNo.getText());
                                    String maritalStatus = inputMaritalStatus.getText();
                                    String bookedBy = inputBookedBy.getText();
                                    String facility = inputFacility.getText();
                                    int prisonerNumber = Integer.parseInt(inputPrisonerNumber.getText());
                                    
                                    Prisoner p = new Prisoner(lastName, firstName, middleName, title, idNumber, cellphoneNumber,
                                    hairColour, eyeColour, dateOfBirth, race, gender, height, weight, age, bookDate, religion, citizenship,
                                    city, address, zip, registerToCellNo, maritalStatus, bookedBy, facility, prisonerNumber);
                                    
                                    dao = new PrisonerDAO();
                                    
                                    try {
                                        prisoner = dao.submit(p);
                                    } catch (SQLException ex) {
                                        Logger.getLogger(InventoryManager.class.getName()).log(Level.SEVERE, null, ex);
                                    }
                                    if (prisoner.equals(p)){
                                        JOptionPane.showMessageDialog(null, "Prisoner added successfully");
                                    }
                                    else{
                                        JOptionPane.showMessageDialog(null, "ERROR: Prisoner could not be added");
                                    }
                                }     
                            }                   
                        });
                    }
                }                   
            });
            btnAddVisitor.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    btnRegisterCell.setVisible(false);
                    btnCheckCellAvailability.setVisible(false);
                    btnSearch.setVisible(false);
                    btnAddPrisoner.setVisible(false);
                    btnViewPrisoner.setVisible(false);
                    btnAddVisitor.setVisible(false);
                    btnRemoveVisitor.setVisible(false);
                    
                    JLabel vName = new JLabel("1. Name of visitor");
                    JTextField inputVName = new JTextField(50);

                    JLabel vId = new JLabel("2. Identification number (SA ID/Passport)");           
                    JTextField inputVId = new JTextField(30);

                    JLabel vContact = new JLabel("3. Contact Number (Mobile Number is preferred)");
                    JTextField inputVContact = new JTextField(30);
                                               
                    JLabel vEmail = new JLabel("4. Email Address");
                    JTextField inputVEmail = new JTextField(30);

                    JLabel vAddress = new JLabel("5. Home Address");
                    JTextField inputVAddress = new JTextField(30);

                    JLabel vOccupation = new JLabel("6. Occupation");
                    JTextField inputVOccupation = new JTextField(30);

                    JLabel pName  = new JLabel("7. Name of prisoner");
                    JTextField inputPName = new JTextField(30);

                    JLabel pNumber  = new JLabel("8. Prisoner Number");
                    JTextField inputPNumber = new JTextField(30);

                    JLabel vRelation  = new JLabel("9. Relationship to prisoner");
                    JTextField inputVRelation = new JTextField(30);

                    JLabel vReason  = new JLabel("10. Reason for Visit");
                    JTextField inputVReason = new JTextField(30);
                    
                    JLabel vRequest  = new JLabel("11. Is your request to visit "
                            + "supported by inmate's family member?");
                    JLabel vRequest2 = new JLabel("Please note that the inmate's "
                            + "family member supporting your request to visit must be a registered visitor.");
                    JRadioButton vR1=new JRadioButton("Yes");    
                    JRadioButton vR2=new JRadioButton("No");  
                    
                    JLabel vAcknowledgement  = new JLabel("12. Acknowledgement");
                    JCheckBox vAcknowledgementCB = new JCheckBox("I acknowledge that all information provided in this application"
                            + " is correct. I am aware that my application will be rejected if the information is found to be false.");
                        
                    JLabel vConsent  = new JLabel("13. Consent Required for Collection of Personal Data");
                    JCheckBox vConsentCB = new JCheckBox("By submitting this application form, "
                            + "I hereby give my consent to SPS to collect, use, and or disclose any personal data, "
                            + "which I have provided in the application form for the purpose of requesting to visit an inmate.");
                
                    JButton submit = new JButton("Submit");
                    
                    vR1.setBounds(75,50,100,30);    
                    vR2.setBounds(75,100,100,30);    
                    ButtonGroup bg=new ButtonGroup();
                    bg.add(vR1);bg.add(vR2);
                    
                    panelCenter.setLayout(new GridLayout(10,1,20,20));

                    Insets pci = new Insets(10, 10, 10, 10);
                    panelCenter.add(vName);
                    panelCenter.add(inputVName);
                    panelCenter.add(vId);
                    panelCenter.add(inputVId);
                    panelCenter.add(vContact);
                    panelCenter.add(inputVContact);
                    panelCenter.add(vEmail);
                    panelCenter.add(inputVEmail);
                    panelCenter.add(vAddress);
                    panelCenter.add(inputVAddress);
                    panelCenter.add(vOccupation);
                    panelCenter.add(inputVOccupation);
                    panelCenter.add(pName);
                    panelCenter.add(inputPName);
                    panelCenter.add(pNumber);
                    panelCenter.add(inputPNumber);
                    panelCenter.add(vRelation);
                    panelCenter.add(inputVRelation);
                    panelCenter.add(vReason);
                    panelCenter.add(inputVReason);
                    panelCenter.add(vRequest);
                    panelCenter.add(vRequest2);
                    panelCenter.add(vR1);
                    panelCenter.add(vR2); 
                    panelCenter.add(vAcknowledgement);
                    panelCenter.add(vAcknowledgementCB);
                    panelCenter.add(vConsent);
                    panelCenter.add(vConsentCB);
                    panelCenter.add(submit);
                    panelCenter.validate();

                }           
            });
            }
        }
        });
    }
                
    @Override
    public void actionPerformed(ActionEvent click){

    }
}