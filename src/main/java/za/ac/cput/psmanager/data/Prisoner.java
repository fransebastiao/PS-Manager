package za.ac.cput.psmanager.data;

/**
 *
 * @author Franciel Sebastiao
 */
public class Prisoner {
    private String lastName;
    private String firstName;
    private String middleName;
    private String title;
    private int idNumber;
    private int cellphoneNumber;
    private String hairColour;
    private String eyeColour;
    private String dateOfBirth;
    private String race;
    private String gender;
    private String height;
    private String weight;
    private int age;
    private String bookDate;
    private String religion;
    private String citizenship;
    private String city;
    private String address;
    private int zip;
    private int registerToCellNo;
    private String maritalStatus;
    private String bookedBy;
    private String facility;
    private int prisonerNumber;
    
    public Prisoner(){
    
    }
    
    public Prisoner(String lastName, String firstName, String middleName, String title,
                    int idNumber, int cellphoneNumber, String hairColour, String eyeColour,
                    String dateOfBirth, String race, String gender, String height, String weight,
                    int age, String bookDate, String religion, String citizenship, String city,
                    String address, int zip, int registerToCellNo, String maritalStatus, 
                    String bookedBy,String facility, int prisonerNumber){
    
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.title = title;
        this.idNumber = idNumber;
        this.cellphoneNumber = cellphoneNumber;
        this.hairColour = hairColour;
        this.eyeColour = eyeColour;
        this.dateOfBirth = dateOfBirth;
        this.race = race;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.age = age;
        this.bookDate = bookDate;
        this.religion = religion;
        this.citizenship = citizenship;
        this.city = city;
        this.address = address;
        this.zip = zip;
        this.registerToCellNo = registerToCellNo;
        this.maritalStatus = maritalStatus;
        this.bookedBy = bookedBy;
        this.facility = facility;
        this.prisonerNumber = prisonerNumber;
    }
    
    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public String getMiddleName(){
        return middleName;
    }
    
    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }
    
    public String getTitle(){
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public int getIdNumber(){
        return idNumber;
    }
    
    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    
    public int getCellphoneNumber(){
        return cellphoneNumber;
    }
    
    public void setCellphoneNumber(int cellphoneNumber) {
        this.cellphoneNumber = cellphoneNumber;
    }
    
    public String getHairColour(){
        return hairColour;
    }
    
    public void setHairColour(String hairColour) {
        this.hairColour = hairColour;
    }
    
    public String getEyeColour(){
        return eyeColour;
    }
    
    public void setEyeColour(String eyeColour) {
        this.eyeColour = eyeColour;
    }
    
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    
    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    public String getRace(){
        return race;
    }
    
    public void setRace(String race) {
        this.race = race;
    }
    
    public String getGender(){
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getHeight(){
        return height;
    }
    
    public void setHeight(String height) {
        this.height = height;
    }
    
    public String getWeight(){
        return weight;
    }
    
    public void setWeight(String weight) {
        this.weight = weight;
    }
    
    public int getAge(){
        return age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public String getBookDate(){
        return bookDate;
    }
    
    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }
    
    public String getReligion(){
        return religion;
    }
    
    public void setReligion(String religion) {
        this.religion = religion;
    }
    
    public String getCitizenship(){
        return citizenship;
    }
    
    public void setCitizenship(String citizenship) {
        this.citizenship = citizenship;
    }
    
    public String getCity(){
        return city;
    }
    
    public void setCity(String city) {
        this.city = city;
    }
    
    public String getAddress(){
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public int getZip(){
        return zip;
    }
    
    public void setZip(int zip) {
        this.zip = zip;
    }
    
    public int getRegisterToCellNo(){
        return registerToCellNo;
    }
    
    public void setRegisterToCell(int registerToCellNo) {
        this.registerToCellNo = registerToCellNo;
    }
    
    public String getMaritalStatus(){
        return maritalStatus;
    }
    
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }
    
    public String getBookedBy(){
        return bookedBy;
    }
    
    public void setBookedBy(String bookedBy) {
        this.bookedBy = bookedBy;
    }
    public String getFacility(){
        return facility;
    }  
    
    public void setFacility(String facility) {
        this.facility = facility;
    }
    
    public int getPrisonerNumber(){
        return prisonerNumber;
    }
    
    public void setPRisonerNumber(int prisonerNumber) {
        this.prisonerNumber = prisonerNumber;
    }
    
    @Override
    public String toString(){
        return "";
    }    
}

