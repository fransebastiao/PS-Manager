package za.ac.cput.psmanager.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import za.ac.cput.psmanager.InventoryManager;
import za.ac.cput.psmanager.data.Prisoner;
import za.ac.cput.psmanager.dbconnection.PsManagerDbConnection;
/**
 *
 * @author Franciel Sebastiao
 */
public class PrisonerDAO {
    
    public Prisoner submit(Prisoner prisoner) throws SQLException{
        String insertSQL = "INSERT INTO Prisoners (First_Name, Middle_Name, Last_Name,  Title, ID_Number, Cellphone_Number, Hair_Colour, Eye_Colour, DOB, Race, Gender, Height, Weight, Age, Book_Date, Religion, Citizenship, City, Address, Zip, Cell_Number, Marital_Status, Booked_By, Facility, Prisoner_Number)"
                + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? , ?)";
        Connection con = PsManagerDbConnection.prisonersConnection();
        int i = 1;
        int o;
        
        PreparedStatement mySmt = con.prepareStatement(insertSQL);
        
        mySmt.setString(1, prisoner.getFirstName(insertSQL));
        mySmt.setString(2, prisoner.getMiddleName(insertSQL));
        mySmt.setString(3, prisoner.getLastName(insertSQL));
        mySmt.setString(4, prisoner.getTitle(insertSQL));
        mySmt.setInt(5, prisoner.getIdNumber(i));
        mySmt.setInt(6, prisoner.getCellphoneNumber(i));
        mySmt.setString(7, prisoner.getHairlColour(insertSQL));
        mySmt.setString(8, prisoner.getEyeColour(insertSQL));
        mySmt.setString(9, prisoner.getDateOfBirth(insertSQL));
        mySmt.setString(10, prisoner.getRace(insertSQL));
        mySmt.setString(11, prisoner.getGender(insertSQL));
        mySmt.setString(12, prisoner.getHeight(insertSQL));
        mySmt.setString(13, prisoner.getWeight(insertSQL));
        mySmt.setInt(14, prisoner.getAge(i));
        mySmt.setString(15, prisoner.getBookDate(insertSQL));
        mySmt.setString(16, prisoner.getReligion(insertSQL));
        mySmt.setString(17, prisoner.getCitizenship(insertSQL));
        mySmt.setString(18, prisoner.getCity(insertSQL));
        mySmt.setString(19, prisoner.getAddress(insertSQL));
        mySmt.setInt(20, prisoner.getZip(i));
        mySmt.setInt(21, prisoner.getRegisterToCellNo(i));
        mySmt.setString(22, prisoner.getMaritalStatus(insertSQL));
        mySmt.setString(23, prisoner.getBookedBy(insertSQL));
        mySmt.setString(24, prisoner.getFacility(insertSQL));
        mySmt.setInt(25, prisoner.getPrisonerNumber(i));
        
        o = mySmt.executeUpdate();
        if(o > 0){
        return prisoner;
        }
        else {return null;}
    }
}
