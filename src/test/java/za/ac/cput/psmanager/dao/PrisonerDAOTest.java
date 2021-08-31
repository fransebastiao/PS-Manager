/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.cput.psmanager.dao;

import java.sql.SQLException;
import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import za.ac.cput.psmanager.data.Prisoner;

/**
 *
 * @author Franciel Sebastiao
 */
public class PrisonerDAOTest {
    
    private PrisonerDAO dao;
    
    public PrisonerDAOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() throws SQLException {
        this.dao = new PrisonerDAO();
    }
    
    @AfterEach
    public void tearDown() throws SQLException {
        this.dao.close();
    }

    /**
     * Test of submit method, of class PrisonerDAO.
     */
    @Test
    public void testCreate() throws Exception {
        System.out.println("create");
        Prisoner prisoner = new Prisoner("Ronaldo","Cristiano","","Mr",53230,93320,"White","Blue","1994-09-30",
        "White", "M", "1,89m","79kg",24,"2020-01-14","","South Africa","Cape Town","39 arhs st",0342,
        554, "Married","Officer Carl Johnson", "Rondebosh PS",43);
        Prisoner expResult = prisoner;
        Prisoner result = this.dao.create(prisoner);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllPrisoners method, of class PrisonerDAO.
     */
    @Test
    public void testGetAllPrisoners() throws SQLException {
        System.out.println("getAllPrisoners");
        ArrayList<Prisoner> expResult = this.dao.getAllPrisoners();
        ArrayList<Prisoner> result = this.dao.getAllPrisoners();
        assertEquals(expResult.size(), result.size());
    }

    /**
     * Test of update method, of class PrisonerDAO.
     * @throws java.sql.SQLException
     */
    @Test
    public void testUpdate() throws SQLException {
        System.out.println("update");
        Prisoner prisoner = new Prisoner("August","Sabrina","","Miss",83902,42934,"Blonde","Blue","1989-05-07",
        "White", "F", "1,53m","70kg",32,"2015-12-31","","South Africa","Cape Town","73 Rios ave",6478,
        14, "Maried","Officer Margie Simpson", "Maitland PS",79);
        boolean expResult = false;
        boolean result = this.dao.update(prisoner);
        assertEquals(expResult, result);
    }

    /**
     * Test of delete method, of class PrisonerDAO.
     * @throws java.sql.SQLException
     */
    @Test
    public void testDelete() throws SQLException {
        System.out.println("delete");
        int IdNumber = 0;
        boolean expResult = false;
        boolean result = this.dao.delete(IdNumber);
        assertEquals(expResult, result);
    }
    
}
