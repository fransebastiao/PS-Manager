package za.ac.cput.psmanager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import za.ac.cput.psmanager.InventoryManager;
import za.ac.cput.psmanager.data.Prisoner;
import za.ac.cput.psmanager.dbconnection.PsManagerDbConnection;
/**
 *
 * @author Franciel Sebastiao
 */
public class PrisonerDAO {
    
    private final Connection con;
    //private final Statement myStm;
    //private final PreparedStatement myStm;
    
    public PrisonerDAO() throws SQLException{
    this.con = PsManagerDbConnection.prisonersConnection();
    //this.myStm = this.con.createStatement();
    }
    
    public Prisoner create(Prisoner prisoner) throws SQLException{
        //Connect to the database
            try{
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                System.out.println("The connection was successful");
            }
            catch(ClassNotFoundException cnf){
                System.out.println(cnf.getMessage());
            }
        
       
        String insertSQL = "INSERT INTO Prisoners (First_Name, Middle_Name, Last_Name,  Title, ID_Number, Cellphone_Number, Hair_Colour, Eye_Colour, DOB, Race, Gender, Height, Weight, Age, Book_Date, Religion, Citizenship, City, Address, Zip, Cell_Number, Marital_Status, Booked_By, Facility, Prisoner_Number)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? , ?)";
      
        /*insertSQL = String.format(insertSQL, prisoner.getFirstName(), prisoner.getLastName(), prisoner.getMiddleName(),
                    prisoner.getTitle(), prisoner.getIdNumber(), prisoner.getCellphoneNumber(), prisoner.getHairColour(),
                    prisoner.getEyeColour(), prisoner.getDateOfBirth(), prisoner.getRace(), prisoner.getGender(),
                    prisoner.getHeight(), prisoner.getWeight(), prisoner.getAge(), prisoner.getBookDate(), prisoner.getReligion(),
                    prisoner.getCitizenship(), prisoner.getCity(), prisoner.getAddress(), prisoner.getZip(), prisoner.getRegisterToCellNo(),
                    prisoner.getMaritalStatus(), prisoner.getBookedBy(), prisoner.getFacility(), prisoner.getPrisonerNumber());
        */
        
        //mySmt.execute(insertSQL);
        
        //return prisoner;
        int i;
        
        PreparedStatement mySmt = con.prepareStatement(insertSQL);
        
        mySmt.setString(1, prisoner.getFirstName());
        mySmt.setString(2, prisoner.getMiddleName());
        mySmt.setString(3, prisoner.getLastName());
        mySmt.setString(4, prisoner.getTitle());
        mySmt.setInt(5, prisoner.getIdNumber());
        mySmt.setInt(6, prisoner.getCellphoneNumber());
        mySmt.setString(7, prisoner.getHairColour());
        mySmt.setString(8, prisoner.getEyeColour());
        mySmt.setString(9, prisoner.getDateOfBirth());
        mySmt.setString(10, prisoner.getRace());
        mySmt.setString(11, prisoner.getGender());
        mySmt.setString(12, prisoner.getHeight());
        mySmt.setString(13, prisoner.getWeight());
        mySmt.setInt(14, prisoner.getAge());
        mySmt.setString(15, prisoner.getBookDate());
        mySmt.setString(16, prisoner.getReligion());
        mySmt.setString(17, prisoner.getCitizenship());
        mySmt.setString(18, prisoner.getCity());
        mySmt.setString(19, prisoner.getAddress());
        mySmt.setInt(20, prisoner.getZip());
        mySmt.setInt(21, prisoner.getRegisterToCellNo());
        mySmt.setString(22, prisoner.getMaritalStatus());
        mySmt.setString(23, prisoner.getBookedBy());
        mySmt.setString(24, prisoner.getFacility());
        mySmt.setInt(25, prisoner.getPrisonerNumber());
        
        i = mySmt.executeUpdate(); 
        mySmt.close(); 
        if(i > 0){
           
        return prisoner;
        }
        else {return null;}
    }
    
    public ArrayList<Prisoner> getAllPrisoners() throws SQLException{
        ArrayList<Prisoner>prisoners = new ArrayList<>();
        
       try{
            String getAllSql = "Select * from Prisoners";
            PreparedStatement myStm = this.con.prepareStatement(getAllSql);
            ResultSet myRs = myStm.executeQuery();
                if (myRs != null){
                    while(myRs.next()){
                        System.out.println("Database table record: "
                        + myRs.getString(1)+""+ myRs.getString(2)+""+ myRs.getString(3)+""+ myRs.getString(4)+""
                        + myRs.getInt(5)+""+ myRs.getInt(6)+""+ myRs.getString(7)+""+ myRs.getString(8)+""
                        + myRs.getString(9)+""+ myRs.getString(10)+""+ myRs.getString(11)+""+ myRs.getString(12)+""
                        + myRs.getString(13)+""+ myRs.getInt(14)+""+ myRs.getString(15)+""+ myRs.getString(16)+""
                        + myRs.getString(17)+""+ myRs.getString(18)+""+ myRs.getString(19)+""+ myRs.getInt(20)+""
                        + myRs.getInt(21)+""+ myRs.getString(22)+""+ myRs.getString(23)+""+ myRs.getString(24)+""+myRs.getInt(25));

                        prisoners.add(new Prisoner(myRs.getString("First_Name"), myRs.getString("Middle_Name"), myRs.getString("Last_Name"), myRs.getString("Title"),
                        myRs.getInt("Id_Number"), myRs.getInt("Cellphone_Number"),myRs.getString("Hair_Colour"), myRs.getString("Eye_Colour"), myRs.getString("DOB"), 
                        myRs.getString("Race"), myRs.getString("Gender"), myRs.getString("Height"), myRs.getString("Weight"), myRs.getInt("Age"), myRs.getString("Book_Date"),
                        myRs.getString("Religion"), myRs.getString("Citizenship"), myRs.getString("City"), myRs.getString("Address"), myRs.getInt("ZIP"), myRs.getInt("Cell_Number"), 
                        myRs.getString("Marital_Status"), myRs.getString("Booked_By"), myRs.getString("Facility"), myRs.getInt("Prisoner_Number")));
                    }
                myRs.close();
                myStm.close();
                }
                
        } 
        catch (SQLException ex) {
            Logger.getLogger(PrisonerDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return prisoners;
    }
    
    public boolean update(Prisoner prisoner){

    try {
        PreparedStatement mySmt = this.con.prepareStatement("UPDATE PROJECT SET First_Name = ?, Middle_Name = ?, Last_Name = ?,  Title = ?, ID_Number= ?, Cellphone_Number = ?, Hair_Colour = ?, Eye_Colour = ?, DOB = ?, Race = ?, Gender = ?, Height = ?, Weight = ?, Age = ?, Book_Date = ?, Religion = ?, Citizenship = ?, City = ?, Address = ?, Zip = ?, Cell_Number = ?, Marital_Status = ?, Booked_By = ?, Facility = ?, Prisoner_Number = ?)");

        mySmt.setString(1, prisoner.getFirstName());
        mySmt.setString(2, prisoner.getMiddleName());
        mySmt.setString(3, prisoner.getLastName());
        mySmt.setString(4, prisoner.getTitle());
        mySmt.setInt(5, prisoner.getIdNumber());
        mySmt.setInt(6, prisoner.getCellphoneNumber());
        mySmt.setString(7, prisoner.getHairColour());
        mySmt.setString(8, prisoner.getEyeColour());
        mySmt.setString(9, prisoner.getDateOfBirth());
        mySmt.setString(10, prisoner.getRace());
        mySmt.setString(11, prisoner.getGender());
        mySmt.setString(12, prisoner.getHeight());
        mySmt.setString(13, prisoner.getWeight());
        mySmt.setInt(14, prisoner.getAge());
        mySmt.setString(15, prisoner.getBookDate());
        mySmt.setString(16, prisoner.getReligion());
        mySmt.setString(17, prisoner.getCitizenship());
        mySmt.setString(18, prisoner.getCity());
        mySmt.setString(19, prisoner.getAddress());
        mySmt.setInt(20, prisoner.getZip());
        mySmt.setInt(21, prisoner.getRegisterToCellNo());
        mySmt.setString(22, prisoner.getMaritalStatus());
        mySmt.setString(23, prisoner.getBookedBy());
        mySmt.setString(24, prisoner.getFacility());
        mySmt.setInt(25, prisoner.getPrisonerNumber());
        
        return mySmt.executeUpdate()>0;

        /*if(resultSet==0) {
            System.out.println("The Prisoner was not updated ");
            this.con.close();
            return false;
        }
        else {
            System.out.println("Prisoner updated" + '\n'+  prisoner.toString());
            this.con.close();
            return true;
        }*/

    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}
    
   public boolean delete(int IdNumber) {

    try {
        PreparedStatement mySmt = this.con.prepareStatement("DELETE FROM Prisoner WHERE Id_Number=?");
        mySmt.setInt(1, IdNumber);
       
        return mySmt.executeUpdate()>0;

    } catch (SQLException e) {
        e.printStackTrace();
    }
    return false;
}
    
    public void close() throws SQLException{
        this.con.close();
    }
}
